package edu.gdou.excise;

public class Demo2_79_13 {//完数

    public static void main(String[] args) {
//        int a = 7;
//        System.out.println(isFinishCount(a));
        printFinishCount(1, 1000);
    }

    public static int[] countArray(int a) {
        int ret[] = new int[a + 1];//def length max
        int count = 0; //Array length
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                ret[count++] = i;
            }
        }
        return ret;
    }

    public static int arraySum(int a[]) {
        int ret = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                break;
            } else {
                ret += a[i];
            }
        }
        return ret;
    }

    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            if (i != 0 && (i + 1) % 5 == 0) {
                System.out.println(a[i]);
            } else {
                System.out.print(a[i] + "\t");
            }
        }
    }

    public static boolean isFinishCount(int a) {
        int MAX = 1000;
        boolean ret;
        int[] array = countArray(a);
        if (a == arraySum(array)) {
            ret = true;
        } else {
            ret = false;
        }
        return ret;
    }

    public static void printFinishCount(int min, int max) {
        int count = 0;
        for (int i = min; i < max; i++) {
            if (isFinishCount(i)) {
                count++;
                if (count % 5 == 0) {
                    System.out.println(i);
                } else {
                    System.out.print(i + "\t");
                }
            }
        }
        System.out.println();
        System.out.println("从" + min + "到" + max + "的完数有" + count + "个");
    }
}
