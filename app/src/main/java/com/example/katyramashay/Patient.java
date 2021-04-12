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
    private ArrayList<Day> days;
    private ArrayList<String> medications;
    private ArrayList<String> allergies;

    // constructors

    @RequiresApi(api = Build.VERSION_CODES.O)
    public Patient() {
        firstName = "";
        middleName = "";
        lastName = "";
        birthday = LocalDate.now();
        days = new ArrayList<>();
        location = "";
        medications = new ArrayList<>();
        allergies = new ArrayList<>();
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

    public void addDay(Day day) {
        days.add(day);
    }

    public Day getDay(String date) {
        for (int i = 0; i < days.size(); i++) {
            if (date.equals(days.get(i).getDate()))
                return days.get(i);
        }
        return null;
    }

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
