package org.eightfoldpath.musicplayer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.net.URI;

import static android.provider.LiveFolders.INTENT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView view = (TextView) findViewById(R.id.button_now_playing);
        view.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                        startActivity(nowPlayingIntent);
                    }
                }
        );

        view = (TextView) findViewById(R.id.button_artists);
        view.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent artistIntent = new Intent(MainActivity.this, ArtistActivity.class);
                        startActivity(artistIntent);
                    }
                }
        );

        view = (TextView) findViewById(R.id.button_albums);
        view.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent albumIntent = new Intent(MainActivity.this, AlbumActivity.class);
                        startActivity(albumIntent);
                    }
                }
        );

        view = (TextView) findViewById(R.id.button_songs);
        view.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent songIntent = new Intent(MainActivity.this, SongActivity.class);
                        startActivity(songIntent);
                    }
                }
        );

        view = (TextView) findViewById(R.id.button_music_store);
        view.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent musicStoreIntent = new Intent(MainActivity.this, MusicStoreActivity.class);
                        startActivity(musicStoreIntent);
                    }
                }
        );

    }
}
