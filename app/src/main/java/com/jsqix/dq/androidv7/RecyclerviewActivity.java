package com.jsqix.dq.androidv7;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class RecyclerviewActivity extends AppCompatActivity implements RecycleAdapter.OnItemClickListener{
    private RecyclerView recyclerView;
    private List<String> data = new ArrayList<String>();
    private RecycleAdapter recycleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        initData();
        initView();
    }

    private void initData() {
        data.add("1");
        data.add("1");
        data.add("1");
        data.add("1");
//        recycleAdapter.notifyDataSetChanged();
    }

    private void initView() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
//        StaggeredGridLayoutManager layoutManager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this, LinearLayout.VERTICAL, false);//reverseLayout是否逆向
        recyclerView.setLayoutManager(layoutManager);
        recycleAdapter = new RecycleAdapter(this, data);
        recycleAdapter.setOnItemClickListener(this);
        recyclerView.setAdapter(recycleAdapter);
    }

    @Override
    public void onItemClick(int position) {
        Toast.makeText(this,position+"",Toast.LENGTH_LONG).show();
    }
}
