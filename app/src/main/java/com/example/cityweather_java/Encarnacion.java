package com.example.cityweather_java;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Encarnacion extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.encarnacion_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        WebView wv = (WebView) findViewById(R.id.WebViewEncarnacion);
        wv.loadUrl("https://www.meteored.com.py/getwid/ac7602bae8cbb05e992f04e10feed34b");
    }
}
