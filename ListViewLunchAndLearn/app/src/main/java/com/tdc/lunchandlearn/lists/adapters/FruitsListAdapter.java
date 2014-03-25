package com.tdc.lunchandlearn.lists.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tdc.lunchandlearn.R;

import com.tdc.lunchandlearn.lists.models.Fruit;

import java.util.List;

public class FruitsListAdapter extends ArrayAdapter<Fruit> {

    private List<Fruit> fruits;

    private Context context;

    public FruitsListAdapter(Context context, int resource, List<Fruit> objects) {
        super(context, resource, objects);
        this.fruits = objects;
        this.context = context;
    }

    @Override
    public int getCount() {
        return fruits.size();
    }

    @Override
    public Fruit getItem(int i) {
        return fruits.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder viewHolder;
        Fruit fruit = fruits.get(i);

        if(view == null) {
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(context).inflate(R.layout.fruit_list_item, viewGroup, false);
            viewHolder.fruitImageVieww = (ImageView) view.findViewById(R.id.fruitImageView);
            viewHolder.fruitNameView = (TextView) view.findViewById(R.id.fruitTextView);

            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.fruitImageVieww.setImageResource(fruit.getImageResource());
        viewHolder.fruitNameView.setText(fruit.getName());

        return view;
    }

    private static class ViewHolder {
        public ImageView fruitImageVieww;
        public TextView fruitNameView;
    }
}
