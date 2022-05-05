package fr.semifir;


import java.util.*;

public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Exercice 1

        /*System.out.println("Merci de saisir votre nom :");
        String nom = "Amine";
        System.out.println("Bienvenu " + nom);*/




        // Exercice 2

        /*int nombre1 = 12;
        int nombre2 = 3;

        System.out.println(nombre1 + nombre2);*/





        // Exercice 3

        /*int priceFab = 12;
        int priceSell = 15;


        if (priceFab > priceSell) {
            int perte = priceFab - priceSell;
            System.out.println("Perte de " + perte);
        } else {
            int profit = priceSell - priceFab;
            System.out.println("Profit de " + profit);
        }*/




        // Exercice 4

        /*int[] numbers = { 12, 54, 32};
        int bigNumber = numbers[0];
        for (int index = 0; index < numbers.length; index++) {
            if(numbers[index] > bigNumber) {
                bigNumber = numbers[index];
            }
        }

        System.out.println("Le nombre le plus grand parmis les trois saisis: " + bigNumber);*/






        // Exercice 5

        /*int note = 19;

        if( 0 <= note && note < 5){
            System.out.println("Catastrophique, il faut revoir");;
        } else if(note < 11){
            System.out.println("Insuffisant");
        } else if(note < 15){
            System.out.println("Peut mieux faire");
        } else if(note < 18){
            System.out.println("Bien");
        } else{
            System.out.println("Excellent, bon travail");
        }*/






        // Exercice 6

        /*String operateur = "/";
        int num1 = 12;
        int num2 = 3;

        if(operateur == "+"){
            System.out.println(num1 + num2);
        } else if(operateur == "-"){
            System.out.println(num1 - num2);
        } else if(operateur == "*"){
            System.out.println(num1 * num2);
        } else if(operateur == "/"){
            System.out.println(num1 / num2);
        }*/







        // Exercice 7

        /*System.out.println("Veuillez saisir un nombre: ");
        int num = scanner.nextInt();
        int sum = 0;


        for(int index = 1; index <= num; index++){
            sum += index;
        }

        for(int index =1; index <= num; index++){
            System.out.print(index);
            if(index != num){
                System.out.print("+");
            }
            else{
                System.out.print(" = " + sum);
            }
        }*/






        // Exercice 8

        /*int num = 5;

        for (int index = 1; index <= num; index++) {
            for (int index2 = 1; index2 < index; index2++) {
                System.out.print("*");
            }
            System.out.println("*");
        }*/







        // Exercice 9

        /*int num = 5;

        for (int index = 1; index <= num; index++) {
            for (int index2 = 1; index2 < index; index2++) {
                System.out.print("*");
            }
            System.out.println("*");
        }

        for (int index = 4; index >= 1; index--) {
            for (int index2 = 1; index2 < index; index2++) {
                System.out.print("*");
            }
            System.out.println("*");
        }*/










        // Exercice 10

        /*int num = scanner.nextInt();
        int numSpace = num;
        int numTriangulaire = -1;




        for(int indexLine = 1; indexLine <= num; indexLine++){
            numSpace--; // 2
            for(int indexSpace = 1; indexSpace <= numSpace; indexSpace++){
                System.out.print(" ");
            } // 1 espace
            for(int index = 1; index <= indexLine; index++){
                numTriangulaire += 2;
            } // numTriangulaire = 3
            for(int indexStar = 1; indexStar <= numTriangulaire; indexStar++) {
                System.out.print("*");
            } // *
            numTriangulaire = -1;
            System.out.println("");
        }*/










        // Exercice 11

        /*double num = scanner.nextDouble();
        double[] monnaieList = new double[8];
        int index =0;
        for(double billet: new double[]{500,200,20,10,5,2,0.5,0.02}){
            monnaieList[index] = Math.floor(num / billet);
            num -= billet* monnaieList[index];
            System.out.println("Billet " + billet + "e :" + monnaieList[index++]);
        }*/











        // Exercice 12

        /*int[] temperature = {12, 25, 5, 7, 6, -5};
        int procheZero = temperature[0];



        for(int index =0; index < temperature.length; index++){
            if(procheZero > 0 && temperature[index] >0 && procheZero > temperature[index]){
                procheZero = temperature[index];
            } else if(procheZero >0 && temperature[index] <0 && procheZero >= -temperature[index]){
                procheZero = temperature[index];
            } else if(procheZero < 0 && temperature[index] > 0 && -procheZero > temperature[index]){
                procheZero = temperature[index];
            } else if(procheZero <0 && temperature[index] <= 0 && -procheZero >= -temperature[index]){
                procheZero = temperature[index];
            }
        }

        System.out.println("La température la plus proche de 0°C est " + procheZero);*/








        // Exercice 13


        /*int[] numListe = {12, 25, 5, 7, 6, -5};
        int[] tri = new int[6];
        int petitRelatif = numListe[0];
        int indexSuivi = 0;


        for(int index =0; index < numListe.length; index++){
            petitRelatif = numListe[index];
            indexSuivi = index;
            for(int index2 = index; index2 < numListe.length; index2++){
                if(petitRelatif > numListe[index2]){
                    petitRelatif = numListe[index2];
                    indexSuivi = index2;
                }

            }
            numListe[indexSuivi] = numListe[index];
            tri[index] = petitRelatif;
        }

        System.out.println(Arrays.toString(tri));*/











        // Jeu 1

        /*int N = scanner.nextInt();
        for(int index=0; index <= N; index++){
            if(index % 3 ==0 && index % 5 ==0){
                System.out.println("FIZZBUZZ");
            } else if(index %3 ==0){
                System.out.println("FIZZ");
            } else if(index %5 ==0){
                System.out.println("BUZZ");
            } else{
                System.out.println(index);
            }
        }*/






        // Jeu 2

        /*System.out.println("Veuillez saisir un nombre de tentative :");
        int tentative = scanner.nextInt();

        System.out.println("Veuillez saisir un nombre maximum N");
        int intervalleMax = scanner.nextInt();

        Random random = new Random();
        int aleatoire = random.nextInt(intervalleMax);
        int nombreSaisi = -1;


        for(int index=0; index < tentative; index++){
            System.out.println("Veuillez saisir un nombre entre 0 et " + intervalleMax);
            nombreSaisi = scanner.nextInt();
            if(nombreSaisi > aleatoire){
                System.out.println("Moins");
            } else if(nombreSaisi < aleatoire){
                System.out.println("Plus");
            } else{
                System.out.println("Bravo, vous avez gagné le juste Prix");
                break;
            }
        }*/





        // Jeu 3

        /*System.out.println("Nombre de places :");
        int place = scanner.nextInt();

        System.out.println("Nombre de tours :");
        int tour = scanner.nextInt();

        System.out.println("Nombre de groupe de visiteurs :");
        int tailleList = scanner.nextInt();

        List<Integer> file = new ArrayList<Integer>();
        System.out.println("Liste de groupes de visiteurs :");
        for(int index=1; index <= tailleList; index++){
            System.out.println("groupe " + index);
            file.add(scanner.nextInt());
        }

        int sumPersonne =0;
        int indexSuivi =0;
        int profits = 0;
        int indexSuivi2 = 0;





        // Le nombre de groupes possibles par rapport au nombre de places
        for(int index=1; index <= tour; index++){ // indexSuivi =
            for(int t: file){
                sumPersonne += t;
                if(sumPersonne <= place){
                    indexSuivi++;
                    profits += t;
                } else{
                    break;
                }
            }
            indexSuivi2 = tailleList - indexSuivi;
            System.out.print("Tour " + index + " : ");
            List<Integer> fileCopy = new ArrayList<Integer>(file);


            // List shift // indexSuivi = 2 tailleList = 5
            for(int index2 = 0; index2 < tailleList; index2++){
                if(index2 + indexSuivi < tailleList){
                    file.set(index2, fileCopy.get(index2+indexSuivi));
                } else{
                    file.set(index2, fileCopy.get(indexSuivi2));
                    indexSuivi2++;
                }
            }

            // Les groupes qui rentrent au manège
            for(int index2 = 1; index2 <= indexSuivi; index2++){ // groupe 1 + groupe 2 + etc..
                if(index2 != indexSuivi){
                    System.out.print("groupe " + index2 + " rentre,");
                } else{
                    System.out.println("groupe " + index2 + " rentre");
                }
            }
            sumPersonne = 0;
            indexSuivi = 0;
            indexSuivi2 = 0;


        }

        System.out.println("Profits : " + profits + "e");*/













        // **********************Jeu 4*********************

        System.out.println("Entrez le mot à trouver :");
        String mot = scanner.next().toLowerCase();

        // String to array
        char[] motListe = mot.toCharArray();

        System.out.println("Quelle est le nombre de vie?");
        int vie = scanner.nextInt();

        List<String> motCache = new ArrayList<>();

        // Mot masqué = ____
        for(int index=0; index < mot.length(); index++){
            motCache.add("_");
        }



        // Boucle pour saisir une lettre et vérifier si la lettre est contenue dans le mot
        System.out.println("-------------------------------");
        System.out.println("Veuillez saisir une lettre: ");
        for(int index=1; index <= vie; index++){
            String lettre = scanner.next().toLowerCase();






            // Chercher l'indice
            List<Integer> indexSearchList = new ArrayList<>();
            for(int index2 =0; index2 < mot.length(); index2++){
                if(lettre.charAt(0) == motListe[index2]){ // comparer avec la lettre saisi par l'utilisateur
                    indexSearchList.add(index2); // stocker l'indice si la comparaison est bonne
                }
            }





            // Remplacer les _ par la lettre si la lettre est dans le mot


            for(int t: indexSearchList){ // Chercher les indices stockés précédemment
                motCache.set(t,lettre); // Remplacer les _ par la lettre saisi par l'utilisateur aux indices indiqués
            }

            System.out.println(motCache);


            // Voir s'il n'y a aucun _ restant dans le mot , puis afficher à l'utilisateur s'il a gagné ou s'il a perdu

            if(motCache.contains("_")){ // Condition if pour voir si motCache contient un _
                if(index == vie){ // Si plus de vie, le joueur a perdu
                    System.out.println("Vous n'avez plus de vie, vous avez perdu! :(");
                }
            } else{
                System.out.println("Bravo vous avez trouvé le mot.");
                break;
            }

            if(motCache.contains(lettre)){
                index--;
                System.out.println("-------------------------------");
                System.out.println("Veuillez saisir une lettre: ");
            } else if(!(motCache.contains(lettre)) && index != vie){
                System.out.println("-------------------------------");
                System.out.println("Raté, veuillez saisir une autre lettre");
            }
            }















































    }
}








