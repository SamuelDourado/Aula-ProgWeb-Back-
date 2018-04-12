package br.edu.unievangelica.core.exception;

public class CustomDuplicatedException extends RuntimeException {

    public CustomDuplicatedException(String msg) {
        super(msg);
    }
}