package oop;

public class Covek {

    public  String ime;
    public String prezime;

    public Covek(String ime, String prezime) {
        this.ime = ime;
        this.prezime= prezime;
    }

    public Covek() {
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {

        this.ime = ime;
    }

    public String getPrezime() {

        return prezime;
    }

    public void setPrezime(String prezime) {

        this.prezime = prezime;
    }


    public String toString() {

        return  getIme() + " " +  getPrezime();
    }
}


