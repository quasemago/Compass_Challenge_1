package dev.brunopatrick.compass.exercise1;

import dev.brunopatrick.compass.exercise1.exception.QuizException;
import dev.brunopatrick.compass.exercise1.model.Quiz;

import java.util.Scanner;

// Quiz Program.
public class Program1 {
    public static void main(String[] args) {
        // Start quiz.
        final Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu nome para iniciar o Quiz: ");
        String userName;
        while ((userName = sc.nextLine()).isBlank()) {
            System.out.print("Por favor, informe seu nome para iniciar o Quiz: ");
        }

        Quiz quiz = new Quiz(userName);
        quiz.addQuestion("Quanto é 5+2?", "7");
        quiz.addQuestion("Quanto é 25*2?", "50");
        quiz.addQuestion("Qual foi o ano do descobrimento do Brasil?", "1500");
        quiz.addQuestion("Quantas vezes o Brasil venceu a copa do mundo de futebol?", "5");
        quiz.addQuestion("Qual foi o ano em que o primeiro homem pisou na lua?", "1969");

        // Start questions.
        try {
            for (String question : quiz.getQuestions().keySet()) {
                System.out.print("\nResponda a pergunta: " + question + " ");
                final String answer = sc.next();

                if (quiz.checkAnswer(question, answer)) {
                    System.out.println("Parabens, você acertou a questão!");
                } else {
                    System.out.println("Que pena, você errou a questão!");
                }
            }
        } catch (QuizException e) {
            System.out.println(e.getMessage());
        }

        // Calculate quiz.
        System.out.println("\nUsuário: " + quiz.getUserName() + "\n" +
                "Acertos: " + quiz.getCorrectCount() + "\n" +
                "Erros: " + quiz.getIncorrectCount());

        sc.close();
    }
}
