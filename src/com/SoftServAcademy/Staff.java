package com.SoftServAcademy;

public abstract class Staff extends Person {
    int salary;


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Staff() {
    }

    public Staff(String name, int salary) {
        super.name = name;
        this.salary = salary;
    }

    public abstract int salary ();
}
