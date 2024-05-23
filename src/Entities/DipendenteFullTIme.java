package Entities;

import Enums.TypeOfWork;
import Intefaces.CheckIn;

public class DipendenteFullTIme extends Dipendente implements CheckIn {
    //    ATTRIBUTI


    //    COSTRUTTORE
    public DipendenteFullTIme(String _id, double salary, TypeOfWork department) {
        super(_id, salary, department);
    }


    //    METODI
    @Override
    public void checkIn() {
        System.out.println("sto iniziando il mio turno di 8 ore");
    }

}
