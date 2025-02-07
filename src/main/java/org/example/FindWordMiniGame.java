package org.example;

public class FindWordMiniGame {
//    private static char[] findWord = new char[]
    private static String[] wordLists = {"hello", "morning", "holiday", "banana"};

    public static String selectRandomWord(){
        int randomWordIndex = (int)(Math.random()*4-1);
        return wordLists[randomWordIndex];
    }

    public static String hideWord(String word){

        String[] arrayWord = word.split("");
        StringBuilder hiddenWord = new StringBuilder();

        for (int i = 0; i < arrayWord.length; i++){
            hiddenWord.append("_");
        }

        return hiddenWord.toString();
    }

    public static void getPlayerGuess(){

    }

    public static boolean isGuessCorrect(String word, char guess){

        char[] wordCharArray = word.toCharArray();
        char[] findWord = new char[wordCharArray.length];

        for (int i = 0; i < wordCharArray.length; i++){
            if (wordCharArray[i] == guess){
                findWord[i] = guess;
                return true;
            }
        }

        return false;
    }

    public static String updateHiddenWord(String word, String hiddenWord, char guess){
        return "udpate";
    }

    public static void displayGameResult(String wordToGuess, String hiddenWord, int attemptsLeft){

    }

}
