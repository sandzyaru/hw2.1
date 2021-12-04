package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(result(22, 31));
        System.out.println(result(25, 31));
        System.out.println(result(1, 31));
        System.out.println(result(45, 31));
        System.out.println(result(22, 39));

/*
●	Создать возвращаемый метод который будет принимать 2 входящих параметра - возраст человека и температуру на улице, и возвращать результат в виде строки.
●	Алгоритм метода должен работать следующим образом:
○	если возраст человека от 20 до 45 лет и температура на улице от -20 до 30 градусов, то возвращаемый результат - “Можно идти гулять”;
○	если же человеку меньше 20 лет и температура на улице в диапазоне от 0 до 28 градусов, то результат снова -  “Можно идти гулять”;
○	а если человеку больше 45 лет, то результат “Можно идти гулять” формируется только тогда когда на улице температура в диапазоне от -10 до 25 градусов;
○	В остальных случаях метод должен возвращать результат - “Оставайтесь дома”;
*/


    }

    public static String result(int s1, int s2) {
        Scanner inputFigure = new Scanner(System.in);
        System.out.println("Возраст человека: ");
        s1 = inputFigure.nextInt();
        System.out.println("Температура на улице: ");
        s2 = inputFigure.nextInt();
        if (s1 > 20 & s1 < 45 & s2 > -20 & s2 < 30) {
            System.out.println("Можно идти гулять");

        } else if (s1 < 20 & s2 > 0 & s2 < 28) {
            System.out.println("Можно идти гулять1");
        } else if (s1 > 45 & s2 > -10 & s2 < 25) {
            System.out.println("Можно идти гулять2");
        } else {
            System.out.println("Оставайтесь дома");
        }
        return "Возраст человека:" + s1 + " Температура на улице: " + s2;
    }


}