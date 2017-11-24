package com.muelpatmore.firstapi.data.network;

import com.muelpatmore.firstapi.data.network.constants.CakeModel;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by Samuel on 24/11/2017.
 */

public interface ApiHelper {

    // Same as network request without GET/Post
    Observable<List<CakeModel>> getFromApi_CakeList();
}
