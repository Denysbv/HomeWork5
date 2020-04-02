package com.SoftServAcademy;

public class Dog implements Animal {

    @Override
    public String voice() {
        return "Woof";
    }

    @Override
    public boolean feed() {
        return true;
    }
}
