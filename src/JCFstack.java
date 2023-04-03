import java.util.*;

import javax.xml.crypto.Data;
public class JCFstack {

    public static void pushAtBottom(Stack <Integer> r , int data){
      if(r.isEmpty()){
         r.push(data);
         return;
     }
     int top = r.pop();
     pushAtBottom(r, data);
     r.push(top);

     }

     public static String reverseString( String str){
       Stack<Character> r = new Stack<>();
       int idx = 0;
       while (idx <str.length()){
         r.push(str.charAt(idx));
         idx++;
      }
       StringBuilder result = new StringBuilder("");
       while(!r.isEmpty()){
        char curr = r.pop();
        result.append(curr);
     }
       return result.toString();

     }
     public static void reverseStack(Stack<Integer> r ){
     if (r.isEmpty()){
      return;    
      }
        int top = r.pop();
        reverseStack(r);
        pushAtBottom(r,top);
       

      }

      public static void reverseStackButWeird(Stack<Integer> r ){
        if (r.isEmpty()){
         return;    
         }
           int top = r.pop();
           pushAtBottom(r,top);
          
   
         }
      public static void printStack(Stack<Integer>r){
        while (!r.isEmpty()){
            System.out.println(r.pop());
         }
     } 

    public static void main (String[] args){
      Stack <Integer> r = new Stack<>();
      r.push(6);
      r.push(7);
      r.push(8);
      r.push(9);
      reverseStack(r);
      printStack(r);
      
  }
}
