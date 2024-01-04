package dev.brunopatrick.compass.exercise4;

import java.util.Scanner;

// Emoticons Program.
public class Program4 {
    private static final String HAPPY_EMOTICON = ":-)";
    private static final String MAD_EMOTICON = ":-(";

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        System.out.print("Entrada: ");
        String msg;
        while ((msg = sc.nextLine()).isBlank()) {
            System.out.print("Por favor, insira uma entrada: ");
        }

        // Count emoticons.
        int happyCount = 0;
        int madCount = 0;

        for (int i = 0; i < msg.length(); i++) {
            if (msg.charAt(i) == ':') {
                if (i + 2 < msg.length()) {
                    final String emoticon = msg.substring(i, i + 3);
                    if (emoticon.equals(HAPPY_EMOTICON)) {
                        happyCount++;
                    } else if (emoticon.equals(MAD_EMOTICON)) {
                        madCount++;
                    }
                }
            }
        }

        // Print results.
        String result;
        if (happyCount > madCount) {
            result = "divertido";
        } else if (madCount > happyCount) {
            result = "chateado";
        } else {
            result = "neutro";
        }
        System.out.println("Saida: " + result);

        sc.close();
    }
}
