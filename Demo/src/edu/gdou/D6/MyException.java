package edu.gdou.D6;

public class MyException extends Exception {
    String message;
    public MyException(String error){
        message=error;
    }
    @Override
    public String getMessage(){
        return message;
    }
}
