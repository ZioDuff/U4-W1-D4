package Entities;

import Intefaces.CheckIn;

public class Volontario implements CheckIn {
    //    ATTRIBUTI
    private String name;
    private int age;
    private String CV;

    //    COSTRUTTORE
    public Volontario(String name, int age) {
        this.name = name;
        this.age = age;

    }

    //    METODI


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCV() {
        return CV;
    }

    public void setCV(String CV) {
        this.CV = CV;
    }

    @Override
    public void checkIn() {
        System.out.println("oggi è proprio una bella giornata per lavorare 18 ore");
    }
}
