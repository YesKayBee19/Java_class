 class Swap {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        System.out.println("Before swapping: x is " + x +" " + "y is "+ y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swapping: x is " + x +" " + "y is "+ y);
    }
}
