import Entities.*;
import Enums.TypeOfWork;
import Intefaces.CheckIn;

public class Main {
    public static void main(String[] args) {
//        (-----------------------------EX1--------------------------)
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
//        (----------------------------EX2-----------------------------------)
        DipendenteFullTIme jacopo = new DipendenteFullTIme("1", 5.6, TypeOfWork.AMMINISTRAZIONE);

        DipendentePartTIme giovanni = new DipendentePartTIme("12", 2, TypeOfWork.PRODUZIONE);

        Dirigente gesu = new Dirigente("0", 9999, TypeOfWork.VENDITE);

        Dipendente[] arrDipendenti = {jacopo, giovanni, gesu};
        double sum = 0;
        for (int i = 0; i < arrDipendenti.length; i++) {
            sum += arrDipendenti[i].calculateSalary(28);
        }
        System.out.println("la somma degli stipendi è " + sum);
//        (-------------------------------EX3------------------------)
        Volontario noe = new Volontario("noe", 99);

        CheckIn[] tuttiALavorare = {jacopo, noe, giovanni, gesu};
        for (int i = 0; i < tuttiALavorare.length; i++) {
            tuttiALavorare[i].checkIn();
        }
    }
}