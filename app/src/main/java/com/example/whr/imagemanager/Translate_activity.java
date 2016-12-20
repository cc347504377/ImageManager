package com.example.whr.imagemanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.whr.imagemanager.View.BitmapVIew;

public class Translate_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BitmapVIew bitmapVIew = new BitmapVIew(this);
        setContentView(bitmapVIew);
    }

    public void onClick(View view) {

    }
}
