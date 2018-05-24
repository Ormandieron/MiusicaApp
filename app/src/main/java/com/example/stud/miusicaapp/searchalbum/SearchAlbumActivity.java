package com.example.stud.miusicaapp.searchalbum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.stud.miusicaapp.R;

public class SerchAlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_serch_album);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }
}
