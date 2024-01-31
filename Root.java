class Root{
    public static void Sqroot(double a){
        double b= Math.sqrt(a);
        System.out.println("The square root of "+a+" is :"+b);
    }
    public static void main(String[] args) {
        Root obj=new Root();
        Sqroot(16);
    }
}