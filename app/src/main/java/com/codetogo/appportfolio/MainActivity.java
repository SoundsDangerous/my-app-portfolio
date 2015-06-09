package com.codetogo.appportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setToast(View v){
        switch(v.getId()) {
            case R.id.btn1:
                Toast.makeText(this, getResources().getString(R.string.app1).toUpperCase() + " coming soon", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn2:
                Toast.makeText(this, getResources().getString(R.string.app2).toUpperCase() + " coming soon", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn3:
                Toast.makeText(this, getResources().getString(R.string.app3).toUpperCase() + " coming soon", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn4:
                Toast.makeText(this, getResources().getString(R.string.app4).toUpperCase() + " coming soon", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn5:
                Toast.makeText(this, getResources().getString(R.string.app5).toUpperCase() + " coming soon", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn6:
                Toast.makeText(this, getResources().getString(R.string.app6).toUpperCase() + " coming soon", Toast.LENGTH_SHORT).show();
                break;
        }

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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
