package com.example.cityweather_java;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class VillaRica extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.villarica_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        WebView wv = (WebView) findViewById(R.id.WebViewVillaRica);
        wv.loadUrl("https://www.meteored.com.py/getwid/6961b068e6ec26e8a3bc03d37d5dce5a");
    }
}
