package com.example;

import java.util.Scanner;

import static java.lang.Boolean.TRUE;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int inputCounter =0;
    public static int readNumber() {
        inputCounter++;
        if (sc.hasNextInt()){
            int output = sc.nextInt();
            return  output;
        }
        else{
            System.out.println("Exit... Wrong data");
            System.exit(0);
            return 0;
        }
    }

    public static char readAction(){
        String input = sc.next();
        switch (input.charAt(0)){
            case '+':
                return '+';
            case '-':
                return '-';
            case '/':
                return '/';
            case '*':
                return '*';
            default:
                return 'e';
        }
    }

    public static void main(String[] args) {

        int num1=0,num2=0,res=0;
        char action;

        do {
            if ( Main.inputCounter == 0 ) {
                System.out.println("Please, enter 1st number:");
                num1 = Main.readNumber();
            }

            System.out.println("Please, enter 2nd number:");
            num2 = Main.readNumber();

            System.out.println("Please, enter action in one symbol (+-/*):");
            action = Main.readAction();

            switch (action) {
                case '+':
                    res = num1 + num2;
                    break;
                case '-':
                    res = num1 - num2;
                    break;
                case '/':
                    res = num1 / num2;
                    break;
                case '*':
                    res = num1 * num2;
                    break;
                default:
                    System.out.println("Exit...Wrong action");
                    System.exit(0);
            }
            System.out.println(res);
            System.out.println("\n1st number is " + res);
            num1 = res;
        }while(TRUE);
    }
}