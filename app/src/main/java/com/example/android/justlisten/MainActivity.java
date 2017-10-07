package com.example.android.justlisten;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Created Object of Search Image
        ImageView searchImg = (ImageView) findViewById(R.id.search_image);
        //Set a click listener on that view
        searchImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent searchIntent = new Intent(MainActivity.this, Search.class);
                startActivity(searchIntent);
            }
        });
        //Created object of Playlist Image
        ImageView playListImage = (ImageView) findViewById(R.id.playlist_image);
        //Set a click listener on that view
        playListImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playListIntent = new Intent(MainActivity.this, PlayList.class);
                startActivity(playListIntent);
            }
        });
        //Created object of New released Image
        ImageView newReleasedImg = (ImageView) findViewById(R.id.new_released_image);
        //Set a click listener on that view
        newReleasedImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newReleasedIntent = new Intent(MainActivity.this, NewReleased.class);
                startActivity(newReleasedIntent);
            }
        });
        //Created object of play button(Home screen) of recently played song
        ImageView playButtonHome = (ImageView) findViewById(R.id.play_button_home);
        //Set a click listener on that view
        playButtonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playButtonHome = new Intent(MainActivity.this, Movie1Song1.class);
                startActivity(playButtonHome);
            }
        });
        //Created object of Movie 1 Image
        ImageView movie1Image = (ImageView) findViewById(R.id.movie_1_image_home);
        //Set a click listener on that view
        movie1Image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent movie1Intent = new Intent(MainActivity.this, Movie1.class);
                startActivity(movie1Intent);
            }
        });
        //Created object of Movie 2 Image
        ImageView movie2Image = (ImageView) findViewById(R.id.movie_2_image_home);
        //Set a click listener on that view
        movie2Image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent movie1Intent = new Intent(MainActivity.this, Movie1.class);
                startActivity(movie1Intent);
            }
        });
    }
}
