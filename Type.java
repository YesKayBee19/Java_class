import java.util.Scanner;
    class Type{
    public static void main(String [] soi){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num");
        String a=sc.nextLine();
        int b=Integer.parseInt(a);
        int c= b + 10;
        System.out.println(c);
        sc.close();
    }
}

