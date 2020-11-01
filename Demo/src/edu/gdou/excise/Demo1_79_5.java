package edu.gdou.excise;

//import java.util.Scanner;

public class Demo1_79_5 {//马鞍数

    public static void main(String[] args) {//行最小,列最大
//        Scanner reader=new Scanner(System.in);
//        int ret;
//        ret=reader.nextInt();
        int a[][] = {{1, 6, 7, 8, 9},
                {4, 5, 6, 7, 8},
                {3, 4, 5, 2, 1},
                {2, 3, 4, 9, 0},
                {5, 6, 7, 6, 8}};
        printArray(a);
        System.out.println("==================");
        int min, max;
        int x = 0, y = 0;

        for (int i = 0; i < a.length; i++) { //先取出每一行最小的
            min = a[i][0];//先定义每一行第一个为最小值
            x = i;
            y = 0;
            for (int j = 0; j < a[i].length; j++) {//比较每一行,找出最小数,会得到最小的x,y
                if (a[i][j] < min) {
                    min = a[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        int isi;
        for (isi = 0; isi < a.length; isi++) {//比较每一列,此时y轴固定,判断已选定数值x是不是最大值
            if (a[x][y] < a[isi][y]) {
                break;
            }
        }
        if (isi > a.length - 1) {
            System.out.println("马鞍数为" + a[x][y] + " (" + (x + 1) + "," + (y + 1) + ")");
        } else {
            System.out.println("不存在马鞍数!");
        }

    }

    public static void printArray(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
