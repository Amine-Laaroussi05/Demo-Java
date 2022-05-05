package fr.semifir;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RouletteRusse {

    public static List<Integer> chargeurBalle(int nombreBalles){ // Liste de taille 8 avec les balles placées aléatoirement
        Random random = new Random();
        List<Integer> pistoletBalle = new ArrayList<>();
        int balleStock = nombreBalles; // Prendre en compte le nombre de balles
        for(int index=0; index < 8; index++){ // Parcourir la liste
            int aleatoire = random.nextInt(2);// Générer un nombre aléatoire 0 ou 1 pour savoir où les balles sont placés dans la liste
            if((aleatoire == 1 || balleStock == 8 - index) && balleStock != 0){
                pistoletBalle.add(1);
                balleStock--;
            } else{
                pistoletBalle.add(0);
            }
        }
        return pistoletBalle;
    }









    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir le nom du joueur 1:");
        String player1 = scanner.next();
        System.out.println("Saisir le nom du joueur 2:");
        String player2 = scanner.next();

        // Saisi du nombre de balles dans le pistolet
        System.out.println("Saisir le nombre de balles dans le pistolet, avec un maximum de 8");
        int nombreBalles = scanner.nextInt();
        while(nombreBalles < 1 || nombreBalles >8){
            System.out.println("Merci de saisir un nombre compris entre 1 et 8");
            nombreBalles = scanner.nextInt();
        }



        //  programme qui va simuler les tirs 1 par 1
        List<Integer> tentativeList;
        while(true){
            System.out.println("----------------------");
            System.out.println("Le joueur " + player1 + " tire une balle");
            tentativeList = chargeurBalle(nombreBalles);
            System.out.println(tentativeList);
            if(tentativeList.get(0) == 1){
                System.out.println("Le joueur " + player1 + " est mort.");
                break;
            }
            System.out.println("----------------------");
            System.out.println("Le joueur " + player2 + " tire une balle");
            tentativeList = chargeurBalle(nombreBalles);
            System.out.println(tentativeList);
            if(tentativeList.get(0) == 1){
                System.out.println("Le joueur " + player2 + " est mort.");
                break;
            }
        }



















    }


}