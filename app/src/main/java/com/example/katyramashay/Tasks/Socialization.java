package com.example.katyramashay.Tasks;

import java.util.ArrayList;

public class Socialization extends Task {

    private ArrayList<String> people;
    private String activity;

    public Socialization() {
        people = new ArrayList<>();
        activity = "";
    }

    public String getPeople() {
        return people.toString();
    }

    public void addPeople(String person) {
        people.add(person);
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

}
