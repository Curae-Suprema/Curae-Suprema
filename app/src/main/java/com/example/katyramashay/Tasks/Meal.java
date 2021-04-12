package com.example.katyramashay.Tasks;

import java.util.ArrayList;

public class Meal extends Task{

    // instance variables
    private boolean vegetables;
    private boolean grains;
    private boolean dairy;
    private boolean fruits;
    private boolean protein;

    // constructors
    public Meal() {
        vegetables = false;
        grains = false;
        dairy = false;
        fruits = false;
        protein = false;
    }

    // methods
    public boolean getVegetables() {
        return vegetables;
    }

    public void setVegetables(boolean b) {
        vegetables = b;
    }

    public boolean getGrains() {
        return grains;
    }

    public void setGrains(boolean b) {
        grains = b;
    }

    public boolean getDairy() {
        return dairy;
    }

    public void setDairy(boolean b) {
        dairy = b;
    }

    public boolean getFruits() {
        return fruits;
    }

    public void setFruits(boolean b) {
        fruits = b;
    }

    public boolean getProtein() {
        return protein;
    }

    public void setProtein(boolean b) {
        protein = b;
    }

    @Override
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
