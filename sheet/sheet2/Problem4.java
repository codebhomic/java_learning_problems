import java.util.Scanner;

class Problem4 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scn.nextInt();
        for(int i=1;i<=n;i++){
            for(int j = 1; j <= i; j++){
                if(j%2 == 0){
                    System.out.print("Y");
                }else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}