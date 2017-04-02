package com.pineapple.dapineapple;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.StringTokenizer;


public class FirstMenu extends AppCompatActivity {

    Toolbar toolbar;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_menu);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Da Pineapple Grill");
        toolbar.setSubtitle("Food Menu");
        listView = (ListView) findViewById(R.id.listView);

        /*This is an adapter and it is holding the values of the menu items
        from the string*/
        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(FirstMenu.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.menuitems));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Intent intent = new Intent(FirstMenu.this, SecondMenu.class);
                intent.putExtra("ItemName", listView.getItemAtPosition(i).toString());
                startActivity(intent);

            }
        });
        listView.setAdapter(mAdapter);
    }

    public void onBackPressed() {


        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}