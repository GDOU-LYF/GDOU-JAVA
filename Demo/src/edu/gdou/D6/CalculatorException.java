package edu.gdou.D6;

public class CalculatorException extends Exception {
    public String errorMess;
    public CalculatorException(String mess){
        errorMess=mess;
    }
    @Override
    public String getMessage(){
        return errorMess;
    }
}
