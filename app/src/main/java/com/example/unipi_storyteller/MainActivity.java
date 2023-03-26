package com.example.unipi_storyteller;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

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

    // StorageReference storageReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseStorage storage = FirebaseStorage.getInstance();

        List<StorageReference> imageRefs = new ArrayList<>();
        imageRefs.add(storage.getReference().child("https://firebasestorage.googleapis.com/v0/b/unipi---storyteller.appspot.com/o/pigeons-peristeria-1200x630-cartoon.jpg?alt=media&token=ea9845cd-12b4-4220-a5e1-ad50c89771ed"));
        imageRefs.add(storage.getReference().child("images/image2.jpg"));
        imageRefs.add(storage.getReference().child("images/image3.jpg"));
        imageRefs.add(storage.getReference().child("images/image4.jpg"));

        for (int i = 0; i < imageRefs.size(); i++) {
            final int index = i;
            imageRefs.get(i).getBytes(Long.MAX_VALUE).addOnSuccessListener(new OnSuccessListener<byte[]>() {
                @Override
                public void onSuccess(byte[] bytes) {
                    Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
                    switch (index) {
                        case 0:
                            imageButton.setImageBitmap(bitmap);
                            break;
                        case 1:
                            imageButton2.setImageBitmap(bitmap);
                            break;
                        case 2:
                            imageButton3.setImageBitmap(bitmap);
                            break;
                        case 3:
                            imageButton4.setImageBitmap(bitmap);
                            break;
                    }
                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    // Handle any errors
                }
            });
        }

    }
}



//        imageButton = findViewById(R.id.imageButton);
//
//        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
//        DatabaseReference databaseReference = firebaseDatabase.getReference();
//        DatabaseReference getImage = databaseReference.child("image");
//        getImage.addListenerForSingleValueEvent(
//                new ValueEventListener() {
//                    @Override
//                    public void onDataChange(
//                            @NonNull DataSnapshot dataSnapshot)
//                    {
//                        String link = dataSnapshot.getValue(
//                                String.class);
//                        Picasso.get().load(link).into(imageButton);
//
//                    }
//
//                    @Override
//                    public void onCancelled(@NonNull DatabaseError error) {
//
//                    }
//
//                });
//
//
//        }
//    public void readStory(View view){
//        Intent intentLoadNewActivity = new Intent(MainActivity.this , MainActivity2.class);
//        startActivity(intentLoadNewActivity);
//    }
//
//}
