package com.example.stud.miusicaapp.api;


import retrofit2.Retrofit;

public class ApiServices {

    public static ApiClient getService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl( "http://www.theaudiodb.com/api/v1/json/{APIKEY}/" )
                .build();
        return retrofit.create(ApiClient.class);
    }
}
