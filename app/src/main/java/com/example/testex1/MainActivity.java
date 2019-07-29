package com.example.testex1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener {

    MyRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> tNames = new ArrayList<>();
        tNames.add("Mihail");
        tNames.add("Roma");
        tNames.add("Sebek");
        tNames.add("Rustam");
        tNames.add("Sergey");


        RecyclerView recyclerView = findViewById(R.id.rvName);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyRecyclerViewAdapter(this, tNames);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void onItemClick(View view, int position) {
        if(position == 0) {
            Toast.makeText(this, "It's not me", Toast.LENGTH_SHORT).show();
        }
        if(position == 1) {
            Toast.makeText(this, "It's not me", Toast.LENGTH_SHORT).show();
        }
        if(position == 2) {
            Toast.makeText(this, "It's not me", Toast.LENGTH_SHORT).show();
        }
        if(position == 3) {
            Toast.makeText(this, "It's me", Toast.LENGTH_SHORT).show();
        }
        if(position == 4) {
            Toast.makeText(this, "It's not me", Toast.LENGTH_SHORT).show();
        }
    }
}