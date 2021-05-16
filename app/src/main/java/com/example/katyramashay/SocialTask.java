package com.example.katyramashay;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import com.example.katyramashay.DataModelingClasses.Controller;
import com.example.katyramashay.DataModelingClasses.Socialization;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SocialTask extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_socials_task);
        getSupportActionBar().hide();
    }

    @Override
    protected void onStop() {
        super.onStop();

        EditText socialType = findViewById(R.id.socialType);
        String socialTypeStr = socialType.getText().toString();

        if (!socialTypeStr.isEmpty()) {
            Socialization socialization = new Socialization();

            socialization.setActivity(socialTypeStr);

            EditText socialNames = findViewById(R.id.socialNames);
            String socialNamesStr = socialNames.getText().toString();
            socialization.setPeople(socialNamesStr);

            EditText addComments = findViewById(R.id.addComments);
            String comments = addComments.getText().toString();
            socialization.setNotes(comments);

            final Controller controller = (Controller) getApplicationContext();
            String date = new SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.US).format(new Date());
            controller.getDay(date).addTask(socialization);
        }
    }
}