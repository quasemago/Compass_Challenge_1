package dev.brunopatrick.compass.exercise5;

import java.text.Normalizer;
import java.util.Scanner;

// Palindrome Program.
public class Program5 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        System.out.print("Entre com uma mensagem: ");
        String msg;
        while ((msg = sc.nextLine()).isBlank()) {
            System.out.print("Por favor, entre com uma mensagem: ");
        }

        // Remove accents and spaces.
        final String finalMsg = Normalizer.normalize(msg, Normalizer.Form.NFKD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "")
                .replaceAll("\\s", "")
                .trim();

        // Check if the message is a palindrome.
        final String reversedMsg = new StringBuilder(finalMsg)
                .reverse()
                .toString();

        if (finalMsg.equalsIgnoreCase(reversedMsg)) {
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        sc.close();
    }
}
