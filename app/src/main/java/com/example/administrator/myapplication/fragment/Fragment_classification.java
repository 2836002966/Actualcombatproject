package com.example.administrator.myapplication.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.administrator.myapplication.R;

/**
 * Created by Administrator on 2018/12/25.
 * 分类
 */

public class Fragment_classification extends Fragment {
    FrameLayout head;
    TextView headTxt;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_classification,null);
        initView(view);
        return view;
    }
    private void initView(View view){
        head=view.findViewById(R.id.classification_head);
        headTxt=head.findViewById(R.id.txt);
        headTxt.setText("分类");
    }
}
