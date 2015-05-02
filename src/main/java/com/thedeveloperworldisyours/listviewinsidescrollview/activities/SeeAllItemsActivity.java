package com.thedeveloperworldisyours.listviewinsidescrollview.activities;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.thedeveloperworldisyours.listviewinsidescrollview.R;
import com.thedeveloperworldisyours.listviewinsidescrollview.view.CircleTransform;


public class SeeAllItemsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_all_items);
        ListView listView = (ListView) findViewById(R.id.activity_see_all_items_listView);
        ImageView imageView = (ImageView) findViewById(R.id.activity_see_all_items_icon);
        Picasso.with(this).load(getString(R.string.activity_see_all_items_image)).transform(new CircleTransform()).into(imageView);

        String[] values = getResources().getStringArray(R.array.items_list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, values);
        listView.setAdapter(adapter);
    }

}
