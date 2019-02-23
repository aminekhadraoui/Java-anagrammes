
package ex1;
import java.util.Scanner;
public class Ex1 {

    
    public static void main(String[] args) {
            boolean v = false;
            Scanner input= new Scanner(System.in);
            System.out.println("Put ch1 : ");
            String ch = input.next();
            System.out.println("Put ch2");
            String ch2 = input.next();
            if(ch.length()!=ch2.length()){
               System.out.println("Put the same length of the two string");
            
            
            }else {
            
            for (int i=0;i < ch.length();i++){
                v = ch.charAt(i)==ch2.charAt(i);
            
            }
            
            }
            if (v==true){
            System.out.println("anagrammes");
            
            }else{
            
            System.out.println("not annagrames");
            }
        
    }
    
}
