package no.hvl.dat100;

import java.util.*;

public class Oppgave4b {
	public static void main(String[] args) {
		double skatt=0,it;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Skriv inn inntekt ");
		it=sc.nextDouble();
		if(it<=164100) {
			skatt=0;
		}
		else if(it<=230950) {
			skatt=0.0093*(it-164100);
		}
		else if(it<=580650) {
			skatt=0.0241*(it-164100);
		}
		else if(it<=934050) {
			skatt=0.1152*(it-164100);
		}
		else if(it>=934051) {
			skatt=0.1452*(it-164100);
		}
		System.out.println("Trinnskatten er på " + skatt);
	}
}
