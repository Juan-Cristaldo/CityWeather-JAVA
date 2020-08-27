package com.example.cityweather_java.Response;

import java.util.ArrayList;

public class WeatherResponse {

    private ArrayList<Weather> results;

    public ArrayList<Weather> getResults() {
        return results;
    }

    public void setResults(ArrayList<Weather> results) {
        this.results = results;
    }
}
