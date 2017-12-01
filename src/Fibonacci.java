import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int n;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Podaj n: " );
		n = scanner.nextInt();
		
		
		
		int fibCount = 11;
        int[] fib = new int[fibCount];
        fib[0] = n;
        fib[1] = ++n;
        for(int i=2; i < fibCount; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }

        for(int i=0; i< fibCount; i++){
                System.out.print(fib[i] + " ");
        }
		
		
	
	}

}




