package com.github.vasiliz.myapplication;

import android.support.annotation.Nullable;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
    protected void onPostCreate(@Nullable final Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }

    @Override
    protected void onStop() {
        super.onStop();
        //stoped activity
    }

    public void picked(){
        //// TODO: 05.10.2017
    }
}
