import java.util.Scanner;

class Problem1 {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scn.nextInt();
        if(n<0){
            System.out.println("Down");
        }else{
            System.out.println("Up");
        }
    }
}