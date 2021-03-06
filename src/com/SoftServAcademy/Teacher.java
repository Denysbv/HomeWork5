package com.SoftServAcademy;

public class Teacher extends Staff {

    public final String TYPE_PERSON = "Teacher";

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

    public Teacher(String name, int salary) {
        super(name, salary);
    }

    public Teacher() {
    }

}
