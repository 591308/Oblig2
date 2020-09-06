package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave6 {
	public static void main(String[] args){
		String tallTxt = showInputDialog("Skriv inn et heltall (n>0): ");
		int heltall = parseInt(tallTxt);
		
		int c, f = 1;
		if (heltall < 0) 
			showMessageDialog(null, "Nummer må vere positiv tall");
		else
		{
			for (c = 1; c <= heltall; c++)
				f = f*c;
			showMessageDialog(null, "Faktorial av " + heltall + "! er lik " + f);
		}
	}
}
