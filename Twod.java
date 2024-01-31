import java.util.Scanner;

public class Twod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][];
        int b[][];
        int c[][];
        int i,j;
        a= new int[2][2];
        b= new int[2][2];
        c= new int[2][2];
        System.out.println("Enter the elements of the first array");
        for (i = 0 ; i < 2 ; i++ ){
            for ( j = 0 ; j < 2 ; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nEnter the elements of the second array");
        for (i = 0 ; i < 2 ; i++ ){
            for ( j = 0 ; j < 2; j++ ){
                b[i][j] = sc.nextInt();
            }
        }
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("\nThe sum of two arrays is: ");
        for (i = 0 ; i < 2 ; i++ ){
            for ( j = 0 ; j < 2 ; j++){
                System.out.print(c[i][j]+" ");
            }
        }
    }
}
