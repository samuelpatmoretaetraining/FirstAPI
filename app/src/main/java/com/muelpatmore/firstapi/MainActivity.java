package com.muelpatmore.firstapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.muelpatmore.firstapi.data.AppDataManager;
import com.muelpatmore.firstapi.data.network.services.RequestInterface;
import com.muelpatmore.firstapi.data.network.services.ServerConnection;
import com.muelpatmore.firstapi.data.network.constants.CakeModel;
import com.muelpatmore.firstapi.views.cakelist.CakeListPresenter;
import com.muelpatmore.firstapi.views.cakelist.ICakeListMvpView;
import com.muelpatmore.firstapi.views.ui.utils.rx.AppSchedulerProvider;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity implements ICakeListMvpView {

    private RecyclerView recyclerView;
    private CakeListPresenter<MainActivity> cakeListPresenter;


    public void initRecyclerView() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        Log.d("initRecyclerView", recyclerView.toString());
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        Log.d("initRecyclerView", recyclerView.toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
        initializePresenter();
        cakeListPresenter.onCallCakeList();
    }

    public void initializePresenter() {
        cakeListPresenter = new CakeListPresenter<>(new AppDataManager(), new AppSchedulerProvider(), new CompositeDisposable());
        cakeListPresenter.onAttach(this);
    }

    @Override
    public void onFetchDataSuccess(List<CakeModel> cakeModels) {
        recyclerView.setAdapter(new CakeAdapter((ArrayList<CakeModel>) cakeModels, R.layout.cake_item, getApplicationContext()));
        //recyclerView.setAdapter(new CakeAdapter(mCakeList, R.layout.cake_item, getApplicationContext()));
    }

    @Override
    public void onFetchDataError(String Message) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void openActivityOnTokenExpire() {

    }

    @Override
    public void onError(int resId) {

    }

    @Override
    public void onError(String message) {

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void showMessage(int resId) {

    }

    @Override
    public boolean isNetworkConnected() {
        return false;
    }

    @Override
    public void hideKeyboard() {

    }
}
