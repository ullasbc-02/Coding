public class Pyramid {
    public static void main(String[] args) {
        int n = 5; // size of pyramid
        
        
        for(int i=1;i<=n;i++){
            if(i==1 || i==n){
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                }
                System.out.println();
            }else{
                System.out.print("*");
                for(int k=1;k<=n-2;k++){
                    System.out.print(" ");
                }
                System.out.print("*");
                System.out.println();
            }
        }
            
    }
}
