package com.pachchoka.youtubeplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonPlaySingle = (Button) findViewById(R.id.buttonPlaySingle);
        Button buttonStandalone = (Button) findViewById(R.id.buttonStandalone);

        buttonPlaySingle.setOnClickListener(this);
        buttonStandalone.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;

        switch (view.getId()) {
            case R.id.buttonPlaySingle:
                intent = new Intent(this, YoutubeActivity.class);
                break;
            case R.id.buttonStandalone:
                intent = new Intent(this, StandaloneActivity.class);
                break;
            default:
        }

        if (intent != null) {
            startActivity(intent);
        }
    }


}
