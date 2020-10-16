package edu.gdou.D6;

public class Example6_05 {
//    int [] arrays;
    public static void main(String[]args){
        Calculator aCalculator =new Calculator();
        try{
            System.out.println(aCalculator.div(25,6));
            System.out.println(aCalculator.div(25,0));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
