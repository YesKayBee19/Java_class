import java.util.*;
class Array {
    public static void main(String[] args){
        Scanner bn =new Scanner(System.in);
        bn.close();
        int []a;
        int i;
        a=new int[5];
        System.out.println("Enter the elements of array");
        for (i=0 ; i<5 ; i++){
            a[i]=bn.nextInt();
        }
        for(i=0;i<5;i++){
            System.out.print(a[i]+" ");
        }
    }  
}

