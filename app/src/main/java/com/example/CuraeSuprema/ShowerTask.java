package com.example.CuraeSuprema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import com.example.CuraeSuprema.DataModelingClasses.Controller;
import com.example.CuraeSuprema.DataModelingClasses.Shower;
import com.example.CuraeSuprema.DataModelingClasses.Task;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import static com.example.CuraeSuprema.DailyTask.EXTRA_ID;
import static com.example.CuraeSuprema.DailyTask.EXTRA_POSITION;

public class ShowerTask extends AppCompatActivity {

    private Shower shower;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shower_task);
        getSupportActionBar().hide();

        CheckBox showerCompletionCheck = findViewById(R.id.showerCompletionCheck);
        EditText addComments = findViewById(R.id.addComments);

        shower = new Shower();

        Intent intent = getIntent();
        if (intent.hasExtra(EXTRA_ID)) {

            final Controller controller = (Controller) getApplicationContext();
            String date = new SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.US).format(new Date());
            ArrayList<Task> tasks = controller.getDay(date).getTasks();
            shower = (Shower) tasks.get(intent.getIntExtra(EXTRA_POSITION, 0));

            showerCompletionCheck.setChecked(shower.getCompletion());
            addComments.setText(shower.getNotes());
        }
    }

    @Override
    protected void onStop() {
        super.onStop();

        CheckBox showerCompletionCheck = findViewById(R.id.showerCompletionCheck);

        EditText addComments = findViewById(R.id.addComments);
        String comments = addComments.getText().toString();

        if (showerCompletionCheck.isChecked() || !comments.isEmpty()) {
            shower.setCompletion(showerCompletionCheck.isChecked());
            shower.setNotes(comments);

            final Controller controller = (Controller) getApplicationContext();
            String date = new SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.US).format(new Date());

            Intent intent = getIntent();
            if (intent.hasExtra(EXTRA_ID))
                controller.getDay(date).setTask(shower, intent.getIntExtra(EXTRA_POSITION, 0));
            else
                controller.getDay(date).addTask(shower);
        }
    }
}