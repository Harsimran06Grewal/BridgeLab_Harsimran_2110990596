public class CountUppLowSpec {
    //function to find cound of uppercase, lowercase and special character
    void count(String str){
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int specialCharCount = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                uppercaseCount++;
            }
            else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                lowercaseCount++;
            }
            else{
                specialCharCount++;
            }
        }

        System.out.println("count of uppercase character : " + uppercaseCount);
        System.out.println("count of lowercase character : " + lowercaseCount);
        System.out.println("count of special character : " + specialCharCount);
    }
    public static void main(String args[]){
        String str = "abcdABCDR$%#";
        
        CountUppLowSpec counter = new CountUppLowSpec();
        counter.count(str);
     }
}
