//  18. WAP to find smallest word in a given string.
class Main {
    
    public static void main(String args[]){
     
     String str="hello hi bitLabs";   
          
          
        String words[]=str.split(" ");
        int min=words[0].length();
         String smallword=words[0];
        
        for(int i=0;i<words.length;i++){    //
            if(min>words[i].length()){ 
                min= words[i].length();    // 
                smallword=words[i];      //  
            }
            
        }
        System.out.println("smallest word is: "+smallword);
           
           
    }
    
}
