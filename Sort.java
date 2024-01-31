 class Sort {
    public static void main(String[] args) {
        int a[] = {7,5,4,8,2,1};
        int i,j;
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }    
        }
        System.out.println("Sorted array is:");
        for(i=0;i<5;i++){
            System.out.print(a[i]+" ");
        }
    }
 }
