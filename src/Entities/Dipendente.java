package Entities;

import Enums.TypeOfWork;

public abstract class Dipendente {
    //    ATTRIBUTI
    protected String _id;
    protected double salary;
    protected TypeOfWork department;

    //COSTRUTTURI
    public Dipendente(String _id, double salary, TypeOfWork department) {
        this._id = _id;
        this.salary = salary;
        this.department = department;

    }
//METODI

    public String get_id() {
        return _id;
    }


    public double getSalary() {
        return salary;
    }


    public TypeOfWork getDepartment() {
        return department;
    }

    public void setDepartment(TypeOfWork department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Dipendente{" +
                "_id='" + _id + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }

    public double calculateSalary(int workedDays) {
        if (workedDays == 28) {
            return (this.salary * 8) * 28;
        } else if (workedDays == 30) {
            return (this.salary * 8) * 30;
        } else if (workedDays == 31) {
            return (this.salary * 8) * 31;

        } else {
            return 0;
        }
    }


}
