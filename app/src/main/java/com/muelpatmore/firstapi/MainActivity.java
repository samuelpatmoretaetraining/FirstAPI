package com.muelpatmore.firstapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.muelpatmore.firstapi.data.network.services.RequestInterface;
import com.muelpatmore.firstapi.data.network.services.ServerConnection;
import com.muelpatmore.firstapi.data.network.constants.CakeModel;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    //private RequestInterface requestInterface;

    private ArrayList<CakeModel> mCakeList;
    private RecyclerView recyclerView;


    public void initRecyclerView() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        Log.d("initRecyclerView", recyclerView.toString());
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        Log.d("initRecyclerView", recyclerView.toString());

        // give data, model and view.
        recyclerView.setAdapter(new CakeAdapter(mCakeList, R.layout.cake_item, getApplicationContext()));
        Log.d("initRecyclerView", recyclerView.toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCakeList = new ArrayList<CakeModel>();

        Log.i("onCreate()", "reading local cake list");
        for(CakeModel c : mCakeList) Log.i("local cake", c.getTitle());

        //initRecyclerView();

    }


}
