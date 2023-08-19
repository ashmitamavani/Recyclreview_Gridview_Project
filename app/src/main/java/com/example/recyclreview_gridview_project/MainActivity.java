package com.example.recyclreview_gridview_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
        LinearLayoutManager linearLayoutManager;
        GridLayoutManager gridLayoutManager;
        StaggeredGridLayoutManager  staggeredGridLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
       // recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        //gridLayoutManager=new GridLayoutManager(this,2,RecyclerView.VERTICAL,false);
       // linearLayoutManager=new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        staggeredGridLayoutManager=new StaggeredGridLayoutManager(2,RecyclerView.HORIZONTAL);
        Recyclerview_Adapter adapter=new Recyclerview_Adapter(MainActivity.this,Config.name,Config.img,Config.price);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(adapter);


    }
}