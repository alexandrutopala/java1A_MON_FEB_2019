public class Exemplu5 {
    public static void main(String [] args) {
       int[][] m1 = new int[2][3];
       
       
       for (int i = 0; i < m1.length; i++) {
           for (int j = 0; j < m1[i].length; j++) {
               m1[i][j] = i + j;
           }
       }
       
       System.out.println(m1[1][2]);
       
       for (int[] a : m1) {
           for (int x : a) {
               System.out.print(x + " ");
           }
           System.out.println();
       }
       
       
       
       
       
       
       
    }
}