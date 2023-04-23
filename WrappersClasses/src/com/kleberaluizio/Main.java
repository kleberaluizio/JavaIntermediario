package com.kleberaluizio;

public class Main {
    public static void main(String[] args) {
        short num1 = 1;
        byte num2 = 10;
        int num3 = 100;
        long num4 = 10000l;
        float num5 = 3.5f;
        double num6 = 3.5555;
        boolean flag = true;
        char a = 'a';

//      Short num7 = new Short((short) num1); // It is deprecated!
        Short num7 = Short.valueOf(num1); // Use on daily basis!
        System.out.println(num7);
        Byte num8 = new Byte((byte) num2);
        Integer num9 = new Integer(num3);
        Long num10 = new Long(num4);
        Float num11 = new Float(num5);
        Double num12 = new Double(num6);
        Boolean flag2 = new Boolean(flag);
        Character b = new Character('b');

        Integer num13 = new Integer("10000");
        Double num14 = new Double(3.5);

        System.out.println(num13.intValue());

        Long num15 = num13.longValue();

        int num16 = Integer.parseInt("10000");

        double num17 = Double.parseDouble("3.555");
        System.out.println(num17);

        Integer num18 = Integer.valueOf(1343);
        System.out.println(num18);

    }
}
