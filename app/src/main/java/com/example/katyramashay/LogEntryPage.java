package com.example.katyramashay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.SeekBar;

import com.example.katyramashay.DataModelingClasses.Controller;
import com.example.katyramashay.DataModelingClasses.Shower;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class LogEntryPage extends AppCompatActivity {

    LogEntry log = new LogEntry();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_entry);
        getSupportActionBar().hide();
    }

    @Override
    protected void onStop() {
        super.onStop();

            EditText followUpQuestionEntryField = findViewById(R.id.followUpQuestionEntryField);
            String reason = followUpQuestionEntryField.getText().toString();
            log.setReason(reason);

            EditText painFollowUpQuestionEntryField = findViewById(R.id.painFollowUpQuestionEntryField2);
            String painLocation = painFollowUpQuestionEntryField.getText().toString();
            log.setPainLocation(painLocation);

            EditText additionalInfoQuestionEntryField = findViewById(R.id.additionalInfoQuestionEntryField);
            String additionalInfo = additionalInfoQuestionEntryField.getText().toString();
            log.setAdditionalInfo(additionalInfo);

            SeekBar physicalHealthSeekBar = findViewById(R.id.physicalHealthSeekBar);
            int physicalHealth = physicalHealthSeekBar.getProgress();
            log.setPhysicalHealth(physicalHealth);

            SeekBar painSeekBar = findViewById(R.id.painSeekBar);
            int painLevel = painSeekBar.getProgress();
            log.setPainLevel(painLevel);

            final Controller controller = (Controller) getApplicationContext();
            String date = new SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.US).format(new Date());
            log.setDate(date);
            controller.addLogEntry(log);
    }

    public void terribleButton(View v) {
        log.setMentalHealth("terrible");
    }

    public void verySadButton(View v) {
        log.setMentalHealth("very sad");
    }

    public void sadButton(View v) {
        log.setMentalHealth("sad");
    }

    public void slightlySadButton(View v) {
        log.setMentalHealth("slightly sad");
    }

    public void neutralButton(View v) {
        log.setMentalHealth("neutral");
    }

    public void slightlyHappyButton(View v) {
        log.setMentalHealth("slightly happy");
    }

    public void happyButton(View v) {
        log.setMentalHealth("happy");
    }

    public void veryHappyButton(View v) {
        log.setMentalHealth("very happy");
    }

    public void amazingButton(View v) {
        log.setMentalHealth("amazing");
    }

    public void performDailyTask(View v) {
        Intent intent = new Intent(this, DailyTask.class);
        startActivity(intent);
    }

    public void performTaskPage(View v) {
        Intent intent = new Intent(this, TaskPage.class);
        startActivity(intent);
    }

    public void performLogEntry(View v) {
        Intent intent = new Intent(this, LogEntryPage.class);
        startActivity(intent);
    }

    public void performHome(View v) {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    public void performMedications(View v) {
        Intent intent = new Intent(this, Medications.class);
        startActivity(intent);
    }
}