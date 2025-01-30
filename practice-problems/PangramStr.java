import java.util.*;
public class PangramStr {
    //function to check whether string is pangram or not
    void pangramCheck(String str){
        boolean alphaPresent[] = new boolean[26];

        str = str.replace(" ", "").toLowerCase();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                if(alphaPresent[ch - 'a'] == true){
                    break;
                } 
                else{
                     alphaPresent[ch - 'a'] = true;
                }
            }
        }

        int count = 0;
        for(int i = 0; i < alphaPresent.length; i++){
            if(alphaPresent[i]){
            count++;
            }
        }

        if(count == 26){
            System.out.println( str + " " +"is pangram");
        }
        else{
            System.out.println("string" + " " + str + " " +"is not pangram");
        }
}

    public static void main(String args[]){
        String str = "The quick brown fox jumps over the lazy dogg";

        PangramStr checker = new PangramStr();
        checker.pangramCheck(str);
    }
}


