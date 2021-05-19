package com.example.CuraeSuprema.DataModelingClasses;

/**
 * this class models the behavior of the social activities that a patient does
 */

public class Socialization extends Task {

    //DATA
    private String people;
    private String activity;


    //CONSTRUCTORS

    /**
     * creates the default constructor by setting all string to be empty
     */
    public Socialization() {
        super.setTaskName("Socialization");
        people = "";
        activity = "";
    }


    //METHODS

    /**
     * gets the people that the patient did their activity with
     * @return people in the form of a string
     */
    public String getPeople() {
        return people;
    }

    public void setPeople(String people) { this.people = people; }

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
