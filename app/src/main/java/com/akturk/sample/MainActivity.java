package com.akturk.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.akturk.lib.Go;
import com.akturk.volley.toolbox.Volley;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Go();
        new Gson();
        Volley.newRequestQueue(this);
    }
}
