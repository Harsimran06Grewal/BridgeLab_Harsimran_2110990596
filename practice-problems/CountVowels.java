public class CountVowels {
    //function to find count of vowels
    void countVowel(String str){
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                count++;
            }
        }

        System.out.println("count of vowels : " + count);
    }
    public static void main(String args[]){
        String str = "abcdEAIOu";
        
        CountVowels counter = new CountVowels();
        counter.countVowel(str);
    }
}
