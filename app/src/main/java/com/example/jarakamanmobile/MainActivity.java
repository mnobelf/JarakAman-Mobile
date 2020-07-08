package com.example.jarakamanmobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    public void qrcodeactivity(View view) {
        Intent intent = new Intent(this, QRCodeActivity.class);
        startActivity(intent);
    }

    public void locationcheckactivity(View view) {
        Intent intent = new Intent(this, LocationCheckActivity.class);
        startActivity(intent);
    }

    public void mystatusactivity(View view) {
        Intent intent = new Intent(this, MyStatusActivity.class);
        startActivity(intent);
    }

    public void scanactivity(View view) {
        Intent intent = new Intent(this, ScanActivity.class);
        startActivity(intent);
    }

}
