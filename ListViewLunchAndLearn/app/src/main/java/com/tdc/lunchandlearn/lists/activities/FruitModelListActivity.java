package com.tdc.lunchandlearn.lists.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.tdc.lunchandlearn.R;
import com.tdc.lunchandlearn.lists.adapters.FruitsListAdapter;
import com.tdc.lunchandlearn.lists.models.Fruit;

import java.util.ArrayList;

public class FruitModelListActivity extends Activity {

    private ListView fruitListView;

    private FruitsListAdapter fruitAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fruit_list_activity);

        fruitListView = (ListView) findViewById(R.id.fruitListView);
        fruitAdapter = new FruitsListAdapter(this, R.layout.fruit_list_item, new ArrayList<Fruit>());
        fruitListView.setAdapter(fruitAdapter);

        populateList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.fruit_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.add_item) {
            fruitAdapter.add(new Fruit("New Fruit", R.drawable.grapefruit));
            fruitAdapter.notifyDataSetInvalidated();
        }
        return super.onOptionsItemSelected(item);
    }

    public void populateList() {
        fruitAdapter.add(new Fruit("Grapefruit", R.drawable.grapefruit));
        fruitAdapter.add(new Fruit("Oranges", R.drawable.orange));
        fruitAdapter.notifyDataSetInvalidated();
    }
}
