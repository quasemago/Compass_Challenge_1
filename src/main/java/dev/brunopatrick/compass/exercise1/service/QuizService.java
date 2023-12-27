package dev.brunopatrick.compass.exercise1.service;

import dev.brunopatrick.compass.exercise1.model.Quiz;

import java.util.Map;

public class QuizService {
    private final Quiz quiz;
    private Integer correctCount = 0;
    private Integer incorrectCount = 0;

    public QuizService(Quiz quiz) {
        this.quiz = quiz;
    }

    /**
     * @return true if answer is correct, false otherwise.
     */
    public boolean checkAnswer(String question, String answer) {
        // Get questions from quiz.
        final Map<String, String> quizQuestions = this.quiz.getQuestions();

        // Check if question exists.
        if (!quizQuestions.containsKey(question)) {
            throw new RuntimeException("A questão informada não está cadastrada no Quiz.");
        }

        // Check if answer is correct.
        final boolean result = quizQuestions.get(question).equalsIgnoreCase(answer);
        if (result) {
            this.correctCount += 1;
        } else {
            this.incorrectCount += 1;
        }

        return result;
    }

    public Integer getCorrectCount() {
        return correctCount;
    }

    public Integer getIncorrectCount() {
        return incorrectCount;
    }
}
