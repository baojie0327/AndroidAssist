package com.jackson.androidassist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.jackson.androidassist.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;
    private ArrayList<String> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding=ActivityMainBinding.inflate(getLayoutInflater());
        View view = mBinding.getRoot();
        setContentView(view);
        initView();
        initData();
    }

    /**
     * 初始化view
     */
    private void initView(){
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        mBinding.recyclerView.setLayoutManager(linearLayoutManager);
    }

    /**
     * 初始化数据
     */
    private void initData(){
        dataList=new ArrayList<>();
        dataList.add("Java");
        dataList.add("Kotlin");
        mBinding.recyclerView.setAdapter(new HomeAdapter(R.layout.item_activity_main,dataList));
    }
}