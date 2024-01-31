class Bla{
    public void Sqroot(double a){
        double b= Math.sqrt(a);
        System.out.println("The square root of "+a+" is :"+b);
    }
    public void pow(double a, double b){
        double c= Math.pow(a, b);
        System.out.println("The result of "+a+" raised to the power "+b+ " is: "+c); 
    }

}

class Taskq {
    public static void main (String[] args) {
        Bla bla = new Bla();
        bla.Sqroot(9);
        bla.pow(3,4);

    }
}
