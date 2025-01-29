import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        //enter marks of subject physics
        System.out.println("enter physics marks: ");
        int physics_marks = in.nextInt();

        //enter marks of subject chemistry
        System.out.println("enter chemistry marks: ");
        int chemistry_marks = in.nextInt();

        //enter marks of subject maths
        System.out.println("enter math marks: ");
        int math_marks = in.nextInt();

        //calculating the total of 3 subjects
        int total_marks = physics_marks + chemistry_marks + math_marks;

        //calculating the percentage
        float percentage =(total_marks * 100 ) / 300;

        if(percentage >= 75){
            System.out.println(percentage);
            System.out.println("destination");
        }
        else if(percentage > 40 && percentage < 75){
            System.out.println(percentage);
            System.out.println("pass");
        }
        else{
            System.out.println(percentage);
            System.out.println("fail");
        }
    }
}