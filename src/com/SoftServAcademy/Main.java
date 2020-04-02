package com.SoftServAcademy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    // #1
        Animal cat1 = new Cat();
        Animal dog1 = new Dog();
        Animal cat2 = new Cat();
	    Animal [] animal = new Animal[3];
        animal[0] = cat1;
        animal[1] = dog1;
        animal[2] = cat2;
        for (Animal animal1 : animal) {
            System.out.println(animal1.voice());
            System.out.println(animal1.feed());
        }

        // #2
        Person teacher1 = new Teacher("tom", 100);
        Person cleaner1 = new Cleaner("rob", 20);
        Person student = new Student("zot");
        Person cleaner2 = new Cleaner("plo", 30);
        Person student2 = new Student("hol");

        Person [] people = new Person[5];
        people[0] = teacher1;
        people[1]= cleaner1;
        people[2]= student;
        people[3]= cleaner2;
        people[4]= student2;

        for (Person person: people) {
            person.print();
            if (person instanceof Staff) {
                System.out.println("Salary of " + person.getName() + " "
                                + ((Staff) person).salary());
            }
        }
    }
}
