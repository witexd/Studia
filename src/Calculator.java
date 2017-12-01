import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {
		
		int x;
		int y;
		int wynik;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Podaj pierwsza liczbe: ");
		x = scanner.nextInt();
		System.out.println("Podaj druga liczbe: ");
		y = scanner.nextInt();						
		
		
		int suma = x + y;
		int roznica = x - y;
		int iloczyn = x * y;
		double iloraz = (double)x / (double)y;
		

		System.out.println("Wybierz dzialanie jakie chcesz wykonac: ");

		do {
		System.out.println("1. Dodawanie");
		System.out.println("2. Odejmowanie");
		System.out.println("3. Mnozenie");
		System.out.println("4. Dzielenie");
		

		
		wynik = scanner.nextInt();

		} while(wynik < 1 || wynik > 5);

		System.out.println();

		switch(wynik){
		case 1:
		System.out.println("Wynik dodawania:  " +suma);
		break;
		case 2:
		System.out.println("Wynik odejmowania: " +roznica);
		break;
		case 3:
		System.out.println("Wynik mnozenia: " +iloczyn);
		break;
		case 4:
		System.out.println("Wynik dzielenia: " +iloraz);
		break;
		
		default:
		System.out.println("Nie ma takiej opcji, wybierz ponownei");

		}
		
	}

}


















