package com.example.listview;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;
import android.support.v7.app.ActionBar;

public class menus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menus);

        ActionBar actionBar = getSupportActionBar();
        setTitle("My new title");
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.drawable.ic);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main_items, menu);
        return true;//super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String msg = "";
        switch (item.getItemId()) {
            case R.id.menuFirst:
                msg = "First";
                break;

            case R.id.menuSecond:
                msg = "Second";
                break;

            case R.id.menuLocation:
                msg = "Location";
                break;

            case R.id.menuLogout:
                msg = "Logout";
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        Toast.makeText(this, msg, Toast.LENGTH_SHORT ).show();
return true;
    }

}

