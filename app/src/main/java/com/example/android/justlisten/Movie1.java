package com.example.android.justlisten;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Movie1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie1);
        //Create object of song1 text view.
        TextView song1 = (TextView) findViewById(R.id.movie1_song1);
        //Set click listener on that object.
        song1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent song1Intent = new Intent(Movie1.this, Movie1Song1.class);
                startActivity(song1Intent);
            }
        });
        //Create object of song2 text view.
        TextView song2 = (TextView) findViewById(R.id.movie1_song2);
        //Set click listener on that object
        song2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent song2Intent = new Intent(Movie1.this, Movie1Song2.class);
                startActivity(song2Intent);
            }
        });
        ImageView song1Play = (ImageView) findViewById(R.id.song1_play_button);
        song1Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent song1PlayIntent = new Intent(Movie1.this, Movie1Song1.class);
                startActivity(song1PlayIntent);
            }
        });
        ImageView song2Play = (ImageView) findViewById(R.id.song2_play_button);
        song2Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent song2PlayIntent = new Intent(Movie1.this, Movie1Song2.class);
                startActivity(song2PlayIntent);
            }
        });
    }
}
