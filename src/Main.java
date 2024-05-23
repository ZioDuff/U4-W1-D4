import Entities.*;
import Enums.TypeOfWork;
import Intefaces.CheckIn;

public class Main {
    public static void main(String[] args) {
//        Dipendente jacopo = new Dipendente("1", 2000.15, TypeOfWork.AMMINISTRAZIONE);
//        Dipendente giovanni = new Dipendente("2", 1999, TypeOfWork.VENDITE);
//        Dipendente davide = new Dipendente("3", 1999, TypeOfWork.PRODUZIONE);
//
//        System.out.println("Questo è jacopo " + jacopo);
//
//        Dipendente[] arrDipendenti = {jacopo, giovanni, davide};
//        for (int i = 0; i < arrDipendenti.length; i++) {
//            System.out.println("Matricola Numero : " + arrDipendenti[i].get_id());
//        }

        DipendenteFullTIme jacopo = new DipendenteFullTIme("1", 5.6, TypeOfWork.AMMINISTRAZIONE);

        DipendentePartTIme giovanni = new DipendentePartTIme("12", 2, TypeOfWork.PRODUZIONE);

        Dirigente gesu = new Dirigente("0", 9999, TypeOfWork.VENDITE);

        Dipendente[] arrDipendenti = {jacopo, giovanni, gesu};
//        System.out.println("Stipendio 28 giorni di jacopo: " + jacopo.calculateSalary(28) + " euri");
//        System.out.println("Stipendio 28 giorni di giovanni: " + giovanni.calculateSalary(28) + " euri");
//        System.out.println("Stipendio 28 giorni di gesu: " + gesu.calculateSalary(28) + " euri");
//        System.out.println("Questo è il totale degli stipendi se hanno lavorato 28 giorni: " + (jacopo.calculateSalary(28) + giovanni.calculateSalary(28) + gesu.calculateSalary(28)) + " euri");
        for (int i = 0; i < arrDipendenti.length; i++) {
            System.out.println("questo è lo stipendio della matricola " + arrDipendenti[i].get_id() + " ed è " + arrDipendenti[i].calculateSalary(28));
        }

        Volontario noe =  new Volontario()

        CheckIn[] tuttiALavorare ={}
    }
}