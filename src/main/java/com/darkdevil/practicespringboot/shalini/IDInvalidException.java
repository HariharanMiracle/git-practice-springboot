package com.darkdevil.practicespringboot.shalini;

public class IDInvalidException extends Exception{
    IDInvalidException(String s){
        super("Id is not valid: " + s);
    }
}
