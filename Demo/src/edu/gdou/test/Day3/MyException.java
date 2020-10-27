package edu.gdou.test.Day3;


public class MyException extends Exception {
    String message;

    public MyException(String s) {
        message = s;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
