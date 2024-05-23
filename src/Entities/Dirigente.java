package Entities;

import Enums.TypeOfWork;
import Intefaces.CheckIn;

public class Dirigente extends Dipendente implements CheckIn {
    public Dirigente(String _id, double salary, TypeOfWork department) {
        super(_id, salary, department);
    }

    @Override
    public void checkIn() {
        System.out.println("8 ore ma non faro nulla");
    }
}
