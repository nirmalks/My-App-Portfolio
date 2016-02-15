package com.example.nirmal.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void spotifyClick(View view) {
        Toast.makeText(this,"This button will launch my Spotify App",Toast.LENGTH_SHORT).show();
    }

    public void scoresClick(View view) {
        Toast.makeText(this,"This button will launch my Scores App",Toast.LENGTH_SHORT).show();
    }

    public void libraryClick(View view) {
        Toast.makeText(this,"This button will launch my Library App",Toast.LENGTH_SHORT).show();
    }

    public void buildClick(View view) {
        Toast.makeText(this,"This button will launch my Build It Bigger App",Toast.LENGTH_SHORT).show();
    }

    public void xyzClick(View view) {
        Toast.makeText(this,"This button will launch my XYZ Reader App",Toast.LENGTH_SHORT).show();
    }

    public void capstoneClick(View view) {
        Toast.makeText(this,"This button will launch my Capstone: My Own App",Toast.LENGTH_SHORT).show();
    }
    /*
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
    */
}
