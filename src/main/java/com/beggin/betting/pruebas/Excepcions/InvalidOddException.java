package com.beggin.betting.pruebas.Excepcions;

public class InvalidOddException extends RuntimeException {
    public InvalidOddException(String message){
            super(message);
    }
}
