import java.util.Scanner;
public class Aufgabe19_AlgorithmusVonEuklid {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int ggt;
		int zahl1 = sc.nextInt();
		int zahl2 = sc.nextInt();
//		int zahl1 = 16;
//		int zahl2 = 12;
		
		if (zahl1%2==0) {
			if(zahl2%2==0) {
				ggt = 2;
				while(zahl1%ggt==0 && zahl2%ggt==0) {
					ggt = ggt + 2;
				}
					System.out.println(ggt-2);
				
			}
		}
	}
}
