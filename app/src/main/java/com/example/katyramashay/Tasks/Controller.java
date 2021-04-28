package com.example.katyramashay.Tasks;

import android.app.Application;
import com.example.katyramashay.Patient;

import java.util.ArrayList;
import java.util.Calendar;

public class Controller extends Application {

    private Patient patient = new Patient();

    public void setPatient(Patient p) {
        patient = p;
    }

    public String getFirstName() {
        return patient.getFirstName();
    }

    public void setFirstName(String fName) {
        patient.setFirstName(fName);
    }

    public String getMiddleName() {
        return patient.getMiddleName();
    }

    public void setMiddleName(String mName) {
        patient.setMiddleName(mName);
    }

    public String getLastName() {
        return patient.getLastName();
    }

    public void setLastName(String lName) {
        patient.setLastName(lName);
    }

    public Calendar getBirthday() {
        return patient.getBirthday();
    }

    public void setBirthday(int month, int day, int year) {
        patient.setBirthday(year, month, day);
    }

    public String getLocation() {
        return patient.getLocation();
    }

    public void setLocation(String loc) {
        patient.setLocation(loc);
    }

    public void addDay(Day day) {
        patient.addDay(day);
    }

    public Day getDay(String date) {
        return patient.getDay(date);
    }

    public ArrayList<String> getMedications() {
        return patient.getMedications();
    }

    public void addMedications(String medication) {
        patient.addMedications(medication);
    }

    public void removeMedications(int index) {
        patient.removeMedications(index);
    }

    public ArrayList<String> getAllergies() {
        return patient.getAllergies();
    }

    public void addAllergy(String newAllergy){
        patient.addAllergy(newAllergy);
    }

    public void removeAllergy(int index) {
        patient.removeAllergy(index);
    }
}
