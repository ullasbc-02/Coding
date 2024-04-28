public class pattern4 {
    public static void main(String[] args) {
        int n = 5; // size of the pyramid
        for(int i=n;i>0;i--) {
            for (int j = 1;j<=i;j++) {
                System.out.print(j+" ");// number inverted pyramid
            }
            System.out.println();
        }
    }
}
