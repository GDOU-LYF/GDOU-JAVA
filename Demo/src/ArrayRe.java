public class ArrayRe {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        printArray(a);
        for (int min = 0, max = a.length - 1; min < max; min++, max--) {
            int temp = a[min];
            a[min] = a[max];
            a[max] = temp;
        }
        printArray(a);
    }

    public static void printArray(int[] ar) {
        for (int j : ar) {
            System.out.print(j + "\t");
        }
        System.out.println();
    }
}
