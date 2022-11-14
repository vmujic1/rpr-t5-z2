package org.example;

public class Factory {

    public Sistemi dajSistem(String opis) {
        if (opis == null) {
            return null;
        } else if (opis.equalsIgnoreCase("Android")) {
            return new Android();
        } else if (opis.equalsIgnoreCase("iOS")) {
            return new iOS();

        }
        return null;
    }
}
