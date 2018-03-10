package com.pawlang;


public class User {
    private String imie;
    private String nazwisko;
    private String cardNumber;
    private String expiryDate;

    public User(String imie, String nazwisko, String cardNumber, String expiryDate) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    void printUser (){
        System.out.println(imie.toUpperCase() + " " + nazwisko.toUpperCase() + ": " + maskCardNumber() + " " + expiryDate);
    }

    String writeToString () {
        return imie.toUpperCase() + " " + nazwisko.toUpperCase() + ": " + maskCardNumber() + " " + expiryDate;
    }

    String left(){
        return cardNumber.substring(0,4);
    }
    String right(){
        return cardNumber.substring(12,16);
    }
    String maskCardNumber(){
        return left()+"XXXXXXXX"+right();
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}
