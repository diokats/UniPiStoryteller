package com.example.unipi_storyteller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Start extends AppCompatActivity {
 ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        String imageUrl = "https://firebasestorage.googleapis.com/v0/b/unipi---storyteller.appspot.com/o/story-book-13166.jpg?alt=media&token=93fa9f9c-44d2-4fd1-a7d3-e8ea358b9c99";
        ImageView imageView = findViewById(R.id.imageView);
        Glide.with(this/* context */)
                .load(imageUrl)
                .into(imageView);



    }
    public void gotoFairy (View view){
        Intent intentLoadNewActivity = new Intent(Start.this, MainActivity.class);
        startActivity(intentLoadNewActivity);
    }
}