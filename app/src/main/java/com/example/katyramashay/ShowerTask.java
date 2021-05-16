package com.example.katyramashay;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
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

        CheckBox showerCompletionCheck = findViewById(R.id.showerCompletionCheck);

        if (showerCompletionCheck.isChecked()) {
            Shower shower = new Shower();
            shower.setCompletion(true);

            EditText addComments = findViewById(R.id.addComments);
            String comments = addComments.getText().toString();
            shower.setNotes(comments);

            final Controller controller = (Controller) getApplicationContext();
            String date = new SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.US).format(new Date());
            controller.getDay(date).addTask(shower);
        }
    }
}