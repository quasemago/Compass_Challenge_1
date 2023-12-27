package dev.brunopatrick.compass.exercise1.model;

import java.util.HashMap;
import java.util.Map;

public class Quiz {
    private Map<String, String> questions = new HashMap<>();

    public Quiz() {
    }

    public Quiz(Map<String, String> questions) {
        this.questions = questions;
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
}
