package com.fuicuiedu.idedemo.videoplayerdemo.DemoF;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fuicuiedu.idedemo.videoplayerdemo.R;

import io.vov.vitamio.widget.VideoView;

public class DemoFactivity extends AppCompatActivity  {

private VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_f);
        String path = "http://devimages.apple.com/iphone/samples/bipbop/bipbopall.m3u8";
        videoView = (VideoView) findViewById(R.id.videoView);
        videoView.setVideoPath(path);
        videoView.start();

    }
}
