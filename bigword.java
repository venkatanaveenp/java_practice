//  18. WAP to find logest word in a given string.
class Sample {
    
    public static void main(String args[]){
     
     String str="hi hello bitLabs";   
          int max=0;
          String longestword=null;
        String words[]=str.split(" ");
        
        for(int i=0;i<words.length;i++){    // bitLabs
            
            if(max<words[i].length()){     //  5<7
                max= words[i].length();    //max=7
                longestword=words[i];      // bitLabs
            }
            
        }
        System.out.println("Longest word is: "+longestword);
           
           
    }
    
}
