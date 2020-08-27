package com.example.cityweather_java;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;


import com.example.cityweather_java.IO.ApiService;

public class Asuncion extends AppCompatActivity {
    TextView ivtexAsuncion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.asuncion_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        WebView wv = (WebView) findViewById(R.id.WebViewAsuncion);
        wv.loadUrl("https://www.meteored.com.py/getwid/12506d7b1ae672e1605227a46f5f2b16");

    }
}
