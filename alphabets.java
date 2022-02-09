//  16. WAP to print number of vowels and number of consonents of each word in a given string.
class Vowelsandconsonents {
    
    public static void main(String args[]){
     
     String str="hihiabc@# helloabc23 bitLabs123";   //  hi@#-2  hello23 -5  bitLabs123: 7
        int vcount=0,ccount=0;
       String words[]=str.split(" ");
       
       for(int i=0;i<words.length;i++){      // number of words: 3
           for(int j=0;j<words[i].length();j++) { // number of characters
               if(words[i].charAt(j)>='A' && words[i].charAt(j)<='Z' || words[i].charAt(j)>='a' && words[i].charAt(j)<='z' ){
                    
                    if(words[i].charAt(j)=='a' || words[i].charAt(j)=='e' || words[i].charAt(j)=='i' || words[i].charAt(j)=='o' || words[i].charAt(j)=='u'){
                        vcount++;
                    }
                    else{
                        ccount++;
                    }
               }
           }
           System.out.println("No. of vowels in "+words[i]+" is : "+vcount);
           System.out.println("No. of Consonents in "+words[i]+" is : "+ccount);
           
             vcount=0;
             ccount=0;
       }
       
         
    }
    
}
