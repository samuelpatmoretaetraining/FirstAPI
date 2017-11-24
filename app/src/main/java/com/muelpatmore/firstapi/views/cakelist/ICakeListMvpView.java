package com.muelpatmore.firstapi.views.cakelist;

import com.muelpatmore.firstapi.data.network.constants.CakeModel;
import com.muelpatmore.firstapi.views.ui.base.MvpView;

import java.util.List;

/**
 * Created by Samuel on 24/11/2017.
 */

public interface ICakeListMvpView extends MvpView {
    void onFetchDataSuccess(List<CakeModel> cakeModelList);
    void onFetchDataError(String Message);
}
