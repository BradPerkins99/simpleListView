package com.bradteachescode.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ListView lv;
    ArrayAdapter<String> adapter;

    private ArrayList<String> heroes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        heroes.add("Spiderman");
        heroes.add("Hulk");
        heroes.add("Thor");
        heroes.add("ironman");
        heroes.add("DareDevil");
        heroes.add("Luke Cage");
        heroes.add("Cyclops");
        heroes.add("Wolverine");


        lv = findViewById(R.id.list_view);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, heroes);
//        adapter = new ArrayAdapter<String>(this, R.layout.row, R.id.name_tv, heroes);
        lv.setAdapter(adapter);






    }
}
