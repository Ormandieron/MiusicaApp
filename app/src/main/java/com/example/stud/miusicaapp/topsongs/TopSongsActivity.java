package com.example.stud.miusicaapp.topsongs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.stud.miusicaapp.R;

public class TopSongsActivity extends AppCompatActivity {

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_songs);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        @Override
        public boolean onSupportNavigateUp() {
            onBackPressed();
            return true ;
        }
    }
}
