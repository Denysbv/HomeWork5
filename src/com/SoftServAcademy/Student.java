package com.SoftServAcademy;

public class Student extends Person {
    private final String TYPE_PERSON = "Student";

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    @Override
    public void print() {
        System.out.println("I am a " + getTYPE_PERSON() + ".");
    }

    public Student(String name) {
        super(name);
    }
    public Student() {

    }
}
