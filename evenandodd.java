class Sample1{
    
    public static void main(String args[]){
        
        int arr[]={23,78,54,90,33};   // even    odd 
        
        int even[]=new int[arr.length];   // 5 size   to store even values
        int odd[]=new int[arr.legth];     // 5 size   to store odd values
        int n=0,m=0;   // n ==> even array index positions   m ==> odd array index positions
        // Iterate one by one value from arr
        for(int i=0;i<arr.legth;i++){
            // check it is even or not
            if(arr[i]%2==0){
                even[n]=arr[i];    //78 54 90
                n++;
            }
            else{
                odd[m]=arr[i];   // 23 33
                m++;
            }
        }
        // Print Even array
        for(int i=0;i<n;i++){
            System.out.print(even[i]+" ");
        }

        // Print Odd array
        for(int i=0;i<m;i++){
            System.out.print(odd[i]+" ");
        }


    }
}
