//  class Nreturn {
//     public void add(int a , int b){
//         System.out.println("The sum is " + (a+b)); 
//     }
//     public void sub(int a , int b){
//         System.out.println("The difference is " + (a-b));
//     }
//     public static void main(String[] args) {
//         Nreturn n = new Nreturn();
//         n.add(5,3);
//         n.sub(7,2);
//     }
    
// }
import java.util.*;
class Nreturn{
    public void Oddeven(int a){
        if(a % 2 ==0 )
        System.out.println("Number is even");
        else
        System.out.println("Number is odd");
    }
    public void Factorial(int a){
        int fact=1;
        for(int i=1 ;i<=a ;i++)
        fact= fact * i;
        System.out.println("Factorial of "+a+" is "+fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nreturn n = new Nreturn();
        System.out.print("Enter the number to find odd or even : ");
        int num = sc.nextInt();
        n.Oddeven(num);
        System.out.println("Enter a number to Find factorial : ");
        int fnum = sc.nextInt();
        n.Factorial(fnum);
        sc.close();
    }
}
