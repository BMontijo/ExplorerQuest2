package com.montjo.johnny.explorerquest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: add sound resource
        //MediaPlayer mediaPlayer = MediaPlayer.create(R.raw.);
        //mediaPlayer.start();

        // Find button and set onClickListener
        Button btnStart = findViewById(R.id.button_start);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: launch Story Activity
                // Intent to start Story Activity
                //Intent characterSeletionIntent = new Intent(MainActivity.this, // name of character select.class);

                //mediaPlayer.release();
                //mediaPlayer = null;
            }
        });
    }
}
