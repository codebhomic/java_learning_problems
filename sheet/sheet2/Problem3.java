import java.util.Scanner;

class Problem3 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scn.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2 == 0){
                System.out.println(i+": Even");
            }else{
                System.out.println(i+": Odd");
            }
        }
    }
}