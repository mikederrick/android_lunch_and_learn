package com.tdc.lunchandlearn.lists.activities;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.tdc.lunchandlearn.R;

public class FruitNameListActivity extends ActionBarActivity {


    private ListView listView;

    private ArrayAdapter<String> arrayAdapter;

    private final String[] values = new String[] { "Fruit", "Vegetables"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);

        listView = (ListView) findViewById(R.id.listView);
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent fruitsIntent = new Intent(FruitNameListActivity.this, FruitModelListActivity.class);
                startActivity(fruitsIntent);
            }
        });
    }

}
