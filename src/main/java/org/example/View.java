package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class View {

    private static Scanner reader = new Scanner(
            System.in);

    public static int showMenuWelcome() {
        System.out.println("Bienvenue dans le simulateur de commandes de café !");
        System.out.println("Que voulez vous faire ?");
        System.out.println("1. Passer une commande");
        System.out.println("2. Quitter");

        String choice = reader.nextLine();
        if( choice == "1") {
            return 1;
        } else if( choice == "2") {
            return 2;
        } else {
            incorrectInput("1 ou 2");
            return 0;
        }
    }

    public static int showMenuCoffee() {
        System.out.println("Quel type de café souhaitez vous ?");
        System.out.println("1. Espresso");
        System.out.println("2. Café au lait");

        String choice = reader.nextLine();
        if( choice == "1") {
            return 1;
        } else if( choice == "2") {
            return 2;
        } else {
            incorrectInput("1 ou 2");
            return 0;
        }
    }

    public static int showMenuToppings() {
        System.out.println("Souhaitez vous ajouter des condiments ?");
        System.out.println("1. Ajouter du chocolat (+0.5€)");
        System.out.println("2. Ajouter du sucre (+0,2€)");
        System.out.println("3. Ne plus ajouter de condiments.");

        String choice = reader.nextLine();
        if( choice == "1") {
            return 1;
        } else if( choice == "2") {
            return 2;
        } else if (choice == "3") {
            return 3;
        } else {
            incorrectInput("1, 2 ou 3");
            return 0;
        }
    }

    public static int showMenuPayOptions() {
        System.out.println("Comment souhaitez vous payer ?");
        System.out.println("1. Carte bancaire");
        System.out.println("2. PayPal");
        System.out.println("3. Virement");

        String choice = reader.nextLine();
        if( choice == "1") {
            return 1;
        } else if( choice == "2") {
            return 2;
        } else if (choice == "3") {
            return 3;
        } else {
            incorrectInput("1, 2 ou 3");
            return 0;
        }
    }

    public static int showRecap(String coffee, double price, ArrayList<String> toppings) {
        System.out.println("Voici le récapitulatif de votre commande:");
        System.out.println("Café : " + coffee.split(" ")[0]);
        System.out.println("Condiments : " + toppings.toString());
        System.out.println("Montant total : " + price);

        System.out.println("Confirmez vous la commande ?");
        System.out.println("1. Oui");
        System.out.println("2. Non");

        String choice = reader.nextLine();

        if( choice == "1") {
            return 1;
        } else if( choice == "2") {
            return 2;
        } else {
            incorrectInput("1 ou 2");
            return 0;
        }
    }

    private static void incorrectInput(String options) {
        System.out.println("Choix incorrect, entrez " + options);
    }
}
