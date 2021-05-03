package com.example.katyramashay.DataModelingClasses;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Day {

   //DATA
    private final ArrayList<Task> taskList;
    private final String dateStamp;

    //CONSTRUCTOR

    /**
     * creates the default constructor
     * assigns the arrayList to be filled with empty strings
     * assigns the date to a default day
     */
    public Day() {
        taskList = new ArrayList<>();
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEEEEEEE, MMMMMMMMM dd, yyyy", Locale.US);
        dateStamp = sdf.format(date);
    }

    //METHODS

    /**
     * returns the time stamp for the activity
     * @return the date that is stored in dataStamp
     */
    public String getDate() {
        return dateStamp;
    }

    /**
     * allows the user to add a task that they can keep track of for that day
     * @param task the task that the user completed that day
     */
    public void addTask(Task task) {
        taskList.add(task);
    }

    /**
     * returns the task that the user added to the day
     * @param index the position of the task in the taskList arrayList
     * @return the string that is stored at the user-specified index
     */
    public Task getTask(int index) {
        return taskList.get(index);
    }

    public int getCompletionPercentage() {
        int completedTasks = 0;

        for (int i = 0; i < taskList.size(); i++) {
            if (taskList.get(i).getCompletion())
                completedTasks++;
        }

        return (int) (completedTasks * 100.0 / taskList.size());
    }
}
