public class pattern2 {
    public static void main(String[] args) {
        int n = 5; // size of the pyramid
        for(int i=0;i<n;i++) {
            for (int j = 0;j<=i;j++) {
                System.out.print("* ");// print star
            }
            System.out.println();
        }
    }
}
