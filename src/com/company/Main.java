package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        /* Naucim se programovani a site */
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej cislo");
        Double a = sc.nextDouble();
        System.out.println("zadej cislo");
        Double b = sc.nextDouble();
        switch (args[0]) {
            case "s":
                System.out.println(a + b);
                break;
            case "o":
                System.out.println(a - b);
                break;
            case "n":
                System.out.println(a * b);
                break;
            case "d":
                System.out.println(a / b);
                break;
            default:
                System.out.println("Neplatny argument");
        }
    }
}
