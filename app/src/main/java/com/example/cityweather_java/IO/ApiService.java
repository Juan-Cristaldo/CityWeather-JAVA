package com.example.cityweather_java.IO;

import com.example.cityweather_java.Response.WeatherResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService {

    @GET("weather?q=Asuncion&appid=01be7a6e928a78af000577df2272f0a4")
    Call<WeatherResponse> getDiseases();


}


