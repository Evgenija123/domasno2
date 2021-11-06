package oop;

public class Ocenka {
    private String predmet;
    private String d_ispit;
    private int ocenka;

    public String getPredmet() {

        return predmet;
    }

    public void setPredmet(String predmet) {

        this.predmet = predmet;
    }

    public String getD_ispit() {

        return d_ispit;
    }

    public void setD_ispit(String d_ispit) {

        this.d_ispit = d_ispit;
    }

    public int getOcenka() {

        return ocenka;
    }

    public void setOcenka(int ocenka) {

        this.ocenka = ocenka;
    }

    public String toString() {

        return   (getPredmet() + ", polagan na " + getD_ispit() + " ocena: " + getOcenka()+" \n ");
    }
}

