package edu.gdou.D7;

public class Example7_02 {
    public static void main(String []args) {
        String str = "This is ana book";
        String substr = "ana";
        String ret="从"+str+"中删除"+substr;
        ret+=" 后的子串:"+delChars(str,substr);
        System.out.println(ret);

    }

    public static String delChars(String str, String subStr) {
        int index = 0;
        int length = 0;
        String s1, s2,ret;
        index = str.indexOf(subStr);//取子串开始索引
        length=subStr.length();//取长度
        //取两块部分,前段,后段
        if (index!=-1){
            s1=str.substring(0,index);
            s2=str.substring(index+length);//取子串结束以后索引
            ret=s1+s2;
        }else{
            ret="No "+subStr+"found.";
        }
        return ret;
    }
}
