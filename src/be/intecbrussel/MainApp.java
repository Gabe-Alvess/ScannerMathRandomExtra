package be.intecbrussel;

import java.util.Random;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("---- Oefening 1 ----");

        Random random = new Random();
        int randomNumber1 = 0;
        while (randomNumber1 != 50) {
            randomNumber1 = random.nextInt(101);
            System.out.println("Random Number: " + randomNumber1);
        }
        System.out.println("Het getal " + randomNumber1 + " is bereikt!!!");

        System.out.println("---- Oefening 2 ----");

        int randomNumber2 = random.nextInt(20);
        Scanner scanner = new Scanner(System.in);
        int attempts = 5;
        int typedNumber = 0;


        System.out.println("Probeer het nummer tussen 1 en 20 te raden!");
        System.out.println("Pas op u hebt maximum 5 pogingen!!!!");
        System.out.println("Vul het nummer hieronder in!");

        while (randomNumber2 != typedNumber) {
            typedNumber = scanner.nextInt();
            if (typedNumber > randomNumber2 && typedNumber <= 20) {
                System.out.println("Het juiste nummer is kleiner dan " + typedNumber + "!");
            } else if (typedNumber < randomNumber2 && typedNumber >= 1) {
                System.out.println("Het juiste nummer is groter dan " + typedNumber + "!");
            } else if (typedNumber > 20 || typedNumber < 1) {
                System.out.println("Het ingevoerde nummer is kleiner dan 1 of groter dan 20.");
                System.out.println("Voer een nummer tussen 1 en 20 in.");
            } else if (typedNumber == randomNumber2) {
                System.out.println("Proficiat, u hebt het juiste nummer geraden!");
                System.out.println("Het juiste nummer is inderdaad " + randomNumber2 + ".");
            }

            attempts -= 1;
            if (attempts > 1 && typedNumber != randomNumber2) {
                System.out.println("U hebt nog " + attempts + " pogingen over!");
            } else if (attempts == 1 && typedNumber != randomNumber2) {
                System.out.println("U hebt nog " + attempts + " poging over!");
            } else if (attempts > 1 && typedNumber == randomNumber2) {
                System.out.println("U had nog " + attempts + " pogingen over. Proficiat!");
            } else if (attempts == 1 && typedNumber == randomNumber2) {
                System.out.println("U had nog " + attempts + " poging over. Proficiat!");
            } else if (attempts == 0 && typedNumber == randomNumber2) {
                System.out.println("Proficiat! U hebt het juiste nummer geraden bij u laaste poging!");
            } else {
                System.out.println("Sorry, u hebt geen pogingen meer!");
                System.out.println("Het juiste nummer was -> " + randomNumber2 + ".");
                System.out.println("Volgende keer meer geluk!");
                break;
            }
        }
    }
}
