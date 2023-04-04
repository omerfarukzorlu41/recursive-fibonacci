import java.util.Scanner;
public class Main {
    static int fibonacci(int fib){
        if(fib == 1 || fib ==2){
              return 1;
        }
        return fibonacci(fib-1)+fibonacci(fib-2);
    }
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Which index of the Fibonacci series: ");
        number = input.nextInt();
        System.out.println(fibonacci(number));
    }
}
