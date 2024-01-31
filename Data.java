import java.util.Scanner;
class Data {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Int No.");
        int a=sc.nextInt();
        System.out.println("Enter Long No.");
        Long b=sc.nextLong();
        System.out.println("Enter Float No.");
        float c=sc.nextFloat();
        System.out.println("Enter Double No.");
        double d=sc.nextDouble();

        System.out.println("Int "+a);
        System.out.println("Long "+b);
        System.out.println("Float "+c);
        System.out.println("Double " +d);
        sc.close();
    }
}
