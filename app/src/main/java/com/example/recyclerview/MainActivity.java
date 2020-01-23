package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    private int[] flags = {R.drawable.afghanistan,R.drawable.america,R.drawable.bahrain,
            R.drawable.bangladesh,R.drawable.bhutan,R.drawable.canada,
            R.drawable.denmark,R.drawable.finland,R.drawable.ghana,
            R.drawable.hungary,R.drawable.indonesia,R.drawable.japan};
    String []  title, desc;
    MyAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewId);
        title = getResources().getStringArray(R.array.country_name);
        desc = getResources().getStringArray(R.array.country_details);

        myAdapter = new MyAdapter(this,title,desc,flags);

        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));




    }
}
