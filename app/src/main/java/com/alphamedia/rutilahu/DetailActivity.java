package com.alphamedia.rutilahu;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        TextView textView = (TextView) findViewById(R.id.nama);
        EditText ktp = (EditText) findViewById(R.id.ktp);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_detail, menu);
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

    public void fotoTampakDepan(View view) {
    }

    public void fotoTampakSamping1(View view) {
    }

    public void fotoTampakSamping2(View view) {
    }

    public void fotoDapur(View view) {
    }

    public void fotoJamban(View view) {
    }

    public void fotoSumberAir(View view) {
    }

    public void btnSimpan(View view) {
    }

    public void btnBack(View view) {
    }

}
