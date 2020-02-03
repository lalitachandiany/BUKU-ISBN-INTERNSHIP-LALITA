package com.example.lalitachandiany.monitoring;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class AboutActivity extends AppCompatActivity {
    private Button btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        VideoView videoView = findViewById(R.id.video_view);

        Button btnback = (Button) findViewById(R.id.button1);
        String videoPath = "android.resource://" + getPackageName() +"/" + R.raw.about;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        btnback.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                startActivity(new Intent(AboutActivity.this, HomeActivity.class));
                finish();
            }
        });
    }
}

