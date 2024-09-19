package com.octavio.sebi_languages.exception;

public class CodigoUniqueViolationException extends RuntimeException {
    public CodigoUniqueViolationException(String message) {
        super(message);
    }
}