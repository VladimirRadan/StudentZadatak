package main;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        List<Student> sviStudenti = new ArrayList<>();
        List<Student> studentiPolozili = new ArrayList<>();
        Student student;


        while (true){
            System.out.println("Unesite podatkje o studentu: ");
            System.out.println("Unesite ime studenta: ");
            String ime = scanner.next();
            if (ime.equalsIgnoreCase("quit")){
                break;
            }

            System.out.println("Unesite prezime studenta: ");
            String prezime = scanner.next();
            if (prezime.equalsIgnoreCase("quit")){
                break;
            }

            System.out.println("Unesite ocenu studenta: ");
            int ocena = scanner.nextInt();
            if ((ocena + "").equalsIgnoreCase("quit")){
                break;
            }

            student = new Student(ime, prezime, ocena);
            sviStudenti.add(student);
        }

        for (int i = 0; i < sviStudenti.size(); i++) {
            if (sviStudenti.get(i).getOcena() > 5){
                studentiPolozili.add(sviStudenti.get(i));
            }
        }

        System.out.println("Svi studenti: " + sviStudenti);
        System.out.println("Studenti koji su polozili: " + studentiPolozili);


// Napraviti klasu Student sa 3 polja, ime, prezime i ocena.
// Napraviti klasu koja sadrzi Main metodu i u njoj napraviti minimum 4 studenta cije podatke treba uneti preko scanner-a: ime prezime i ocena.
// Ocene treba da budu 5,6,7 i 9.
// Kreirati dve liste.
// Kada se preko scanner-a unesu podaci za studenta, taj student treba da se doda u listu.
// Dodati sve studente u jednu listu, a nakon toga u drugu dodati samo one koji su polozili tj. koji imaju ocenu vecu od 5 u drugu listu.
// Potrebno je to uraditi u petlji gde ce unos podataka za studente biti omogucen sve dok se ne unese "quit".
// Kada se unese "quit", program se prekida i ispisuje sve unete studente preko scanner-a a nakon toga i one koji su polozili tj. koji imaju vecu ocenu od 5.







    }
}
