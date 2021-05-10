package com.example.katyramashay.DataModelingClasses;

/**
 * this class models the behavior of the meals a patient eats in a day,
 * specifically, the kinds of foods that make up the patient's meal
 */

import java.util.ArrayList;

public class Meal extends Task{

    //DATA
    private boolean vegetables;
    private boolean grains;
    private boolean dairy;
    private boolean fruits;
    private boolean protein;


    //CONSTRUCTOR

    /**
     * creates the default constructor by setting all booleans to false
     */
    public Meal() {
        super.setTaskName("Meal");
        vegetables = false;
        grains = false;
        dairy = false;
        fruits = false;
        protein = false;
    }


    //METHODS

    /**
     * gets whether or not the user had veggies in their meal
     * @return value of vegetables
     */
    public boolean getVegetables() {
        return vegetables;
    }

    /**
     * sets whether or not the user had veggies in their meal
     * @param b user-inputted value of vegetables
     */
    public void setVegetables(boolean b) {
        vegetables = b;
    }

    /**
     * gets whether or not the user had grains in their meal
     * @return value of grains
     */
    public boolean getGrains() {
        return grains;
    }

    /**
     * sets whether or not the user had grains in their meal
     * @param b user-inputted value of grains
     */
    public void setGrains(boolean b) {
        grains = b;
    }

    /**
     * gets whether or not the user had dairy in their meal
     * @return value of dairy
     */
    public boolean getDairy() {
        return dairy;
    }

    /**
     * sets whether or not the user had dairy in their meal
     * @param b user-inputted value of dairy
     */
    public void setDairy(boolean b) {
        dairy = b;
    }

    /**
     * gets whether or not the user had fruits in their meal
     * @return value of fruits
     */
    public boolean getFruits() {
        return fruits;
    }

    /**
     * sets whether or not the user had fruits in their meal
     * @param b user-inputted value of fruits
     */
    public void setFruits(boolean b) {
        fruits = b;
    }

    /**
     * gets whether or not the user had protein in their meal
     * @return value of protein
     */
    public boolean getProtein() {
        return protein;
    }

    /**
     * sets whether or not the user had protein in their meal
     * @param b user-inputted value of protein
     */
    public void setProtein(boolean b) {
        protein = b;
    }

    @Override
    /**
     * overrides the parent behavior and returns a
     * string that stores the foods groups that the patient ate
     * in a meal
     */
    public String toString() {
        String s = "";
        if (vegetables)
            s += " Vegetables, ";
        if (grains)
            s += "Grains, ";
        if (dairy)
            s += "Dairy, ";
        if (fruits)
            s += "Fruits, ";
        if (protein)
            s += "Protein, ";
        return s.substring(0, s.length() - 1);
    }

    /**
     * converts the stored booleans to an arrayList that stores whether or not
     * the patient had a meal with the each of the 5 food groups
     * @return the arrayList of foods that were eaten in that one meal
     */
    public ArrayList<String> toArrayList(){
        ArrayList<String> s = new ArrayList<String>();
        if (vegetables)
            s.add("Vegetables");
        if (grains)
            s.add("Grains");
        if (dairy)
            s.add("Dairy");
        if (fruits)
            s.add("Fruits");
        if (protein)
            s.add("Protein");
        return s;
    }
}
