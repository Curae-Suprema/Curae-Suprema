package com.example.katyramashay;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import com.example.katyramashay.DataModelingClasses.Controller;
import com.example.katyramashay.DataModelingClasses.Shower;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ShowerTask extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shower_task);
        getSupportActionBar().hide();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Shower shower = new Shower();

        CheckBox showerCompletionCheck = findViewById(R.id.showerCompletionCheck);
        shower.setCompletion(showerCompletionCheck.isChecked());

        final Controller controller = (Controller) getApplicationContext();
        String date = new SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.US).format(new Date());
        controller.getDay(date).addTask(shower);
    }
}