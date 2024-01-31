class Hello {
    public static void Add(int a, int b){
        int c = a+b;
        System.out.println(c);
    }
    
}
class First {
    public static void main(String[] args) {
        Hello f1 = new Hello();
        Hello.Add(5,6);
    }
}
