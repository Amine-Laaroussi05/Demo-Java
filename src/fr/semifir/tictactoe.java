package fr.semifir;

import java.util.Scanner;

public class tictactoe {

    // Affiche la grille
    public static void display(String[] grille){
        System.out.println(grille[6] + " | " + grille[7] +  " | " + grille[8]);
        System.out.println("---------");
        System.out.println(grille[3] + " | " + grille[4] +  " | " + grille[5]);
        System.out.println("---------");
        System.out.println(grille[0] + " | " + grille[1] +  " | " + grille[2]);
    }









    // Vérifie si le numéro choisi est valable.
    public static boolean isError(String[] grille, int numero){
        if(numero < 1 || numero > 9){
            System.out.println("Le numéro que vous avez choisi est non valide. Merci de saisir un numéro entre 1 et 9:");
            return true;
        }else if(!grille[numero-1].equals(".")){
            System.out.println("Le numéro a déjà été choisi avant, merci de saisir un autre numéro entre 1 et 9:");
            return true;
        } else{
            return false;
        }
    }












    // Tour de jeu des deux joueurs.
    public static void play(String[] grille, String joueur1, String joueur2, boolean j1, boolean j2){

        Scanner scanner = new Scanner(System.in);
        int numero;
        if(j1){
            System.out.println("Au tour de " + joueur1 + " de jouer, veuillez saisir un numéro entre 1 et 9:");
            numero = scanner.nextInt();
            while (isError(grille, numero)) {
                numero = scanner.nextInt();
            }
            grille[numero - 1] = "X";
            display(grille);
        }
        if(j2) {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Au tour de " + joueur2 + " de jouer, veuillez saisir un numéro entre 1 et 9:");
            numero = scanner.nextInt();
            while (isError(grille, numero)) {
                numero = scanner.nextInt();
            }
            grille[numero - 1] = "O";
            display(grille);
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }











    // Condition de victoire
    public static boolean isVictory(String[] grille, String joueur1, String joueur2, int index){


        // Conditions de victoires horizontales
        while(index < grille.length){
            if(grille[index].equals(grille[index+1]) && grille[index].equals(grille[index+2])){
                if(grille[index].equals("X")){
                    System.out.println(joueur1 + " a gagné la partie, bravo !!");
                    return true;
                } else if(grille[index].equals("O")){
                    System.out.println(joueur2 + " a gagné la partie, bravo !!");
                    return true;
                } else{
                    return false;
                }
            } else{
                index += 3;
            }
        }

        index =0;

        // Conditions de victoires verticales
        while(index < 3){
            if(grille[index].equals(grille[index+3]) && grille[index].equals(grille[index+6])){
                if(grille[index].equals("X")){
                    System.out.println(joueur1 + " a gagné la partie, bravo !!");
                    return true;
                } else if(grille[index].equals("O")){
                    System.out.println(joueur2 + " a gagné la partie, bravo !!");
                    return true;
                } else{
                    return false;
                }
            } else{
                index++;
            }
        }


        // Conditions de victoires diagonales
        if (grille[0].equals(grille[4]) && grille[0].equals(grille[8])) { // diagonale de gauche a droite
            if (grille[0].equals("X")) {
                System.out.println(joueur1 + " a gagné la partie, bravo !!");
                return true;
            } else if (grille[0].equals("O")) {
                System.out.println(joueur2 + " a gagné la partie, bravo !!");
                return true;
            } else {
                return false;
            }
        } else if(grille[2].equals(grille[4]) && grille[2].equals(grille[6])){ // diagonale de droite a gauche
            if (grille[2].equals("X")) {
                System.out.println(joueur1 + " a gagné la partie, bravo !!");
                return true;
            } else if (grille[2].equals("O")) {
                System.out.println(joueur2 + " a gagné la partie, bravo !!");
                return true;
            } else {
                return false;
            }
        }
        return false;
    }














    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dans ce jeu du morpion, chaque joueur choisi un numéro de case entre 1 et 9 selon la configuration de votre clavier:");
        System.out.println("7 | 8 | 9");
        System.out.println("---------");
        System.out.println("4 | 5 | 6");
        System.out.println("---------");
        System.out.println("1 | 2 | 3");
        System.out.println("Celui qui gagne est celui qui aura aligné le même symbole soit horizontalement, soit verticalement, soit en diagonale.");

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Saisir le nom du joueur 1 :");
        String joueur1 = scanner.next();
        System.out.println("Saisir le nom du joueur 2 :");
        String joueur2 = scanner.next();
        String []grille = {".",".",".",".",".",".",".",".","."};
        int i = 0;
        int index =0;
        while(!isVictory(grille, joueur1, joueur2, index)){
            if(i != 8) {
                if(i%2 ==0){
                    play(grille, joueur1, joueur2, true, false);
                } else{
                    play(grille, joueur1, joueur2, false, true);
                }
                i++;
            }  else{
                play(grille,joueur1,joueur2,true,false);
            }
        }
    }
}


