package fr.semifir;

import java.util.Scanner;

public class Exo3 {
    public static void profitPerte(int prixFabrication, int prixVente){
        if(prixVente - prixFabrication >0){
            System.out.println("Profit de " + (prixVente - prixFabrication) + "e");
        } else if(prixFabrication - prixVente >0){
            System.out.println("Perte de " + (prixFabrication - prixVente) + "e");
        } else {
            System.out.println("Aucun profit, aucune perte");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le prix de fabrication :");
        int prixFabrication = scanner.nextInt();
        System.out.println("Veuillez saisir le prix de vente :");
        int prixVente = scanner.nextInt();
        profitPerte(prixFabrication,prixVente);
    }
}
