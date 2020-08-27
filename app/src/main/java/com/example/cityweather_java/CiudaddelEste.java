package com.example.cityweather_java;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class CiudaddelEste extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ciudaddeleste_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        WebView wv = (WebView) findViewById(R.id.WebViewCiudadEste);
        wv.loadUrl("https://www.meteored.com.py/getwid/aca44188254a4ef64390d4071d34c27c");
    }
}
