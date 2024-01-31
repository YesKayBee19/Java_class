// class Pattern{
//     public static void main(String[] args) {
//         int i,j;
//         for(i=5;i>=1;i--){
//             for(j=5;j>=i;j--){
//                 System.out.print(j);
        
//             }
        
//             System.out.println("");
        
//         }
        
//     }       
// }

// class Pattern{
//     public static void main(String[] args){
//         int i,j;
//         for(i=1;i<=5;i++){
//             char ch='A';
//             for(j=1;j<=i;j++){
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println(" ");
//         }
//     }
// }

class Pattern{
    public static void main(String[] args){
        int i,j;
        for(i=1;i<=4;i++){
            for(j=1;j<=4;j++){
                if(i==1 || i==4 || j==1 || j==4){
                    System.out.print(i);
                }
                else{
                    System.out.println(" ");
            }
        }
    }
}
}