package com.apps.swidiy.myselfapps;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import java.util.List;

public class GaleryRecyclerViewDataAdapter extends RecyclerView.Adapter<GaleryRecyclerViewItemHolder> {
    private List<GaleryRecyclerViewItem> GalleryItemList;

    public GaleryRecyclerViewDataAdapter(List<GaleryRecyclerViewItem> GalleryItemList) {
        this.GalleryItemList = GalleryItemList;
    }


    @Override
    public GaleryRecyclerViewItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Get LayoutInflater object.
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        // Inflate the RecyclerView item layout xml.
        View GaleryItemView = layoutInflater.inflate(R.layout.gallery_list, parent, false);

        // Get car title text view object.

        // Get car image view object.
        final ImageView GaleryImageView = (ImageView) GaleryItemView.findViewById(R.id.card_view_image);
        // When click the image.


        // Create and return our custom Car Recycler View Item Holder object.
        GaleryRecyclerViewItemHolder ret = new GaleryRecyclerViewItemHolder(GaleryItemView);
        return ret;
    }


    @Override
    public void onBindViewHolder(@NonNull GaleryRecyclerViewItemHolder holder, int position) {
        if (GalleryItemList != null) {
            // Get car item dto in list.
            GaleryRecyclerViewItem GaleryItem = GalleryItemList.get(position);

            if (GaleryItem != null) {
                // Set car item title.

                // Set car image resource id.
                holder.getGaleryImageView().setImageResource(GaleryItem.getGaleryImageId());
            }
        }
    }

    @Override
    public int getItemCount() {
        int ret = 0;
        if (GalleryItemList != null) {
            ret = GalleryItemList.size();
        }
        return ret;
    }
}
