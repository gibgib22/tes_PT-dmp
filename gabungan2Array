import java.util.Arrays;
  
public class StackDemo {
    public static void main(String args[])
    {
        int[] a={-10, -5, 2, 4, 6, 7 };
        int[] b={-5, 1, 2, 3, 4, 6, 10 };
        
        int g = a.length;
        int j = b.length;
        int[] c = new int[g + j];
        
        //menggabungkan 2 array
        System.arraycopy(a, 0, c, 0, g);
        System.arraycopy(b, 0, c, g, j);
        
        //mengurutkan dari yang terkecil
        Arrays.sort(c);
        System.out.print("int[] c = {");
        for(int index:c){
            System.out.print(" "+index+ ",");/*mencetak elemen yang telah diurutkan*/
        }
        System.out.print("}; ");
    }
}
