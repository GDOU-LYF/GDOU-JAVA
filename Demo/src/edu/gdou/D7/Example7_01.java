package edu.gdou.D7;

public class Example7_01 {
    public static void main(String[] args) {
        String str = "People's Republic of China";
        String ret = "字符串" + str + "中有:";
        ret = ret + countUpperCase(str)+"个大写字母";
        System.out.println(ret);
    }

    public static int countUpperCase(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }
        return count;
    }
}
