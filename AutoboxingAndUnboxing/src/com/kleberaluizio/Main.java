package com.kleberaluizio;

public class Main {
    public static void main(String[] args) {

        // autoboxing, instead of calling a class constructor, the value is provide directly.
        Short num7 = 1;
        Byte num8 = 10;
        Integer num9 = 100;
        Long num10 = 100l;
        Float num11 = 3.5f;
        Double num12 = 2.5555;
        Boolean flag2 = true;
        Character b = 'b';

        //auto-unboxing
        int num13 = num9;  //num9.intValue();

        //autoboxing em expressoes
        num9++;
        System.out.println(num9);

        //auto boxing do num9 e autoboxing num13/num9
        Integer num14 = num13/num9;

    }
}
