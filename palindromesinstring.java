import java.util.*;
class Main
{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String w[]=s.split(" ");
 String v="";
for(int j=0;j<w.length;j++){
    v="";
String r=w[j]; 

for(int i=r.length()-1;i>=0;i--)
{
v=v+w[j].charAt(i);
}
if(v.equals(w[j])){
System.out.println("palindrome is "+w[j]);
}
else{
System.out.println("not palindrome is "+w[j]);
}
}


}
}