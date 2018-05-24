package com.example.stud.miusicaapp.searchalbum;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.stud.miusicaapp.R;

public class SearchAlbumActivity extends AppCompatActivity {

    EditText etQuery;
    RecyclerView rvList;

    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serch_album);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        sharedPreferences = getPreferences(MODE_PRIVATE);

        etQuery = findViewById(R.id.etQuery);
        rvList = findViewById(R.id.rvList);

        try {
           etQuery.setText(sharedPreferences.getString("query", null));
        } catch (Exception e) {
            Log.e ( "TAG" , "blad" , e);
        }

        String artist = sharedPreferences.getString("query", null);
        etQuery.setText(artist);
        Button bSearch = findViewById(R.id.bSearch);

        bSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String query = etQuery.getText().toString();
                rememberQuery(query);
            }
        });
    }
        private void rememberQuery(String query){

            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("Query", query);
            editor.apply();
    }
    @Override
public boolean onSupportNavigateUp(){

            onBackPressed();
            return true;
}


    }

