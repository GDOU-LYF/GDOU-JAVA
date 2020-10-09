package edu.gdou.lession4;

public class House {
    private int area;
    public House(int area){
        this.area=area;
    }

    public int houseArea(){
        return this.area;
    }

    static class Test {
        private  int value;
        public Test(int value){
            this.value=value;
        }

        public int getValue(){
            return this.value;
        }
    }

}
