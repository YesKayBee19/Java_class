class Parent{
    public void add(int a, int b){
        System.out.println(a+b);
    }
}
class Child extends Parent{
    public void sub(int a, int b){
        System.out.println(a-b);
    }
}

class Inherit {
    public static void main (String[] args){
        Child obj  = new Child();
        obj.add(5, 8);
        obj.sub(7, 4);
    }
}
