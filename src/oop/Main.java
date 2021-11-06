package oop;
public class Main {

    public static void main(String[] args) {

            Student foster = new Student();
            foster.setIme("Ana");
            foster.setPrezime("Trajkovska");
            foster.setBr_indeks("INKI3322");
//---------------------------------------------------------
            Ocenka first = new Ocenka();
            first.setPredmet("Algoritmi i strukturi na podatoci");
            first.setD_ispit("[23.11.2021]");
            first.setOcenka(9);
            foster.setOcenka(first);
//---------------------------------------------------------
            Ocenka second = new Ocenka();
            second.setPredmet("Organizacisko pretpriemnistvo(izboren)");
            second.setD_ispit("[26.11.2021]");
            second.setOcenka(9);
            foster.setOcenka(second);
//---------------------------------------------------------
            Ocenka third = new Ocenka();
            third.setPredmet("Objektno orientirano programiranje");
            third.setD_ispit("[22.11.2021]");
            third.setOcenka(8);
            foster.setOcenka(third);
//---------------------------------------------------------
            Ocenka fourth = new Ocenka();
            fourth.setPredmet("Sistsmeski softver");
            fourth.setD_ispit("[24.11.2021]");
            fourth.setOcenka(7);
            foster.setOcenka(fourth);
//---------------------------------------------------------
            Ocenka fifth = new Ocenka();
            fifth.setPredmet("Podatocni komunikacii i mrezi");
            fifth.setD_ispit("[25.11.2021]");
            fifth.setOcenka(9);
            foster.setOcenka(fifth);
//---------------------------------------------------------

            Covek o1 = new Covek("Ana","Trajkovska");

            System.out.println(foster);
            System.out.println("Studentot " + o1 + " so broj na indeks: " + foster.getBr_indeks()  + " ostvaril prosek " + foster.getProsek() );
            System.out.println("--------------------------------------------------------------------------");

        }

    }
