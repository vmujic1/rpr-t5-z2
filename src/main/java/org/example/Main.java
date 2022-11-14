package org.example;

public class Main {
    public static void main(String[] args) {

        Factory f = new Factory();
        Sistemi prvi = f.dajSistem("Android");
        prvi.opisSistema();

        Sistemi drugi = f.dajSistem("iOs");
        drugi.opisSistema();
    }
}