package com.example.whr.imagemanager;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.File;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_cut:
                startActivity(new Intent(this,Cut_activity.class));
                break;
            case R.id.button_translate:
                startActivity(new Intent(this,Translate_activity.class));
                break;

        }

    }




}
