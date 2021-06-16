package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rclview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        String arr[] = {"Mohammad", "Husain", "Dilshad", "Champaran", "Bihar", "India", "Asia","Mohammad", "Husain", "Dilshad", "Champaran", "Bihar", "India", "Asia","Mohammad", "Husain", "Dilshad", "Champaran", "Bihar", "India", "Asia"};
        MyAdapter myAdapter = new MyAdapter(getApplicationContext(), arr);
        recyclerView.setAdapter(myAdapter);

    }
}