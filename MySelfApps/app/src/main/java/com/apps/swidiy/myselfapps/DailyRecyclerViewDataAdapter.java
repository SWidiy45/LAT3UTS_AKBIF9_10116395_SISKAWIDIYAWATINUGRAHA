package com.apps.swidiy.myselfapps;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class DailyRecyclerViewDataAdapter  extends RecyclerView.Adapter<DailyRecyclerViewItemHolder> {
    private List<DailyRecyclerViewItem> DailyItemList;

    public DailyRecyclerViewDataAdapter(List<DailyRecyclerViewItem> DailyItemList) {
        this.DailyItemList = DailyItemList;
    }


    @Override
    public DailyRecyclerViewItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Get LayoutInflater object.
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        // Inflate the RecyclerView item layout xml.
        View DailyItemView = layoutInflater.inflate(R.layout.daily_activity_list, parent, false);

        // Get car title text view object.
        final TextView DailyTitleView = (TextView) DailyItemView.findViewById(R.id.card_view_image_title);
        // Get car image view object.
        final ImageView DailyImageView = (ImageView) DailyItemView.findViewById(R.id.card_view_image);
        // When click the image.


        // Create and return our custom Car Recycler View Item Holder object.
        DailyRecyclerViewItemHolder ret = new DailyRecyclerViewItemHolder(DailyItemView);
        return ret;
    }


    @Override
    public void onBindViewHolder(@NonNull DailyRecyclerViewItemHolder holder, int position) {
        if (DailyItemList != null) {
            // Get car item dto in list.
            DailyRecyclerViewItem dailyItem = DailyItemList.get(position);

            if (dailyItem != null) {
                // Set car item title.
                holder.getDailyTitleText().setText(dailyItem.getDailyName());
                // Set car image resource id.
                holder.getDailyImageView().setImageResource(dailyItem.getDailyImageId());
            }
        }
    }

    @Override
    public int getItemCount() {
        int ret = 0;
        if (DailyItemList != null) {
            ret = DailyItemList.size();
        }
        return ret;
    }
}
