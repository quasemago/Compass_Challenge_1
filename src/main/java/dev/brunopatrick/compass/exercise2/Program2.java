package dev.brunopatrick.compass.exercise2;

import dev.brunopatrick.compass.exercise2.service.UserService;

import java.time.LocalDateTime;
import java.util.Scanner;

// Login Program.
public class Program2 {
    public static void main(String[] args) {
        // Register hardcoded user, to simulate a database.
        // In a real application, this would be done by a database.
        final UserService userService = new UserService();
        userService.createUser("compass", "123456");

        // Get login input.
        final Scanner sc = new Scanner(System.in);

        System.out.print("Usuário: ");
        String username;
        while ((username = sc.nextLine()).isBlank()) {
            System.out.print("Por favor, informe o Usuário: ");
        }

        System.out.print("Senha: ");
        String password;
        while ((password = sc.nextLine()).isBlank()) {
            System.out.print("Por favor, informe a Senha: ");
        }

        // Login.
        if (userService.login(username, password)) {
            // Login successful.

            // Greet user according to the time of the day.
            final int hour = LocalDateTime.now().getHour();

            if (hour < 6) {
                System.out.println("Boa madrugada, você se logou ao nosso sistema.");
            } else if (hour >= 6 && hour < 12) {
                System.out.println("Bom dia, você se logou ao nosso sistema.");
            } else if (hour >= 12 && hour < 18) {
                System.out.println("Boa tarde, você se logou ao nosso sistema.");
            }
            // It is none of the other options,
            // so it's between 18h and 23h59.
            else {
                System.out.println("Boa noite, você se logou ao nosso sistema.");
            }
        } else {
            // Login failed.
            System.out.println("Usuário e/ou senha incorretos.");
        }

        sc.close();
    }
}
