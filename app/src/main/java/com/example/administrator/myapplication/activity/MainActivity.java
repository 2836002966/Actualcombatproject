package com.example.administrator.myapplication.activity;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.adapter.MyAdapter;
import com.example.administrator.myapplication.fragment.Fragment_book;
import com.example.administrator.myapplication.fragment.Fragment_classification;
import com.example.administrator.myapplication.fragment.Fragment_popular;
import com.example.administrator.myapplication.fragment.Fragment_ranking;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    ImageView book,popular,classification,ranking;
    private List<Fragment> fragments;
    private MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null){
            actionBar.hide();
        }
        initView();
    }
    private void initView(){
        viewPager = findViewById(R.id.viewPager);
        book=findViewById(R.id.bg_book);
        popular=findViewById(R.id.bg_popular);
        classification=findViewById(R.id.bg_classification);
        ranking=findViewById(R.id.bg_ranking);
        fragments = new ArrayList<>();
        fragments.add(new Fragment_book());
        fragments.add(new Fragment_popular());
        fragments.add(new Fragment_ranking());
        fragments.add(new Fragment_classification());
        adapter = new MyAdapter(this.getSupportFragmentManager(),fragments);
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                switchImage(i);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
    }
    private void switchImage(int position){
        switch (position){
            case 0:
                book.setImageResource(R.drawable.book1);
                popular.setImageResource(R.drawable.popular2);
                classification.setImageResource(R.drawable.classification2);
                ranking.setImageResource(R.drawable.ranking2);
                break;
            case 1:
                book.setImageResource(R.drawable.book2);
                popular.setImageResource(R.drawable.popular1);
                classification.setImageResource(R.drawable.classification2);
                ranking.setImageResource(R.drawable.ranking2);
                break;
            case 2:
                book.setImageResource(R.drawable.book2);
                popular.setImageResource(R.drawable.popular2);
                classification.setImageResource(R.drawable.classification2);
                ranking.setImageResource(R.drawable.ranking1);
                break;
            case 3:
                book.setImageResource(R.drawable.book2);
                popular.setImageResource(R.drawable.popular2);
                classification.setImageResource(R.drawable.classification1);
                ranking.setImageResource(R.drawable.ranking2);
                break;
        }
    }
}
