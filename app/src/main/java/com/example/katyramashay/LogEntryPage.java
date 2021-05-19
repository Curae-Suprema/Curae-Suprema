package com.example.katyramashay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
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
        ImageButton terrible = (ImageButton) findViewById(R.id.cryingButton);
        ImageButton verySad = (ImageButton) findViewById(R.id.slightlyCryingButton);
        ImageButton sad = (ImageButton) findViewById(R.id.verySadButton);
        ImageButton slightlySad = (ImageButton) findViewById(R.id.slightlySadButton);
        ImageButton neutral = (ImageButton) findViewById(R.id.neutralButton);
        ImageButton slightlyHappy = (ImageButton) findViewById(R.id.slightlyHappyButton);
        ImageButton happy = (ImageButton) findViewById(R.id.happyButton);
        ImageButton veryHappy = (ImageButton) findViewById(R.id.slightlySmilingButton);
        ImageButton smiling = (ImageButton) findViewById(R.id.smilingButton);

        terrible.setBackgroundColor(Color.RED);
        verySad.setBackgroundColor(Color.TRANSPARENT);
        sad.setBackgroundColor(Color.TRANSPARENT);
        slightlySad.setBackgroundColor(Color.TRANSPARENT);
        neutral.setBackgroundColor(Color.TRANSPARENT);
        slightlyHappy.setBackgroundColor(Color.TRANSPARENT);
        happy.setBackgroundColor(Color.TRANSPARENT);
        veryHappy.setBackgroundColor(Color.TRANSPARENT);
        smiling.setBackgroundColor(Color.TRANSPARENT);

        log.setMentalHealth("terrible");
    }

    public void verySadButton(View v) {

        ImageButton terrible = (ImageButton) findViewById(R.id.cryingButton);
        ImageButton verySad = (ImageButton) findViewById(R.id.slightlyCryingButton);
        ImageButton sad = (ImageButton) findViewById(R.id.verySadButton);
        ImageButton slightlySad = (ImageButton) findViewById(R.id.slightlySadButton);
        ImageButton neutral = (ImageButton) findViewById(R.id.neutralButton);
        ImageButton slightlyHappy = (ImageButton) findViewById(R.id.slightlyHappyButton);
        ImageButton happy = (ImageButton) findViewById(R.id.happyButton);
        ImageButton veryHappy = (ImageButton) findViewById(R.id.slightlySmilingButton);
        ImageButton smiling = (ImageButton) findViewById(R.id.smilingButton);

        terrible.setBackgroundColor(Color.TRANSPARENT);
        verySad.setBackgroundColor(Color.RED);
        sad.setBackgroundColor(Color.TRANSPARENT);
        slightlySad.setBackgroundColor(Color.TRANSPARENT);
        neutral.setBackgroundColor(Color.TRANSPARENT);
        slightlyHappy.setBackgroundColor(Color.TRANSPARENT);
        happy.setBackgroundColor(Color.TRANSPARENT);
        veryHappy.setBackgroundColor(Color.TRANSPARENT);
        smiling.setBackgroundColor(Color.TRANSPARENT);

        log.setMentalHealth("very sad");
    }

    public void sadButton(View v) {

        ImageButton terrible = (ImageButton) findViewById(R.id.cryingButton);
        ImageButton verySad = (ImageButton) findViewById(R.id.slightlyCryingButton);
        ImageButton sad = (ImageButton) findViewById(R.id.verySadButton);
        ImageButton slightlySad = (ImageButton) findViewById(R.id.slightlySadButton);
        ImageButton neutral = (ImageButton) findViewById(R.id.neutralButton);
        ImageButton slightlyHappy = (ImageButton) findViewById(R.id.slightlyHappyButton);
        ImageButton happy = (ImageButton) findViewById(R.id.happyButton);
        ImageButton veryHappy = (ImageButton) findViewById(R.id.slightlySmilingButton);
        ImageButton smiling = (ImageButton) findViewById(R.id.smilingButton);

        terrible.setBackgroundColor(Color.TRANSPARENT);
        verySad.setBackgroundColor(Color.TRANSPARENT);
        sad.setBackgroundColor(Color.RED);
        slightlySad.setBackgroundColor(Color.TRANSPARENT);
        neutral.setBackgroundColor(Color.TRANSPARENT);
        slightlyHappy.setBackgroundColor(Color.TRANSPARENT);
        happy.setBackgroundColor(Color.TRANSPARENT);
        veryHappy.setBackgroundColor(Color.TRANSPARENT);
        smiling.setBackgroundColor(Color.TRANSPARENT);

        log.setMentalHealth("sad");
    }

    public void slightlySadButton(View v) {

        ImageButton terrible = (ImageButton) findViewById(R.id.cryingButton);
        ImageButton verySad = (ImageButton) findViewById(R.id.slightlyCryingButton);
        ImageButton sad = (ImageButton) findViewById(R.id.verySadButton);
        ImageButton slightlySad = (ImageButton) findViewById(R.id.slightlySadButton);
        ImageButton neutral = (ImageButton) findViewById(R.id.neutralButton);
        ImageButton slightlyHappy = (ImageButton) findViewById(R.id.slightlyHappyButton);
        ImageButton happy = (ImageButton) findViewById(R.id.happyButton);
        ImageButton veryHappy = (ImageButton) findViewById(R.id.slightlySmilingButton);
        ImageButton smiling = (ImageButton) findViewById(R.id.smilingButton);

        terrible.setBackgroundColor(Color.TRANSPARENT);
        verySad.setBackgroundColor(Color.TRANSPARENT);
        sad.setBackgroundColor(Color.TRANSPARENT);
        slightlySad.setBackgroundColor(Color.RED);
        neutral.setBackgroundColor(Color.TRANSPARENT);
        slightlyHappy.setBackgroundColor(Color.TRANSPARENT);
        happy.setBackgroundColor(Color.TRANSPARENT);
        veryHappy.setBackgroundColor(Color.TRANSPARENT);
        smiling.setBackgroundColor(Color.TRANSPARENT);

        log.setMentalHealth("slightly sad");
    }

    public void neutralButton(View v) {

        ImageButton terrible = (ImageButton) findViewById(R.id.cryingButton);
        ImageButton verySad = (ImageButton) findViewById(R.id.slightlyCryingButton);
        ImageButton sad = (ImageButton) findViewById(R.id.verySadButton);
        ImageButton slightlySad = (ImageButton) findViewById(R.id.slightlySadButton);
        ImageButton neutral = (ImageButton) findViewById(R.id.neutralButton);
        ImageButton slightlyHappy = (ImageButton) findViewById(R.id.slightlyHappyButton);
        ImageButton happy = (ImageButton) findViewById(R.id.happyButton);
        ImageButton veryHappy = (ImageButton) findViewById(R.id.slightlySmilingButton);
        ImageButton smiling = (ImageButton) findViewById(R.id.smilingButton);

        terrible.setBackgroundColor(Color.TRANSPARENT);
        verySad.setBackgroundColor(Color.TRANSPARENT);
        sad.setBackgroundColor(Color.TRANSPARENT);
        slightlySad.setBackgroundColor(Color.TRANSPARENT);
        neutral.setBackgroundColor(Color.RED);
        slightlyHappy.setBackgroundColor(Color.TRANSPARENT);
        happy.setBackgroundColor(Color.TRANSPARENT);
        veryHappy.setBackgroundColor(Color.TRANSPARENT);
        smiling.setBackgroundColor(Color.TRANSPARENT);

        log.setMentalHealth("neutral");
    }

    public void slightlyHappyButton(View v) {

        ImageButton terrible = (ImageButton) findViewById(R.id.cryingButton);
        ImageButton verySad = (ImageButton) findViewById(R.id.slightlyCryingButton);
        ImageButton sad = (ImageButton) findViewById(R.id.verySadButton);
        ImageButton slightlySad = (ImageButton) findViewById(R.id.slightlySadButton);
        ImageButton neutral = (ImageButton) findViewById(R.id.neutralButton);
        ImageButton slightlyHappy = (ImageButton) findViewById(R.id.slightlyHappyButton);
        ImageButton happy = (ImageButton) findViewById(R.id.happyButton);
        ImageButton veryHappy = (ImageButton) findViewById(R.id.slightlySmilingButton);
        ImageButton smiling = (ImageButton) findViewById(R.id.smilingButton);

        terrible.setBackgroundColor(Color.TRANSPARENT);
        verySad.setBackgroundColor(Color.TRANSPARENT);
        sad.setBackgroundColor(Color.TRANSPARENT);
        slightlySad.setBackgroundColor(Color.TRANSPARENT);
        neutral.setBackgroundColor(Color.TRANSPARENT);
        slightlyHappy.setBackgroundColor(Color.RED);
        happy.setBackgroundColor(Color.TRANSPARENT);
        veryHappy.setBackgroundColor(Color.TRANSPARENT);
        smiling.setBackgroundColor(Color.TRANSPARENT);

        log.setMentalHealth("slightly happy");
    }

    public void happyButton(View v) {

        ImageButton terrible = (ImageButton) findViewById(R.id.cryingButton);
        ImageButton verySad = (ImageButton) findViewById(R.id.slightlyCryingButton);
        ImageButton sad = (ImageButton) findViewById(R.id.verySadButton);
        ImageButton slightlySad = (ImageButton) findViewById(R.id.slightlySadButton);
        ImageButton neutral = (ImageButton) findViewById(R.id.neutralButton);
        ImageButton slightlyHappy = (ImageButton) findViewById(R.id.slightlyHappyButton);
        ImageButton happy = (ImageButton) findViewById(R.id.happyButton);
        ImageButton veryHappy = (ImageButton) findViewById(R.id.slightlySmilingButton);
        ImageButton smiling = (ImageButton) findViewById(R.id.smilingButton);

        terrible.setBackgroundColor(Color.TRANSPARENT);
        verySad.setBackgroundColor(Color.TRANSPARENT);
        sad.setBackgroundColor(Color.TRANSPARENT);
        slightlySad.setBackgroundColor(Color.TRANSPARENT);
        neutral.setBackgroundColor(Color.TRANSPARENT);
        slightlyHappy.setBackgroundColor(Color.TRANSPARENT);
        happy.setBackgroundColor(Color.RED);
        veryHappy.setBackgroundColor(Color.TRANSPARENT);
        smiling.setBackgroundColor(Color.TRANSPARENT);

        log.setMentalHealth("happy");
    }

    public void veryHappyButton(View v) {

        ImageButton terrible = (ImageButton) findViewById(R.id.cryingButton);
        ImageButton verySad = (ImageButton) findViewById(R.id.slightlyCryingButton);
        ImageButton sad = (ImageButton) findViewById(R.id.verySadButton);
        ImageButton slightlySad = (ImageButton) findViewById(R.id.slightlySadButton);
        ImageButton neutral = (ImageButton) findViewById(R.id.neutralButton);
        ImageButton slightlyHappy = (ImageButton) findViewById(R.id.slightlyHappyButton);
        ImageButton happy = (ImageButton) findViewById(R.id.happyButton);
        ImageButton veryHappy = (ImageButton) findViewById(R.id.slightlySmilingButton);
        ImageButton smiling = (ImageButton) findViewById(R.id.smilingButton);

        terrible.setBackgroundColor(Color.TRANSPARENT);
        verySad.setBackgroundColor(Color.TRANSPARENT);
        sad.setBackgroundColor(Color.TRANSPARENT);
        slightlySad.setBackgroundColor(Color.TRANSPARENT);
        neutral.setBackgroundColor(Color.TRANSPARENT);
        slightlyHappy.setBackgroundColor(Color.TRANSPARENT);
        happy.setBackgroundColor(Color.TRANSPARENT);
        veryHappy.setBackgroundColor(Color.RED);
        smiling.setBackgroundColor(Color.TRANSPARENT);

        log.setMentalHealth("very happy");
    }

    public void amazingButton(View v) {

        ImageButton terrible = (ImageButton) findViewById(R.id.cryingButton);
        ImageButton verySad = (ImageButton) findViewById(R.id.slightlyCryingButton);
        ImageButton sad = (ImageButton) findViewById(R.id.verySadButton);
        ImageButton slightlySad = (ImageButton) findViewById(R.id.slightlySadButton);
        ImageButton neutral = (ImageButton) findViewById(R.id.neutralButton);
        ImageButton slightlyHappy = (ImageButton) findViewById(R.id.slightlyHappyButton);
        ImageButton happy = (ImageButton) findViewById(R.id.happyButton);
        ImageButton veryHappy = (ImageButton) findViewById(R.id.slightlySmilingButton);
        ImageButton smiling = (ImageButton) findViewById(R.id.smilingButton);

        terrible.setBackgroundColor(Color.TRANSPARENT);
        verySad.setBackgroundColor(Color.TRANSPARENT);
        sad.setBackgroundColor(Color.TRANSPARENT);
        slightlySad.setBackgroundColor(Color.TRANSPARENT);
        neutral.setBackgroundColor(Color.TRANSPARENT);
        slightlyHappy.setBackgroundColor(Color.TRANSPARENT);
        happy.setBackgroundColor(Color.TRANSPARENT);
        veryHappy.setBackgroundColor(Color.TRANSPARENT);
        smiling.setBackgroundColor(Color.RED);

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

    public void performSettings(View v) {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }
}