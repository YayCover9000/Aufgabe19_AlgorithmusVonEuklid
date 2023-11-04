import java.util.InputMismatchException;
import java.util.Scanner;
public class Aufgabe19_AlgorithmusVonEuklid {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int ggt;
		int zahl1;
		int zahl2;
//		int zahl1 = 54;
//		int zahl2 = 64;
		int q;
		int p;
		int r = 1;
		 try {
	            zahl1 = sc.nextInt();
	            zahl2 = sc.nextInt();
	        } catch (InputMismatchException e) {
	            System.out.println("Eingabe ist keine gueltige Ganzzahl.");
	            return; // Beendet das Programm, da die Eingabe ungültig ist.
	        }
		
		if(zahl1 > 0 && zahl2 > 0) {
				p = ((zahl1<zahl2)?zahl1:zahl2); // wenn zahl1 kleiner zahl 2 dann ist p = zahl1 
			//System.out.println(p);
			q = ((zahl1>zahl2)?zahl1:zahl2);
			//System.out.println(q);
	
			while(r!=0) {
				r = p%q;
				if(r==0) {
					System.out.println(q + " ist gesuchter Teiler");
				}else {
					p = q;
					q = r;
				}
			}
		
		} else if(zahl1 < 0) {
			System.out.println("Zahl 1 negativ");

		}else if(zahl2 < 0) {
			System.out.println("Zahl 2 negativ");
		}
	}
}
