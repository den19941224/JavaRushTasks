package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        System.out.println(str2);
        System.out.println(str1.toUpperCase());
        System.out.println(str.toLowerCase());
    }
}
