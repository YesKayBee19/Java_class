import java.util.*;
class Arrayadd {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int []a;
        int []b;
        int []c;
        a= new int[5];
        b=new int [5];
        c=new int[5];
        System.out.println("Enter elements of array A : ");
        for (int i = 0; i < 5; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("\nEnter elements of array B:");
        for (int i = 0; i < 5; i++){
            b[i] = sc.nextInt();
        }
        for(int j=0;j<5;j++){
            c[j]=a[j]+b[j];
        }
        for(int i=0;i<5;i++){
            System.out.print(c[i]+" ");
        }
    sc.close();
    }
    
}
