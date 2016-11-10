package com.fuicuiedu.idedemo.videoplayerdemo.DemoC;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.fuicuiedu.idedemo.videoplayerdemo.R;
import com.fuicuiedu.idedemo.videoplayerdemo.VideoUrlRes;

public class DemoCactivity extends AppCompatActivity {
private VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_c);
        videoView = (VideoView) findViewById(R.id.main_vv);
        videoView.setVideoPath(VideoUrlRes.getTestVideo1());
        MediaController mediaController = new MediaController(this);
        mediaController.setPrevNextListeners(null,null);
        videoView.setMediaController(mediaController);
        videoView.start();
    }
}











