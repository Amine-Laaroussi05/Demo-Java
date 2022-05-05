package fr.semifir;

import java.util.Scanner;



public class Exo1 {

    public static void bienvenu(String nom){ // fonction de bienvenu
        System.out.println("Bienvenue " + nom);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Merci de saisir votre nom :");
        String nom = scanner.next();
        bienvenu(nom);
    }
}
