import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num= input.nextInt();
        int count=1;
        while (count<=num){
            System.out.println(count+" ");
            count++;
        }
    }
}
