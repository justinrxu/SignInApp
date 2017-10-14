package com.example.justinxu.signinapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;
import java.util.ArrayList;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        ListView lvPeople = (ListView) findViewById(R.id.lwPeople);
        List<String> peopleList = new ArrayList<String>();

        peopleList.add("pizza");
        peopleList.add("apples");
        peopleList.add("salty pasta");
        peopleList.add("kids");

        ArrayAdapter adapter = new ArrayAdapter(UserAreaActivity.this, android.R.layout.simple_list_item_2, android.R.id.text1, peopleList);
        lvPeople.setAdapter(adapter);

    }

    public void onClick() {
        System.out.println("On Click Worked");
    }
}
