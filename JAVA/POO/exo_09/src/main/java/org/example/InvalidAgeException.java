package org.example;

public class InvalidAgeException extends Throwable {
    public InvalidAgeException() {
        super("\nL'âge ne peut pas être négatif.");
    }
}
