package com.jsqix.dq.androidv7;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button snackbar, recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        snackbar = (Button) findViewById(R.id.snackbar);
        recyclerview = (Button) findViewById(R.id.recyclerview);
        snackbar.setOnClickListener(this);
        recyclerview.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.snackbar:
                Snackbar.make(v, "Snackbar", Snackbar.LENGTH_LONG).setAction("ok", new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {

                    }
                }).show();
                break;
            case R.id.recyclerview:
                startActivity(new Intent(this, RecyclerviewActivity.class));
                break;
        }
    }
}
