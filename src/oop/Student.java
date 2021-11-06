package oop;

import java.util.Arrays;

public class Student extends Covek{

    private String br_indeks;
    private float prosek;
    private static  int i = 0;
    Ocenka[] niza_od_ocenki = new Ocenka[5];

    public String getBr_indeks() {

        return br_indeks;
    }

    public void setBr_indeks(String br_indeks) {

        this.br_indeks = br_indeks;
    }

    public void setOcenka(Ocenka o){
        niza_od_ocenki[i] = o;
        Student.i++;
    }

    public Float getProsek() {
        for (int j=0; j < 5; j++) {
            prosek += niza_od_ocenki[j].getOcenka();

        }
        prosek /= i;
        return prosek;
    }

    public String  toString() {
        System.out.println("--------------------------------------------------------------------------");
        return "Studentot: " + getIme() + " " + getPrezime().toString() + ",so indeks: " + getBr_indeks() + " gi ima:" + "\n"+Arrays.toString(niza_od_ocenki);

    }
}
