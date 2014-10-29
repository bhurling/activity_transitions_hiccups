package com.example.hiccups;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity implements View.OnClickListener {

    View mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mView = findViewById(R.id.view);
        mView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(this, mView, "view").toBundle();

        Intent intent = new Intent(this, SecondaryActivity.class);
        startActivity(intent, bundle);
    }
}
