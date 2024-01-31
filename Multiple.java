import java.util.*;

class Multiple{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num1=sc.nextInt();
    if(num1>0){
            System.out.print("The number is Positive");
        
        if(num1==0){
            System.out.print("The number is Zero");
        }
        if(num1<0){
            System.out.print("The number is Negative");
        }
    }
        sc.close();
}
}