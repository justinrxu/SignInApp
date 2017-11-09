package com.example.justinxu.signinapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;
import java.util.ArrayList;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);
        this.setTitle("Check-In Page");

        final ListView lvPeople = (ListView) findViewById(R.id.lvPeople);
        final List<String[]> peopleList = new ArrayList<String[]>();

        String[] item = {"Name", "Table", "Age", "ParentName"};
        for(int i = 0; i < 10; i++) {
            String[] itemCopy = new String[item.length];
            for (int j = 0; j < item.length; j++)
                itemCopy[j] = item[j] + (i + 1);
            peopleList.add(itemCopy);
        }

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_2, android.R.id.text1, peopleList) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView text1 = (TextView) view.findViewById(android.R.id.text1);
                TextView text2 = (TextView) view.findViewById(android.R.id.text2);

                text1.setText(peopleList.get(position)[0]);
                text2.setText(peopleList.get(position)[1]);
                return view;
            }
        };
        lvPeople.setAdapter(adapter);
        lvPeople.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getBaseContext(), KidInfoActivity.class);
                intent.putExtra("kidinfo", peopleList.get(position));
                startActivity(intent);
            }
        });
    }
}
