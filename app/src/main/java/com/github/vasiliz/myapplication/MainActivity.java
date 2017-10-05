package com.github.vasiliz.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //add comment
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //destroy activity
    }

    @Override
    protected void onStart() {
        super.onStart();

        startActivity(new Intent(this, Main2Activity.class));
    }
}
