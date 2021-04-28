package com.example.katyramashay;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.katyramashay.DataModelingClasses.Patient;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    private Patient patient1 = new Patient();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("patientUsername1");

        // Write a message to the database
        myRef.setValue(patient1);

        // Read from the database
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                patient1 = dataSnapshot.getValue(Patient.class);
                Log.d("MainActivity", "Patient data successfully updated.");
            }
            @Override
            public void onCancelled(DatabaseError error) {
                Log.w("MainActivity", "Failed to read patient data.", error.toException());
            }
        });
    }
}