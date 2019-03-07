package com.montjo.johnny.explorerquest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    // TODO: open media player
    //private MediaPlayer mMediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: add sound resource
        //mMediaPlayer= MediaPlayer.create(R.raw.);
        //mMediaPlayer.start();

        // Find button and set onClickListener
        Button btnStart = findViewById(R.id.button_start);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent to start Story Activity
                Intent characterSelectionIntent = new Intent(MainActivity.this, CharacterSelectionActivity.class);
                startActivity(characterSelectionIntent);

                // TODO: uncomment media controls
                //releasePlayer();
            }
        });
    }

    private void releasePlayer() {
        //if (mMediaPlayer != null) {
            //mMediaPlayer.release();
            //mMediaPlayer = null;
        //}
    }

    @Override
    protected void onStop() {
        super.onStop();

        // release media player
        //releasePlayer();
    }
}
