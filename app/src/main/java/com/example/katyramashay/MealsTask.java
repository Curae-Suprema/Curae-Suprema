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
    }

    @Override
    protected void onStop() {
        super.onStop();

        EditText mealName = findViewById(R.id.mealName);
        String mealNameStr = mealName + "";

        if (!mealNameStr.isEmpty()) {
            Meal meal = new Meal();

            meal.setTaskName(mealNameStr);

            CheckBox grainsCheck = findViewById(R.id.grainsCheck);
            meal.setGrains(grainsCheck.isChecked());

            CheckBox fruitsCheck = findViewById(R.id.fruitsCheck);
            meal.setFruits(fruitsCheck.isChecked());

            CheckBox veggiesCheck = findViewById(R.id.veggiesCheck);
            meal.setVegetables(veggiesCheck.isChecked());

            CheckBox dairyCheck = findViewById(R.id.dairyCheck);
            meal.setDairy(dairyCheck.isChecked());

            CheckBox proteinCheck = findViewById(R.id.proteinCheck);
            meal.setProtein(proteinCheck.isChecked());

            final Controller controller = (Controller) getApplicationContext();
            String date = new SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.US).format(new Date());
            controller.getDay(date).addTask(meal);
        }
    }
}