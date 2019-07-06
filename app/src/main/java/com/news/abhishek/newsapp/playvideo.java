package com.news.abhishek.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.VideoView;
import android.widget.MediaController;

import com.example.android.cricket.R;

public class playvideo extends AppCompatActivity {

    ImageButton imageButton;
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playvideo);

         videoView=findViewById(R.id.video_view);
         imageButton=findViewById(R.id.play_button);

    }

    public void playvid(View view)
    {
         videoView = findViewById(R.id.video_view);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        videoView.start();

        imageButton.setVisibility(View.INVISIBLE);


        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
    }
}


