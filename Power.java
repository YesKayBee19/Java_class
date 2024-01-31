import java.util.*;;
class Power {
    public static void pow(double a, double b){
        double c= Math.pow(a, b);
        System.out.println("The result of "+a+" raised to the power "+b+ " is: "+c); 
    }
    public static void main(String[] args) {
        System.out.println("Enter base number:");
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        System.out.println("Enter power number:");
        double power = sc.nextDouble();
        Power obj = new Power();
        pow(base,power);
        sc.close();
    }
}
