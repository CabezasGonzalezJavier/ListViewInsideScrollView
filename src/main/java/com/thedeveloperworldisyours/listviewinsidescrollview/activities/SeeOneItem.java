package com.thedeveloperworldisyours.listviewinsidescrollview.activities;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.squareup.picasso.Picasso;
import com.thedeveloperworldisyours.listviewinsidescrollview.R;
import com.thedeveloperworldisyours.listviewinsidescrollview.view.CircleTransform;

public class SeeOneItem extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_list_view);

        ImageView imageView = (ImageView) findViewById(R.id.activity_scroll_list_view_icon);
        Picasso.with(this).load(getString(R.string.activity_see_all_items_image)).transform(new CircleTransform()).into(imageView);

        ListView listView = (ListView) findViewById(R.id.activity_scroll_list_view_listView);
        String[] values = getResources().getStringArray(R.array.items_list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, values);
        listView.setAdapter(adapter);
        listView.setOnTouchListener(new ListView.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                // Disallow the touch request for parent scroll on touch of child view
                v.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }
        });
    }

}
