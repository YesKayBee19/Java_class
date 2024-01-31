class Grandy{
    public static void add(int a , int b){
        System.out.println(a + b); 
    }
}
class Fathy extends Grandy{
    public static void sub(int a, int b){
        System.out.println(a - b);
    }
}
class Child extends  Fathy {
    public static void mul(int a, int b){
        System.out.println(a * b);
    }
}
class Kudumbam {
    public static void main (String[] args){
        Child c = new Child();
        Grandy.add(5, 4);
        Fathy.sub(7, 2);
        Child.mul(4, 4);
    }
}