import java.util.Arrays;
import java.util.Random;

public class ArraySort {
    public static void main(String[] args) {
        int a[]=new int[10];
        getElements(a);
        printArray(a);
//        Arrays.sort(a);
        sort(a);
        printArray(a);

    }
    public static void sort(int a[]){
        for (int i = 0; i <a.length-1 ; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

    }
    public static void getElements(int a[]){
        Random rand=new Random();
        for (int i=0;i<a.length;++i){
            a[i]=rand.nextInt(100);//创建小于100的随机数
        }
    }
    public static void printArray(int a[]){
        for (int i = 0; i < a.length; i++) {
            if (i!=0&&(i+1)%5==0){
                System.out.println(a[i]);
            }else{
                System.out.print(a[i]+"\t");
            }
        }
    }
}
