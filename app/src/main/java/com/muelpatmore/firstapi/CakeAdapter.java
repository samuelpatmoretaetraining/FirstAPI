package com.muelpatmore.firstapi;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.muelpatmore.firstapi.data.network.constants.CakeModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CakeAdapter extends RecyclerView.Adapter<CakeAdapter.MyViewHolder> {

    private ArrayList<CakeModel> cakeList;
    private int row_cake;
    private Context applicationContext;

    public CakeAdapter(ArrayList<CakeModel> cakeList, int row_customer, Context applicationContext) {
        this.cakeList = cakeList;
        this.row_cake = row_customer;
        this.applicationContext = applicationContext;
    }

    // creates views
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // get layout taht si passed from from app comtext
        // inflate row from this context, from thsi parent in this pattern
        View view = LayoutInflater.from(applicationContext).inflate(R.layout.cake_item, parent, false);

        //viewholder init view elements and is then passed back
        return new MyViewHolder(view);
    }

    // binds data to view
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        // collect data from Realm item and plug into View
        holder.tvTitle.setText(cakeList.get(position).getTitle());
        holder.tvDescription.setText(cakeList.get(position).getDesc());
        Picasso.with(holder.ivImage.getContext()).load(cakeList.get(position).getImage()).into(holder.ivImage);
        //holder.ivImage.setImageBitmap();
    }

    @Override
    public int getItemCount() {
        return cakeList.size();
    }

    // inits row elements
    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle, tvDescription;
        ImageView ivImage;
        public MyViewHolder(View itemView) {
            super(itemView);

            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            tvDescription = (TextView) itemView.findViewById(R.id.tvDescription);
            ivImage = (ImageView) itemView.findViewById(R.id.ivImage);

        }
    }
}

