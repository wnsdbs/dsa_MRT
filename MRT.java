import java.util.Arrays;

public class MRT {
    public static void main(String args[]) {
        int amount = (int)(Math.random() * 8 + 3);
        int[][] programs = new int[amount][2];

        System.out.println("The programs are:");
        System.out.println();
        for (int i = 0; i < amount; i++) {
            programs[i][0] = (int)(Math.random() * 99001 + 1000);   // [0] holds the size
            programs[i][1] = i + 1;                                 // [1] holds the Program number
            System.out.println("Program " + (i + 1) + ", " + programs[i][0] + " bits");
        }
        System.out.println();
        
        Arrays.sort(programs, new java.util.Comparator<int[]>() {
                public int compare(int[] a, int[] b) {
                    return Integer.compare(a[0], b[0]);
                }
            });
            
        System.out.println("The optimal order is:");
        System.out.println();
        for (int i = 0; i < amount; i++) {
            System.out.print("Program " + programs[i][1]);
            
            if (i < amount - 1) {
                System.out.print(", ");
            } else {
                System.out.println(".");
            }
        }
        
    }
}

 
