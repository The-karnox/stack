import java.util.*;
public class ValidParanthesis{
    public static boolean isValid(String str){
       Stack <Character> q = new Stack<>();

       for(int i=0; i<str.length(); i++){
         char ch = str.charAt(i);
          if(ch=='('|| ch=='{' || ch=='['){
           q.push(ch);
         }else{
            if(q.isEmpty()){
             return false;
             }
             if ((q.peek() == '(' && ch==')')||(q.peek() == '{' && ch == '}')||(q.peek() == '[' && ch == ']')){
             q.pop();
            
        }else{
          return false;
        }
       }
     }
     if(q.isEmpty()){
       return true;
     }else {
       return false;
     }
    }

    public static boolean isDuplicate(String str){
        Stack <Character> q = new Stack<>();
        for(int  i =0; i<str.length(); i++){
          char ch = str.charAt(i);
          if(ch==')'){
           int count=0;
           while(q.pop() != '('){
             
              count++;          
           }
        
        if( count < 1){
           return true;
         
          }
        }else{
          q.push(ch);
         }
      }
      return false;
    }
     public static void main(String arga[]){
       String str = "((a))";
       System.out.println(isDuplicate(str));
     }
}

