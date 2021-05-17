package com.example.katyramashay.DataModelingClasses;

import android.app.Application;

import com.example.katyramashay.LogEntry;

import java.util.ArrayList;

public class Controller extends Application {

    private Patient patient = new Patient();
    private ArrayList<LogEntry> entriesList = new ArrayList<>();

    /**
     * sets patient object to a user-specified patient
     * @param p user-inputted patient
     */
    public void setPatient(Patient p) {
        patient = p;
    }

    /**
     * returns the first name of the patient as a string
     * @return patient's name as a string
     */
    public String getFirstName() {
        return patient.getFirstName();
    }

    /**
     * sets the first name of the patient to a user-specified string
     * @param fName the first name of the patient
     */
    public void setFirstName(String fName) {
        patient.setFirstName(fName);
    }

    /**
     * returns the middle name of the patient as a string
     * @return patient's middle name
     */
    public String getMiddleName() {
        return patient.getMiddleName();
    }

    /**
     * sets the middle name of the patient to a user-specified string
     * @param mName the middle name of the patient
     */
    public void setMiddleName(String mName) {
        patient.setMiddleName(mName);
    }

    /**
     * returns the last name of the patient as a string
     * @return the patient's last name
     */
    public String getLastName() {
        return patient.getLastName();
    }

    /**
     * sets the last name of the patient to a user-specified string
     * @param lName the last name of the patient
     */
    public void setLastName(String lName) {
        patient.setLastName(lName);
    }

    /**
     * returns the birth date of the patient
     * @return the patient's birth date
     */
    public String getBirthday() {
        return patient.getBirthday();
    }

    /**
     * sets the birth date of the user to a specific month, day, and year
     * @param month patient's birth month
     * @param day patient's birth day
     * @param year patient's birth year
     */
    public void setBirthday(int month, int day, int year) {
        patient.setBirthday(year, month, day);
    }

    /**
     * returns the address of the patient (room number, suite, apartment, etc.)
     * @return the patient's location in the center
     */
    public String getLocation() {
        return patient.getLocation();
    }

    /**
     * sets the location of the patient to a user-specified string
     * @param loc the location of the patient
     */
    public void setLocation(String loc) {
        patient.setLocation(loc);
    }

    /**
     * adds a day of to the patient's account
     * @param day the date the patient added the day
     */
    public void addDay(Day day) {
        patient.addDay(day);
    }

    /**
     * returns the date of the day
     * @param date the date
     * @return the date the user specified
     */
    public Day getDay(String date) {
        return patient.getDay(date);
    }

    /**
     * returns the list of medications as an ArrayList of strings
     * @return the list of medications
     */
    public ArrayList<String> getMedications() {
        return patient.getMedications();
    }

    /**
     * adds a medication to the list
     * @param medication the patient's new medication
     */
    public void addMedications(String medication) {
        patient.addMedications(medication);
    }

    /**
     * removes a medication from the user's account
     * @param index the position of the medication in the ArrayList
     */
    public void removeMedications(int index) {
        patient.removeMedications(index);
    }

    /**
     * returns the list of allergies as an ArrayList of strings
     * @return the list of allergies
     */
    public ArrayList<String> getAllergies() {
        return patient.getAllergies();
    }

    /**
     * adds and allergy to the list
     * @param newAllergy the patient's new allergy
     */
    public void addAllergy(String newAllergy){
        patient.addAllergy(newAllergy);
    }

    /**
     * removes an allergy from the user's account
     * @param index the position of the allergy in the ArrayList
     */
    public void removeAllergy(int index) {
        patient.removeAllergy(index);
    }

    /**
     * allows the user to add a log entry that they can record for that day
     * @param log the log entry that the user filled out
     */
    public void addLogEntry(LogEntry log) { entriesList.add(log); }

    /**
     * returns the log entry of the index specified
     * @param index the position in the arraylist of the log entry wanted
     * @return the log entry that is stored at the user-specified index
     */
    public LogEntry getLogEntry(int index) { return entriesList.get(index); }
}
