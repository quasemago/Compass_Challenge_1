package dev.brunopatrick.compass.exercise1;

import dev.brunopatrick.compass.exercise1.model.Quiz;
import dev.brunopatrick.compass.exercise1.service.QuizService;

import java.util.Scanner;

// Quiz Program.
public class Program1 {
    public static void main(String[] args) {
        // Register quiz questions.
        Quiz quiz = new Quiz();
        quiz.addQuestion("Quanto é 5+2?", "7");
        quiz.addQuestion("Quanto é 25*2?", "50");
        quiz.addQuestion("Qual foi o ano do descobrimento do Brasil?", "1500");
        quiz.addQuestion("Quantas vezes o Brasil venceu a copa do mundo de futebol?", "5");
        quiz.addQuestion("Qual foi o ano em que o primeiro homem pisou na lua?", "1969");

        // Start quiz.
        final Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu nome para iniciar o Quiz: ");
        String userName;
        while ((userName = sc.nextLine()).trim().isEmpty()) {
            System.out.print("Por favor, informe seu nome para iniciar o Quiz: ");
        }

        // Start questions.
        final QuizService quizService = new QuizService(quiz);

        for (String question : quiz.getQuestions().keySet()) {
            System.out.print("\nResponda a pergunta: " + question + " ");
            final String answer = sc.next();

            if (quizService.checkAnswer(question, answer)) {
                System.out.println("Parabens, você acertou a questão!");
            } else {
                System.out.println("Que pena, você errou a questão!");
            }
        }

        // Calculate quiz.
        System.out.println("\nUsuário: " + userName + "\n" +
                "Acertos: " + quizService.getCorrectCount() + "\n" +
                "Erros: " + quizService.getIncorrectCount());

        sc.close();
    }
}
