package com.apps.swidiy.myselfapps;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Vector;

public class FragmentMusicVideo extends Fragment {
    RecyclerView recyclerView;
    Vector<YouTubeVideos> youtubeVideos = new Vector<YouTubeVideos>();
    private ProgressDialog progressDialog;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_musicvideo, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));

        youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/sJUGAIf1Px0\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ffxKSjUwKdU\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/_Zgc12yL5ss\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/=rBG5L7UsUxA\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideos.add(new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/=BEFkS7Grhkc\" frameborder=\"0\" allowfullscreen></iframe>"));

        videoAdapter videoAdapter = new videoAdapter(youtubeVideos);

        recyclerView.setAdapter(videoAdapter);

        return view;

    }
}

