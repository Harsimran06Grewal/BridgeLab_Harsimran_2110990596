public class rotateStr {
    //function to rotate a string
    static String rotate(String str){
        StringBuilder sb = new StringBuilder();

        //appending last character to first index
        sb.append(str.charAt(str.length() - 1));

        //shifting another characters by 1
        for(int i = 0; i < str.length() - 1; i++){
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }
    public static void main(String args[]){
        String str = "abcdef";

        System.out.println(rotate(str));
    }
}



























































