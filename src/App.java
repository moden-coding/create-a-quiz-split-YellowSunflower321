import java.util.*;
    //The problem should include the split method. You might also add in any String methods
    //or array skills. Think about Practice Quiz problem or CodingBat problems.
    //Create a question AND a solution to that question
    //What is the longest word in your sentence?

    //Give instructions for your problem below:
    //Get a sentence input from the user
    //Find the length of each word after splitting the sentence, and print the length of longest word.

public class App {
    public static void main(String[] args) throws Exception {
        //Write setup code (if needed)
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        String[] words = input.split(" ");
        // String[] longest = new String[1];
        Longest(words);
    }

    public static void Longest(String[] words){

        int longest = 0;
        for(String x : words){
            if(x.length() > longest){
                longest = x.length();
            }

        }
        System.out.println("Your biggest word is " + longest + " letters long!");
    }

}

