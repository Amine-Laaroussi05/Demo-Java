package fr.semifir;

import java.util.Scanner;

public class Exo2 {
    public static double addition(double n, double m){
        return n+m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir deux nombres :");
        double n = scanner.nextDouble();
        double m = scanner.nextDouble();
        System.out.print(n + " + " + m + " = "); // Display message with the user's numbers input
        System.out.println(addition(n,m)); // Use addition function to get the sum of the two numbers
    }

}
