package com.example.katyramashay;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import com.example.katyramashay.DataModelingClasses.Controller;
import com.example.katyramashay.DataModelingClasses.Meal;
import com.example.katyramashay.DataModelingClasses.Task;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import static com.example.katyramashay.DailyTask.EXTRA_ID;
import static com.example.katyramashay.DailyTask.EXTRA_POSITION;

public class MealsTask extends AppCompatActivity {

    private Meal meal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meals_task);
        getSupportActionBar().hide();

        EditText mealName = findViewById(R.id.mealName);
        CheckBox grainsCheck = findViewById(R.id.grainsCheck);
        CheckBox fruitsCheck = findViewById(R.id.fruitsCheck);
        CheckBox veggiesCheck = findViewById(R.id.veggiesCheck);
        CheckBox dairyCheck = findViewById(R.id.dairyCheck);
        CheckBox proteinCheck = findViewById(R.id.proteinCheck);

        meal = new Meal();

        Intent intent = getIntent();
        if (intent.hasExtra(EXTRA_ID)) {

            final Controller controller = (Controller) getApplicationContext();
            String date = new SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.US).format(new Date());
            ArrayList<Task> tasks = controller.getDay(date).getTasks();
            meal = (Meal) tasks.get(intent.getIntExtra(EXTRA_POSITION, 0));

            mealName.setText(meal.getTaskName());
            grainsCheck.setChecked(meal.getGrains());
            fruitsCheck.setChecked(meal.getFruits());
            veggiesCheck.setChecked(meal.getVegetables());
            dairyCheck.setChecked(meal.getDairy());
            proteinCheck.setChecked(meal.getProtein());
        }
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

        CheckBox mealsCompletedButton = findViewById(R.id.mealsCompletedButton);
        meal.setCompletion(mealsCompletedButton.isChecked());

        if (!mealNameStr.isEmpty() || grainsCheck.isChecked() || fruitsCheck.isChecked() ||
                veggiesCheck.isChecked() || dairyCheck.isChecked() || proteinCheck.isChecked()) {

            if (!mealNameStr.isEmpty())
                meal.setTaskName(mealNameStr);
            meal.setGrains(grainsCheck.isChecked());
            meal.setFruits(fruitsCheck.isChecked());
            meal.setVegetables(veggiesCheck.isChecked());
            meal.setDairy(dairyCheck.isChecked());
            meal.setProtein(proteinCheck.isChecked());

            final Controller controller = (Controller) getApplicationContext();
            String date = new SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.US).format(new Date());

            Intent intent = getIntent();
            if (intent.hasExtra(EXTRA_ID))
                controller.getDay(date).setTask(meal, intent.getIntExtra(EXTRA_POSITION, 0));
            else
                controller.getDay(date).addTask(meal);
        }
    }
}