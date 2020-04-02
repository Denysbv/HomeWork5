package com.SoftServAcademy;

public class Cleaner extends Staff {

    public final String TYPE_PERSON = "Cleaner";

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    @Override
    public int salary() {
        return super.salary;
    }

    @Override
    public void print() {
        System.out.println("I am a " + getTYPE_PERSON() + ".");
    }

    public Cleaner() {
    }

    public Cleaner(String name, int salary) {
        super(name, salary);
    }
}
