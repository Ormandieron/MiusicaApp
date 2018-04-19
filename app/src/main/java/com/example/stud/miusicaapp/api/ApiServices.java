package com.example.stud.miusicaapp.api;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiServices {

    public static ApiClient getService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl( "http://www.theaudiodb.com/api/v1/json/{APIKEY}/" )
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(ApiClient.class);
    }

}