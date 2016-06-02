package com.ntpuee1.ntpuee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void naviButtClick(View view) {
        Intent intent = new Intent();
        intent.setClass(Main2Activity.this  , MainActivity.class);
        startActivity(intent);
    }

    public void ClubButton(View view) {
        Intent intent = new Intent();
        intent.setClass(Main2Activity.this  , ClubActivity.class);
        startActivity(intent);
    }
}
