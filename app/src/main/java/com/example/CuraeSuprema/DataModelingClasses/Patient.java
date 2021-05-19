package com.example.CuraeSuprema.DataModelingClasses;

import com.example.CuraeSuprema.LogEntry;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Patient {

    //DATA
    private String firstName;
    private String middleName;
    private String lastName;
    private String birthday;
    private String location;
    private Day defaultDay;
    private final ArrayList<Day> days;
    private final ArrayList<String> medications;
    private final ArrayList<String> allergies;
    private final ArrayList<LogEntry> entriesList;



    //CONSTRUCTOR

    /**
     * creates the default constructor by setting all strings to be empty,
     * DOB to a default date, and arrayLists with empty strings
     */
    public Patient() {
        firstName = "";
        middleName = "";
        lastName = "";
        birthday = new SimpleDateFormat("EEEE, MMMM dd, yyyy", Locale.US).format(new Date());
        location = "";
        defaultDay = new Day();
        days = new ArrayList<>();
        medications = new ArrayList<>();
        allergies = new ArrayList<>();
        entriesList = new ArrayList<>();
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
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(int month, int day, int year) {

        switch(month) {
            case 1: month = Calendar.JANUARY; break;
            case 2: month = Calendar.FEBRUARY; break;
            case 3: month = Calendar.MARCH; break;
            case 4: month = Calendar.APRIL; break;
            case 5: month = Calendar.MAY; break;
            case 6: month = Calendar.JUNE; break;
            case 7: month = Calendar.JULY; break;
            case 8: month = Calendar.AUGUST; break;
            case 9: month = Calendar.SEPTEMBER; break;
            case 10: month = Calendar.OCTOBER; break;
            case 11: month = Calendar.NOVEMBER; break;
            case 12: month = Calendar.DECEMBER; break;
            default: month = Calendar.JANUARY;
        }

        Calendar dateStamp = Calendar.getInstance();
        dateStamp.set(year, month, day);
        Date date = dateStamp.getTime();
        birthday = new SimpleDateFormat("MMMM dd, yyyy", Locale.US).format(date);
    }

    public void setLocation(String loc) {
        location = loc;
    }

    public String getLocation() {
        return location;
    }

    public void setDefaultDay(Day day) {
        defaultDay = day;
    }

    public Day getDefaultDay() {
        return defaultDay;
    }

    public void addDay(Day day) {
        days.add(day);
    }

    public Day getDay(String date) {
        for (int i = 0; i < days.size(); i++) {
            if (date.equals(days.get(i).getDate())) {
                return days.get(i);
            }
        }
        days.add(new Day());
        return days.get(days.size() - 1);
    }

    public ArrayList<String> getMedications() {
        return medications;
    }

    public void addMedications(String medication) {
        medications.add(medication);
    }

    public void removeMedications(int index) {
        medications.remove(index);
    }

    public ArrayList<String> getAllergies() {
        return allergies;
    }

    public void addAllergy(String newAllergy){
        allergies.add(newAllergy);
    }

    public void removeAllergy(int index) {
        allergies.remove(index);
    }
}
