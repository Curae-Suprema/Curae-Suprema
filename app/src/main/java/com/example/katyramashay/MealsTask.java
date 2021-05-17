package com.example.katyramashay;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import com.example.katyramashay.DataModelingClasses.Controller;
import com.example.katyramashay.DataModelingClasses.Meal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MealsTask extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meals_task);
        getSupportActionBar().hide();
    }

    @Override
    protected void onStop() {
        super.onStop();

        EditText mealName = findViewById(R.id.mealName);
        String mealNameStr = mealName.getText().toString();

        CheckBox grainsCheck = findViewById(R.id.grainsCheck);
        CheckBox fruitsCheck = findViewById(R.id.fruitsCheck);
        CheckBox veggiesCheck = findViewById(R.id.veggiesCheck);
        CheckBox dairyCheck = findViewById(R.id.dairyCheck);
        CheckBox proteinCheck = findViewById(R.id.proteinCheck);

        if (!mealNameStr.isEmpty() || grainsCheck.isChecked() || fruitsCheck.isChecked() ||
                veggiesCheck.isChecked() || dairyCheck.isChecked() || proteinCheck.isChecked()) {
            Meal meal = new Meal();

            meal.setTaskName(mealNameStr);
            meal.setGrains(grainsCheck.isChecked());
            meal.setFruits(fruitsCheck.isChecked());
            meal.setVegetables(veggiesCheck.isChecked());
            meal.setDairy(dairyCheck.isChecked());
            meal.setProtein(proteinCheck.isChecked());

            final Controller controller = (Controller) getApplicationContext();
            String date = new SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.US).format(new Date());
            controller.getDay(date).addTask(meal);
        }
    }
}