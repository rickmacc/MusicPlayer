package org.eightfoldpath.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        TextView view = (TextView) findViewById(R.id.button_now_playing);
        view.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent nowPlayingIntent = new Intent(SongActivity.this, NowPlayingActivity.class);
                        startActivity(nowPlayingIntent);
                    }
                }
        );

    }
}
