package com.muelpatmore.firstapi.data.network;

import com.muelpatmore.firstapi.data.network.constants.CakeModel;
import com.muelpatmore.firstapi.data.network.services.RequestInterface;
import com.muelpatmore.firstapi.data.network.services.ServerConnection;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by Samuel on 24/11/2017.
 */

public class AppApiHelper implements ApiHelper {

    private RequestInterface requestInterface;

    public AppApiHelper() {
        // dependency upon ServerConnection class (will be solved with Dagger next week)
        requestInterface = ServerConnection.getServerConnection();
    }

    @Override
    public Observable<List<CakeModel>> getFromApi_CakeList() {
        return requestInterface.getCakesList();
    }
}
