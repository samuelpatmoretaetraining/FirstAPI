package com.muelpatmore.firstapi.data;

import com.muelpatmore.firstapi.data.network.ApiHelper;
import com.muelpatmore.firstapi.data.network.AppApiHelper;
import com.muelpatmore.firstapi.data.network.constants.CakeModel;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by Samuel on 24/11/2017.
 */

public class AppDataManager implements IDataManager {

    private ApiHelper apiHelper;


    public AppDataManager() {
        apiHelper = new AppApiHelper();
    }

    @Override
    public Observable<List<CakeModel>> getFromApi_CakeList() {
        return null;
    }
}
