package edu.gdou.D7;

import java.lang.reflect.Field;

public class Example7_21 {
    public static void main(String[] args) throws SecurityException,
            NoSuchFieldException, NoSuchMethodError, IllegalArgumentException, Exception {
        Person p1 = new Person("danard", "trump");
        changeInitialLetter(p1);
        System.out.println(p1);
    }

    public static void changeInitialLetter(Object obj) throws IllegalAccessException {
        Field[] fields = obj.getClass().getFields();
        for (Field field : fields) {
            if (field.getType() == String.class) ;
            String oldValue = (String) field.get(obj);
            char initialLetter = oldValue.charAt(0);
            System.out.println(initialLetter);
            if (initialLetter <= 'z' && initialLetter >= 'a') {//将小写的开头转换为大写的字母
                initialLetter -= 32;
            }
            String newValue = initialLetter + oldValue.substring(1);
            field.set(obj, newValue);
        }

    }
}
