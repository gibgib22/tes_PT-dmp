import java.util.*;
  
public class StackDemo {
    public static void main(String args[]){
       Integer[] a={9, -10, 2, 9, 6, 1, 2, 10, -8, -10, 2, 9, 6, 1};
       List<Integer> newList = new ArrayList();
       
       
       for (int i=0;i<a.length;i++){
           if (!newList.contains(a[i])) {
               newList.add(a[i]);
               System.out.print(a[i]+" = ");
               for (int j=0;j<a.length;j++){
                    if (a[i] == a[j]){              
                       System.out.print("*");
                   }
               }
               System.out.println(" ");
           }
       }
       
    }
}
