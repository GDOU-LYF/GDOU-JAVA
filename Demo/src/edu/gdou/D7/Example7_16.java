package edu.gdou.D7;

public class Example7_16 {
    public static void main(String[] args) {
        Runtime runtime=Runtime.getRuntime();
        try{
            Process p= runtime.exec("notepad");
        }
        catch(Exception e){
            System.out.println("error");
        }
    }
}
