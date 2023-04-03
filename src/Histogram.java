
import java.util.*;
public class Histogram {
    public static void maxArea(int arr[]){
       int max=0;
       int nsr[] = new int[arr.length];
       int nsl[] = new int[arr.length];

       Stack<Integer> h = new Stack<>();
          //nsr
       for(int i=arr.length-1; i>=0; i--){
        while(!h.isEmpty() && arr[h.peek()]  >= arr[i]){
         h.pop();
       
        }
        if(h.isEmpty()){
         nsr[i] = arr.length;
        }else{
          nsr[i] = arr[h.peek()] ;
        }
          h.push(i);
      }
      //nsl
      for(int i=0; i<arr.length; i++){
        while(!h.isEmpty() && arr[h.peek()]  >= arr[i]){
         h.pop();
       
        }
        if(h.isEmpty()){
         nsl[i] = -1;
        }else{
          nsl[i] = arr[h.peek()] ;
        }
          h.push(i);
      }
      
    //area= h*width: width= j-i-1= nsr[i]-nsl[i]-1
      for(int i=0;i<arr.length;i++){
          int height = arr[i];
          int width = nsr[i]-nsl[i]-1;
          int currArea = height*width;
         max = Math.max( currArea , max);
      }
     System.out.println("max area in histogram =" + max);
    }
      public static void main(String args[]) {
        int arr[]= {1,7,9,8,6,2,9,1};
        maxArea(arr);
      }
      
}
