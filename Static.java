public class Static {
    public static void Alpha(){
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }
    }
    public static void main(String args[]){
        Static obj = new Static();
        System.out.println("Alphabets in lowercase:");
        Alpha();
    }
}
