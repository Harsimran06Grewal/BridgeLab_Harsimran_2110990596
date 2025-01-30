import java.util.*;
class FreqAlphabet{
    //function to count frequency
    void freqCount(String str){
        char ch[] = str.toCharArray();

        Arrays.sort(ch);

        for(int i = 0; i < ch.length; i++){
            //skip if character is already counted
            if(i > 0 && ch[i] == ch[i - 1]){
                continue;
            }

            int count = 1;

            for(int j = i + 1; j < ch.length; j++){
                if(ch[i] == ch[j]){
                    count++;
                }
            }
            System.out.println(ch[i] + " " + count);
        }
    }
    public static void main(String args[]){
        String str = "simersimmi";

        FreqAlphabet counter = new FreqAlphabet();
        counter.freqCount(str);
    }
}