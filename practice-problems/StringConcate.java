public class StringConcate {
    //function to concate str1 and str2 without + and concat()
   static String concatStr(String str1, String str2){
        StringBuilder sb = new StringBuilder();

        //loop for appending str1 to stringBuilder
        for(int i = 0; i < str1.length(); i++){
            sb.append(str1.charAt(i));
        }

        //loop for appending str2 to stringBuilder
        for(int i = 0; i < str2.length(); i++){
            sb.append(str2.charAt(i));
        }

        return sb.toString();
    }
    public static void main(String args[]){
        String str1 = "simer";
        String str2 = "kaur";

        System.out.println(concatStr(str1, str2));
    }
}
