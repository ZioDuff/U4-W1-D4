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
    @Override
    public void checkIn() {
        System.out.println("oggi è proprio una bella giornata per lavorare 18 ore");
    }
}
