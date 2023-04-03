import java.util.*;
public class stocks {
  public static void stockSpan(int stocks[], int span[]){
    Stack<Integer> ss = new Stack<>();
    span[0] = 1;
    ss.push(0);

    for(int i=1 ; i<stocks.length; i++){
      int currPrice = stocks[i];
      while(!ss.isEmpty() && currPrice > stocks[ss.peek()]){
       ss.pop();
      }
      if(ss.isEmpty()){
        span[i] = i+1;
       }else{
         int prevHigh = ss.peek();
         span[i] = i-prevHigh;
       }
       ss.push(i);
     }
   }

    public static void main(String args[]){
       int stocks[] = {100,80,60,50,70,50,60,80,100};
       int span[] = new int[stocks.length];
       stockSpan(stocks,span);

       for(int i = 0; i<=span.length; i++){
        System.out.println(span[i]+ " ");
       }
      }
    
}
