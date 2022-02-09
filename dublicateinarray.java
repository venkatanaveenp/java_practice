WAP to print duplicate elements in a given array
 
class Sample1{
    
    public static void main(String args[]){
        int fr=1;
       int arr[]={34,56,34,23,89,34,56,88};
       
       for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]==arr[j]){
                   fr++;
                   arr[j]=0;
                   
               }
           }
           if(arr[i]!=0 && fr>1){
               System.out.println(arr[i]);
           }
           fr=1;
       }
       
       
    }
}

