package com.example.unipi_storyteller;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity2 extends AppCompatActivity {
    TextView textView4;
    FirebaseDatabase database;
    DatabaseReference reference;
    MyTTS myTTS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView4 =findViewById(R.id.textView4);
        database = FirebaseDatabase.getInstance();
        reference = database.getReference("story");
        myTTS = new MyTTS(this);
   }
    public void read(View view){
        reference.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                textView4.setText(snapshot.getValue().toString());
                myTTS.speak(snapshot.getValue().toString());

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                textView4.setText(error.getMessage());

            }
        });
    }
}