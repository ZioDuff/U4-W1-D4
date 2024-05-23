package Entities;

import Enums.TypeOfWork;
import Intefaces.CheckIn;

//ATTRIBUTI
//COSTRUTTORE
public class DipendentePartTIme extends Dipendente implements CheckIn {
    public DipendentePartTIme(String _id, double salary, TypeOfWork department) {
        super(_id, salary, department);
    }

    //METODI
    @Override
    public double calculateSalary(int workedDays) {
        if (workedDays == 28) {
            return (this.salary * 5) * 28;
        } else if (workedDays == 30) {
            return (this.salary * 5) * 30;
        } else if (workedDays == 31) {
            return (this.salary * 5) * 31;

        } else {
            return 0;
        }
    }

    @Override
    public void checkIn() {
        System.out.println("sto iniziando il mio turno da 5 ore");
    }
}
