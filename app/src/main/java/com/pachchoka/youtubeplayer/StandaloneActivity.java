package com.pachchoka.youtubeplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

/**
 * Created by shahed on 1/26/17.
 */

public class StandaloneActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);

        Button buttonPlayVideo = (Button) findViewById(R.id.buttonPlayVideo);
        Button buttonPlayPlaylist = (Button) findViewById(R.id.buttonPlayList);

        // way 1: useful for multiple widget
        buttonPlayPlaylist.setOnClickListener(this);
        buttonPlayVideo.setOnClickListener(this);

//        // way 2:
//        View.OnClickListener onClickListener=new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//
//            }
//        };
//        buttonPlayPlaylist.setOnClickListener(onClickListener);
//        buttonPlayVideo.setOnClickListener(onClickListener);
//
//        // way 3:
//        buttonPlayVideo.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.buttonPlayVideo:
                intent = YouTubeStandalonePlayer.createVideoIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID
                        , 0, true, false);
                break;
            case R.id.buttonPlayList:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_PLAYLIST
                        , 0, 0, true, true);

            default:
        }

        if (intent != null) {
            startActivity(intent);
        }
    }

}
