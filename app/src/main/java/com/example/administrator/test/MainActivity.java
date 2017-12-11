package com.example.administrator.test;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


/**
 * 使用MediaPlayer播放音频
 * 2017年12月11日17:28:46
 */

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMediaPlayer = MediaPlayer.create(this, R.raw.xpg);
    }

    public void playMusic(View view) {
        mMediaPlayer.setLooping(true);
        mMediaPlayer.start();
    }
}
