package com.example.administrator.myapplication.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.myapplication.R;

public class GuideActivity extends AppCompatActivity {

    private Handler handler;
    private SharedPreferences sp;
    private SharedPreferences.Editor editor;
    private boolean isFirst;
    Button button;
    int i=5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.hide();
        }
        button = findViewById(R.id.guide_btn);
        handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(GuideActivity.this,MainActivity.class));
                }
            },5000);
        handler2.sendEmptyMessage(1);
        button.setOnClickListener(new MyOnClickListener());
    }
    Handler handler2 = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            if (msg.what==1){
                button.setText(i+"跳转");
                i-=1;
                if (i>=0) {
                    handler2.sendEmptyMessageDelayed(1, 1000);
                }
            }
        }
    };

    private class MyOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            startActivity(new Intent(GuideActivity.this,MainActivity.class));
        }
    }
}
