import java.util.Scanner;

public class CountOccuString {
    //function to count occurance of word started with given character
    static int countOccurance(String str, char ch){
        int count = 0;

        if(str.charAt(0) == ch){
            count++;
        }

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' ' && str.charAt(i + 1) == ch){
                count++;
            }
        }

        return count++;
    }

    //another way
    static int countOccurance1(String str, char ch){
        int count = 0;

        //created a array of string data type and using split function
        String words[] = str.split(" ");

        for(String word : words){
            if(word.charAt(0) == ch){
                count++;
            }
        }

        return count;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        String str = "simran shagan daksha simii";
        char ch = in.next().charAt(0);

        System.out.println(countOccurance(str, ch));
    }
}
