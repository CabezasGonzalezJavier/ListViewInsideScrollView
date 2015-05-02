package com.thedeveloperworldisyours.listviewinsidescrollview.activities;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.thedeveloperworldisyours.listviewinsidescrollview.R;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button seeAllItems = (Button) findViewById(R.id.activity_main_button_see_all_items);
        seeAllItems.setOnClickListener(this);
        Button scrollListView = (Button) findViewById(R.id.activity_main_button_scroll_list_view);
        scrollListView.setOnClickListener(this);

    }

    public void goToSeeAllViews(){
        Intent intent = new Intent(this, SeeAllItemsActivity.class);
        startActivity(intent);
    }

    public void goToScrollListView(){
        Intent intent = new Intent(this, SeeOneItem.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.activity_main_button_see_all_items:
                goToSeeAllViews();
                break;
            case R.id.activity_main_button_scroll_list_view:
                goToScrollListView();
                break;
        }

    }
}
