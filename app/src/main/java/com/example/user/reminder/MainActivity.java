package com.example.user.reminder;

import android.app.Activity;
import android.app.ActivityGroup;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TabHost;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MainActivity extends ActivityGroup {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();
        tabHost.setup(this.getLocalActivityManager());

        TabHost.TabSpec specs = tabHost.newTabSpec("tag1");
        specs.setContent(new Intent().setClass(MainActivity.this,SetAlarm.class));
        specs.setIndicator("first");
        tabHost.addTab(specs);

        TabHost.TabSpec specs2 = tabHost.newTabSpec("tag2");
        specs2.setContent(R.id.tab2);
        specs2.setIndicator("second");
        tabHost.addTab(specs2);

        TabHost.TabSpec specs3 = tabHost.newTabSpec("tag3");
        specs3.setContent(R.id.tab3);
        specs3.setIndicator("third");
        tabHost.addTab(specs3);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_add) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this,CheckBoxActivity.class);
            startActivity(intent);
        }

        if( id== R.id.action_edit){
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, SpinnerActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
