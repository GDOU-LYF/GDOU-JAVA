package edu.gdou.excise;

public class Demo4_79_7 {
    public static void main(String[] args) {
        int[] a={7,5,32,9,25,100};
        int min,max;
        min=max=a[0];
        int min_index,max_index;
        min_index=max_index=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[j]>max){
                    max=a[j];
                    max_index=j;
                }
                if (a[j]<min){
                    min=a[j];
                    min_index=j;
                }
            }
        }
        //最小数交换,最大数交换
        if (min_index!=0){
            int temp=a[0];
            a[0]=a[min_index];
            a[min_index]=temp;
        }
        if(max_index!=a.length-1){
            int temp=a[a.length-1];
            a[a.length-1]=a[max_index];
            a[max_index]=temp;
        }
        for (int j : a) {
            System.out.print(j + "\t");
        }
        System.out.println();
    }
}
