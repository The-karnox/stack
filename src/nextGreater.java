import java.util.*;
public class nextGreater {

  
  public static void main(String args[]){
     int arr[] = {3,4,5,7,0,9,2};
     Stack<Integer> p = new Stack<>();
     int nextGreater[] = new int[arr.length];

     for(int i=arr.length-1; i>=0; i--){
       while(!p.isEmpty() && arr[p.peek()]  <= arr[i]){
        p.pop();
      
       }
       if(p.isEmpty()){
         nextGreater[i] = -1;
       }else{
         nextGreater[i] = arr[p.peek()] ;
       }

       p.push(i);
     }

     for(int i = 0; i<nextGreater.length; i++){
         System.out.print(nextGreater[i]+" ");
     }
     System.out.println();
   }  
}
