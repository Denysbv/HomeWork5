package com.SoftServAcademy;

public class Cat implements Animal {
    @Override
    public String voice() {
        return "Meow";
    }

    @Override
    public boolean feed() {
        return true;
    }
}
