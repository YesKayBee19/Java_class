import java.util.*;
class Vowel {
    public static void main(String[] args){
    Scanner ad= new Scanner(System.in);
    char a;
    System.out.println("Enter a Character =");
    a=ad.next().charAt(0);
    if(a=='a' ||a=='e'||a=='i'||a=='o'||a=='u'){
        System.out.println("The entered character is vowel.");
    }
    else
    System.out.println("The entered character is a consonent.");
    ad.close();
}
}
