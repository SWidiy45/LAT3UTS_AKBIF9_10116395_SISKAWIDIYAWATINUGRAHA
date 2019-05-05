package com.apps.swidiy.myselfapps;

public class GaleryRecyclerViewItem {

    // Save car image resource id.
    private int GaleryImageId;

    public GaleryRecyclerViewItem(int GaleryImageId) {
        this.GaleryImageId = GaleryImageId;
    }


    public int getGaleryImageId() {
        return GaleryImageId;
    }

    public void setGaleryImageId(int GaleryImageId) {
        this.GaleryImageId = GaleryImageId;
    }
}
