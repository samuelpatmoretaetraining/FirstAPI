package com.muelpatmore.firstapi.views.cakelist;

import com.muelpatmore.firstapi.data.IDataManager;
import com.muelpatmore.firstapi.views.ui.base.BasePresenter;
import com.muelpatmore.firstapi.views.ui.utils.rx.SchedulerProvider;

import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by Samuel on 24/11/2017.
 */

public class CakeListPresenter<V extends ICakeListMvpView>
        extends BasePresenter<V>
        implements ICakeListMvpPresenter<V> {

    public CakeListPresenter(IDataManager dataManager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void onCallCakeList() {

    }
}
