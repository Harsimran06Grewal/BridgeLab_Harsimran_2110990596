import java.util.*;

public class AnagramStr {
    //function to check anagram
    void checkAnagram(String str1, String str2){
        //converting both the string to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //checking the length of both strings
        if(str1.length() == str2.length()){
            char charArr1[] = str1.toCharArray();
            char charArr2[] = str2.toCharArray();

            //sorting both the arrays
            Arrays.sort(charArr1);
            Arrays.sort(charArr2);

            boolean result = Arrays.equals(charArr1, charArr2);

            if(result){
                System.out.println("the strings " + str1 + " " + "and" + " " + str2 + " " + "are anagram");
            }
            else{
                System.out.println("the strings " + str1 + " " + "and" + " " + str2 + " " + "are not anagram");
            }
        }
        else{
            System.out.println("the strings " + str1 + " " + "and" + " " + str2 + " " + "are not anagram because length of both the string is not equal");
        }
    }
    public static void main(String args[]){
        String str1 = "race";
        String str2 = "care";

        AnagramStr checker = new AnagramStr();
        checker.checkAnagram(str1, str2);
    }
}
