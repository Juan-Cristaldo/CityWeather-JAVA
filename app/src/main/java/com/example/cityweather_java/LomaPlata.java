package com.example.cityweather_java;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class LomaPlata extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lomaplata_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        WebView wv = (WebView) findViewById(R.id.WebViewLomaPlata);
        wv.loadUrl("https://www.meteored.com.py/getwid/bb38aff10cd1d0c0253cfa357f1375aa");
    }
}
