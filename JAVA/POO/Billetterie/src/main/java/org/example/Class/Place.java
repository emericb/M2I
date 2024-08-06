package org.example.Class;

public class Place extends adress {

    public Place(String rue, String ville) {
        super(rue, ville);
    }

    @Override
    public String toString() {
        return "Place{" +
                "rue='" + rue + '\'' +
                ", ville='" + ville + '\'' +
                '}';
    }
}
