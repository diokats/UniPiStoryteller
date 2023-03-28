package com.example.unipi_storyteller;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ImageButton imageButton;
    ImageButton imageButton2;
    ImageButton imageButton3;
    ImageButton imageButton4;
    ImageButton imageButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String imageUrl = "https://firebasestorage.googleapis.com/v0/b/unipi---storyteller.appspot.com/o/ta-tria-gourounakia..jpg?alt=media&token=85b6ba69-66ac-42f6-8e27-ab9deb876478";
        ImageButton imageButton = findViewById(R.id.imageButton);
        Glide.with(this/* context */)
                .load(imageUrl)
                .into(imageButton);

        String imageUrl2 = "https://firebasestorage.googleapis.com/v0/b/unipi---storyteller.appspot.com/o/pentamorfi-kai-to-teras-1200x630.jpg?alt=media&token=cffdf26a-6842-4cc2-a48a-0d673fd7f0f6";
        ImageButton imageButton2 = findViewById(R.id.imageButton2);
        Glide.with(this/* context */)
                .load(imageUrl2)
                .into(imageButton2);

        String imageUrl3 = "https://firebasestorage.googleapis.com/v0/b/unipi---storyteller.appspot.com/o/snow-white-409163_1280.jpg?alt=media&token=00e61f67-c981-42a5-adb4-68ba1ae94793";
        ImageButton imageButton3 = findViewById(R.id.imageButton3);
        Glide.with(this/* context */)
                .load(imageUrl3)
                .into(imageButton3);

        String imageUrl4 = "https://firebasestorage.googleapis.com/v0/b/unipi---storyteller.appspot.com/o/staxtopouta-paramythi-1050000_1280.jpg?alt=media&token=19ea8113-d2d7-4a12-af68-6954e1440575";
        ImageButton imageButton4 = findViewById(R.id.imageButton4);
        Glide.with(this/* context */)
                .load(imageUrl4)
                .into(imageButton4);

        String imageUrl5 = "https://firebasestorage.googleapis.com/v0/b/unipi---storyteller.appspot.com/o/ta-tria-gourounakia..jpg?alt=media&token=85b6ba69-66ac-42f6-8e27-ab9deb876478";
        ImageButton imageButton5 = findViewById(R.id.imageButton5);
        Glide.with(this/* context */)
                .load(imageUrl5)
                .into(imageButton5);

    }

        public void readStory (View view){
            Intent intentLoadNewActivity = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intentLoadNewActivity);
        }

    }
