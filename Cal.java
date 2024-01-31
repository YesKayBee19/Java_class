
class Cal {
    public int fact(int a){
        int f=1;
        for (int i = 1; i <=a ; i++) {
            f = f * i;
        }
        return f;
    
    }
    public static void main(String[] args) {
        Cal c = new Cal();
        int b = c.fact(5);
        System.out.println("Factorial of 5 is "+ b);    }
}

