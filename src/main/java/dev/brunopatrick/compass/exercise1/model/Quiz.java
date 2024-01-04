package dev.brunopatrick.compass.exercise1.model;

import dev.brunopatrick.compass.exercise1.exception.QuizException;

import java.util.HashMap;
import java.util.Map;

public class Quiz {
    private String userName;
    private Integer correctCount = 0;
    private Integer incorrectCount = 0;
    private Map<String, String> questions = new HashMap<>();

    public Quiz(String userName) {
        this.userName = userName;
    }

    public Quiz(String userName, Map<String, String> questions) {
        this.userName = userName;
        this.questions = questions;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Map<String, String> getQuestions() {
        return questions;
    }

    public void setQuestions(Map<String, String> questions) {
        this.questions = questions;
    }

    public void addQuestion(String question, String answer) {
        this.questions.put(question, answer);
    }

    public void removeQuestion(String question) {
        this.questions.remove(question);
    }

    /**
     * @return true if answer is correct, false otherwise.
     */
    public boolean checkAnswer(String question, String answer) {
        // Check if question exists.
        if (!this.questions.containsKey(question)) {
            throw new QuizException("A questão informada não está cadastrada no Quiz.");
        }

        // Check if answer is correct.
        final boolean result = this.questions.get(question).equalsIgnoreCase(answer);
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
