package org.example;

import java.util.Scanner;

public class FindWordMiniGame {
//    private static char[] findWord = new char[]

    private static Scanner scanner = new Scanner(System.in);
    private static String[] wordLists = {"hello world", "good morning", "holiday", "banana", "green apple", "i am good"};
    private static char playerGuessChar;
    private static boolean isWordGuessed = false;
    private static StringBuilder hiddenWord = new StringBuilder();
    private static int charCorrect = 0;
    private static int playerAttemptsLeft = 10;
    private static int playerAttempt = 0;
    private static String word;

    public static void gameStart(){
        word = selectRandomWord();
        hideWord(word);
        System.out.println("Your word today is : " + hiddenWord + " || " + "You only have " + playerAttemptsLeft + " attempts!");

        do {

            if (charCorrect == word.length()){
                isWordGuessed = true;
            }

            getPlayerGuess();

            ++playerAttempt;

            if (isGuessCorrect(word, playerGuessChar)){
                System.out.println("Your guess is correct! || " + "Your remaining attempts : " + playerAttemptsLeft + " attempts");
            } else {
                if (playerAttemptsLeft == 1){
                    break;
                } else {
                    --playerAttemptsLeft;
                    System.out.println("Try again! || " + "Your remaining attempts : " + playerAttemptsLeft + " attempts");
                }
            }

            System.out.println("Your word : " + hiddenWord);

        } while (!isWordGuessed);

        displayGameResult();

        scanner.close();
    }

    private static String selectRandomWord(){
        int randomWordIndex = (int)(Math.random()*4-1);
        return wordLists[randomWordIndex];
    }

    private static String hideWord(String word){

        String[] arrayWord = word.split("");

        for (int i = 0; i < arrayWord.length; i++){
            if (arrayWord[i].equals(" ")){
                hiddenWord.append(" ");
            } else {
                hiddenWord.append("_");
            }
        }

        double hintIndex = Math.random() * arrayWord.length;

        do {
            if (arrayWord[(int) hintIndex].equals(" ")){
                hintIndex = Math.random() * arrayWord.length;
            } else {
                break;
            }
        } while(true);

        hiddenWord.setCharAt((int)hintIndex, arrayWord[(int)hintIndex].charAt(0));

        return hiddenWord.toString();
    }

    private static char getPlayerGuess(){
        System.out.print("Guess the word : ");
        return playerGuessChar = scanner.next().charAt(0);
    }

    private static boolean isGuessCorrect(String word, char guess){

        int correctGuessDetected = 0;

        char[] wordCharArray = word.toCharArray();

        for (int i = 0; i < wordCharArray.length; i++){
            if (wordCharArray[i] == guess){
                updateHiddenWord(hiddenWord, i, guess);
                ++charCorrect;
                ++correctGuessDetected;
            }
        }

        return correctGuessDetected > 0;

    }

    private static void updateHiddenWord(StringBuilder hiddenWord, int index, char guess){
        hiddenWord.setCharAt(index, guess);
    }

    public static void displayGameResult(){
        if (isWordGuessed){
            System.out.println("Congratulation! You guessed the word : " + word + " with " + playerAttempt + " attempts!");
        } else {
            System.out.println("Your attempts already run out. Your word is : " + word);
        }
    }

}
