package com.example.katyramashay;

/**
 * this class models the behavior of a patient
 */

import android.os.Build;
import androidx.annotation.RequiresApi;
import com.example.katyramashay.Tasks.Day;

import java.time.LocalDate;
import java.util.ArrayList;

public class Patient {

    //DATA
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate birthday;
    private String location;
    private ArrayList<Day> days;
    private ArrayList<String> medications;
    private ArrayList<String> allergies;


    //CONSTRUCTOR

    /**
     * creates the default constructor by setting all strings to be empty,
     * DOB to a default date, and arrayLists with empty strings
     */
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

    //METHODS

    /**
     * sets the first name to a user-specified full first name
     * @param fName the user's full first name
     */
    public void setFirstName(String fName) {
        firstName = fName;
    }

    /**
     * gets the first name of the user
     * @return the first name of the user
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * gets the middle name of the user
     * @return the user's full middle name
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * sets the middle name to a user-specified full middle name
     * @param mName the middle name of the user
     */
    public void setMiddleName(String mName) {
        middleName = mName;
    }

    /**
     * gets the last name of the user
     * @return the user's full last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * sets the last name to a user-specified full last name
     * @param lName the last name of the user
     */
    public void setLastName(String lName) {
        lastName = lName;
    }

    /**
     * gets the user's birth date
     * @return the user's DOB
     */
    public LocalDate getBirthday() {
        return birthday;
    }

    /**
     *
     * @param month
     * @param day
     * @param year
     */
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
