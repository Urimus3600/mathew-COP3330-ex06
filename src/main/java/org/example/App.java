/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Austin Mathew
 */

package org.example;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App
{
    public static int string2Num(String strNum){
        int num=0, max = strNum.length();
        for (int i = 0; i < max; i++) {
            num = num*10+(strNum.charAt(i)-48);
        }
        return num;
    }

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        Date date = new Date();
        int year = string2Num(new SimpleDateFormat("yyyy").format(date));

        System.out.print("What is your current age? ");
        int curAge = input.nextInt();

        System.out.print("At what age would you like to retire? ");
        int retireAge = input.nextInt();

        System.out.print("You have " + (retireAge-curAge) + " years left until you can retire.\n" +
                "It's " + year + ", so you can retire in " + (year+retireAge-curAge) + ".");


    }
}
