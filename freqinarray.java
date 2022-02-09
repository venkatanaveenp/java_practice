WAP to find out frequency of each element in the given array.
input: [23,45,56,67,90,45,23]
output:
    23 --> 2
    45 --> 2
    56 --> 1
    67 --> 1
    90 --> 1
 
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
           if(arr[i]!=0){
               System.out.println(arr[i]+" frequency is : "+fr);
           }
           fr=1;
       }
       
       
    }
}
