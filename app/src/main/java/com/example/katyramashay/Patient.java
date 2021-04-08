package com.example.katyramashay;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;

public class Patient {

    // instance variables

    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate birthday;
    private String location;
    private Calendar calendar;
    private ArrayList<String> medications;
    private ArrayList<String> allergies;

    // constructors

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Patient() {
        firstName = "";
        middleName = "";
        lastName = "";
        birthday = LocalDate.now();
        // not sure how to initialize calendar
        location = "";
        medications = new ArrayList<String>();
        allergies = new ArrayList<String>();
    }

    // methods

    public void setFirstName(String fName) {
        firstName = fName;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String mName) {
        middleName = mName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lName) {
        lastName = lName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void setBirthday(int month, int day, int year) {
        birthday = LocalDate.of(year, month, day);
    }

    public void setLocation(String loc) {
        location = loc;
    }
    public String getLocation() {
        return location;
    }

    /*
    public Calendar getCalendar()
    public void addYear(Year y)
    */


    public ArrayList<String> getMedications() {
        return medications;
    }
    public void addMedications(String medication) {
        medications.add(medication);
    }
    public void removeMedications(String medication) {
        medications.remove(medication);
    }

    public ArrayList<String> getAllergies() {
        return allergies;
    }
    public void addAllergy(String newAllergy){
        allergies.add(newAllergy);
    }
    public void removeAllergy(String newAllergy) {
        allergies.remove(newAllergy);
    }
}
