import java.util.Scanner;

public class sixth {

	public static void main(String[] args) {
		
	//	Napisz program umo�liwiaj�cy wyliczenie miesi�cznej raty za zakupiony towar. Program ma otrzymywa� na wej�ciu:
	//		-cen� towaru (np. 1000 z�, maksymalnie 50 000 z�)
	//		-liczb� rat (np. 12, maksymalnie 48 rat)
	//		W zale�no�ci od liczby rat program przypisuje oprocentowanie:
	//		-1-12 wynosi 3%
	//		-13-24 wynosi 6%
	//		-25-48 wynosi 10%
	//		i zwraca obliczon� rat� miesi�czn�.
	
		System.out.print("Podaj cene towaru: ");
        double kwota;
        Scanner odczyt = new Scanner(System.in);
        kwota = odczyt.nextDouble();
        if(kwota>50000){
        	
            System.out.println("Bledne kwota");
            
        }
        
        System.out.print("Podaj liczbe rat: ");
        int rata;
        Scanner odczytRat = new Scanner(System.in);
        rata = odczytRat.nextInt();
        if(rata>48){
        	
            System.out.println("B��dne dane!");
            
        }
        if (rata>=1 && rata<=12){
            double odsetki = kwota+ (kwota * 0.03);
            System.out.println("Rata miesieczna to: " +odsetki/rata);
        }
        else if(rata>=13 && rata <=24){
            double odsetki1 = kwota+ (kwota * 0.06);
            System.out.println("Rata miesieczna to: " +odsetki1/rata);
        }
        else if(rata>=25 && rata<=48){
            double odsetki2 = kwota+ (kwota * 0.10);
            System.out.println("Rata miesieczna to: " +odsetki2/rata);
        }
        else{
            System.out.println("Popraw dane!");

	        }
	    }
		 	
}
		
		
		
		
		
		
		


