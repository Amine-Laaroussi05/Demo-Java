package fr.semifir;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class chiffrageCesar {

    public static List<Integer> getIndexLettres(char[] message){ // les indices des lettres du message
        List<Integer> indexList = new ArrayList<>();
        char[] lettres = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a','b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};

        // + Ajout d'un espace parmi les lettres pour prendre en compte les espaces dans le message
        for(char t: message){
            for(int index=0; index < lettres.length; index++){
                if(t == lettres[index]){
                    indexList.add(index);
                    break;
                }
            }
        }
        return indexList;
    }








    public static char[] shiftLettres(int cle){ // Faire un shift des lettres selon la clé
        char[] lettres = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a','b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};
        char[] copyList = lettres.clone();
        int i =0;
        for(int index =0; index < lettres.length; index++){
            if(index + cle < lettres.length-1){
                lettres[index] = copyList[index+cle];
            } else if(index != 52){
                lettres[index] = copyList[i];
                i++;
            }
        }
        return lettres;
    }









    public static char[] messageChiffre(char[] message, int cle){ // Renvoyer le message chiffré en utilisant la clé
        List<Integer> indexList;
        indexList = getIndexLettres(message);
        char[] lettres = shiftLettres(cle);
        for(int index=0; index < message.length; index++){
            message[index] = lettres[indexList.get(index)];
        }
        return message;
    }








    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un message :");
        String message = scanner.nextLine();
        char[] messageSplit = message.toCharArray();
        System.out.println("Saisir une clé de chiffrage :");
        int cle = scanner.nextInt();
        while(true){ // Condition sur la cle : nombre entre 1 et 26
            if(cle < 1 || cle > 26){
                System.out.println("Veuillez saisir une clé entre 1 et 26");
                cle = scanner.nextInt();
            } else{
                break;
            }
        }



        System.out.println("-------------------------------------------");
        System.out.println("message = \"" + message + "\" | " + "clé = " + cle);
        System.out.print("\"");
        System.out.print(messageChiffre(messageSplit,cle)) ;
        System.out.print("\"");














    }
}
