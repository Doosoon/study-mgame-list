package com.ds.mamegamelist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by doosoon on 2017-12-17.
 */

public class GameDataManager {

    private static final int GAME_ITEM_COUNT = 10;
    private String mTitles[] = {"삼국지 다이너스티 워", "천지를 먹다2",
            "Final Fight", "Captain Commando", "캐딜락과 공룡"};
    private int mNumber[] = {109, 95, 99, 102, 93};

    private int mImageTitleResIds[] = {R.drawable.dw_t, R.drawable.wf_t, R.drawable.ff_t, R.drawable.cc_t, R.drawable.cd_t};
    private int mImageContentResIds[] = {R.drawable.dw_c, R.drawable.wf_c, R.drawable.ff_c, R.drawable.cc_c, R.drawable.cd_c};

    private static GameDataManager mInstance;


    private List<GameData> mGameDataList = new ArrayList<>();

    public static GameDataManager getInstance() {
        if (mInstance == null) {
            mInstance = new GameDataManager();
        }
        return mInstance;
    }

    private GameDataManager() {
        for (int i = 0; i < GAME_ITEM_COUNT; i++) {
            GameData data = new GameData(mTitles[i % 5], mNumber[i % 5], mImageTitleResIds[i % 5], mImageContentResIds[i % 5]);
            mGameDataList.add(data);
        }

    }

    public GameData getData(int index) {
        return mGameDataList.get(index);
    }

    public int getCount() { return GAME_ITEM_COUNT; }

    public class GameData {
        public final int number;
        public final String title;
        public final int titleImageResId;
        public final int contentImageResId;

        public GameData(String title, int number, int resId1, int resId2) {
            this.title = title;
            this.number = number;
            titleImageResId = resId1;
            contentImageResId = resId2;
        }
    }
}
