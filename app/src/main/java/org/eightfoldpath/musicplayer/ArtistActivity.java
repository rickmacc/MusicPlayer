package org.eightfoldpath.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        TextView view = (TextView) findViewById(R.id.button_now_playing);
        view.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent nowPlayingIntent = new Intent(ArtistActivity.this, NowPlayingActivity.class);
                        startActivity(nowPlayingIntent);
                    }
                }
        );

    }
}
