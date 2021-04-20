package com.example.katyramashay.Tasks;

/**
 * this class models the behavior of the social activities that a patient does
 */

import java.util.ArrayList;

public class Socialization extends Task {

    //DATA
    private ArrayList<String> people;
    private String activity;


    //CONSTRUCTORS

    /**
     * creates the default constructor by setting
     * people to be filled with empty strings, and the activity
     * name to be empty
     */
    public Socialization() {
        people = new ArrayList<>();
        activity = "";
    }


    //METHODS

    /**
     * gets the people that the patient did their activity with
     * @return people in the form of a string
     */
    public String getPeople() {
        return people.toString();
    }

    /**
     * adds people to the list of people the activity was done with
     * @param person name of someone who participated in the same activity
     */
    public void addPeople(String person) {
        people.add(person);
    }

    /**
     * gets the name of the activity that the patient did
     * @return name of the activity
     */
    public String getActivity() {
        return activity;
    }

    /**
     * sets the name of the activity to a user-specified name
     * @param activity the name of the activity completed
     */
    public void setActivity(String activity) {
        this.activity = activity;
    }

}
