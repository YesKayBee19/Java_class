 import java.util.*;
 class Hello {
     public String Oddeven(int a){
        if (a % 2 ==0)
        return "Even";
        else
        return "Odd";
     }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num=sc.nextInt();
        Hello h1=new Hello();
        System.out.print("The number is "+h1.Oddeven(num));
        sc.close();
     }
}
