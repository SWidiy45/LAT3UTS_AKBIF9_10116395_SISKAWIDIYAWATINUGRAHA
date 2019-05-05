package com.apps.swidiy.myselfapps;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Gallery_Fragment extends Fragment {
    private List<GaleryRecyclerViewItem> GalleryItemList = null;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        initializeDailyItemList();

        RecyclerView GalleryRecyclerView = (RecyclerView)view.findViewById(R.id.card_view_recycler_list);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.getActivity(),2);
        GalleryRecyclerView.setLayoutManager(gridLayoutManager);


        GaleryRecyclerViewDataAdapter GaleryDataAdapter = new GaleryRecyclerViewDataAdapter(GalleryItemList);
        GalleryRecyclerView.setAdapter(GaleryDataAdapter);
        return view;
    }
    private void initializeDailyItemList()
    {
        if(GalleryItemList == null)
        {
            GalleryItemList = new ArrayList<GaleryRecyclerViewItem>();
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.g1));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.g2));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.g3));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.g4));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.g1));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.g2));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.g3));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.g4));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.g1));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.g2));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.g3));
            GalleryItemList.add(new GaleryRecyclerViewItem(R.drawable.g4));


        }
    }

}