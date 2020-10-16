package edu.gdou.D6;

public class Calculator {
    public int div(int x,int y) throws CalculatorException{
        if(y==0){
            throw new CalculatorException("被0除了!");//异常产生了
        }
        return x/y;
    }
}
