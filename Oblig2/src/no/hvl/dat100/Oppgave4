package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave4 {
	public static void main(String[] args) {
		String tallTxt = showInputDialog("Skriv inn bruttoinntekt: ");
		
		double bruttoinntekt = parseInt(tallTxt);
		
		double trinn0 = 0.00;
		double trinn1 = 0.93;
		double trinn2 = 2.41;
		double trinn3 = 11.52;
		double trinn4 = 14.52;
		
		if ((bruttoinntekt > 0) && (bruttoinntekt <= 164100)) {
			showMessageDialog(null, "Trinnskatten er: " + trinn0 + "%" + " og skatten blir lik 0");
		}
		if ((bruttoinntekt >= 164101) && (bruttoinntekt <= 230950)) {
			bruttoinntekt = (double) (0.0093*(bruttoinntekt-164100));
			showMessageDialog(null, "Trinnskatten er: " + trinn1 + "%" + " og skatten blir lik " + bruttoinntekt + " kroner");
		}
		if ((bruttoinntekt >= 230951) && (bruttoinntekt <= 580650 )) {
			bruttoinntekt = (double) (0.0241*(bruttoinntekt-164100));
			showMessageDialog(null, "Trinnskatten er: " + trinn2 + "%" + " og skatten blir lik " + bruttoinntekt + " kroner");
		}
		if ((bruttoinntekt >= 580651) && (bruttoinntekt <= 934050)) {
			bruttoinntekt = (double) (0.1152*(bruttoinntekt-164100));
			showMessageDialog(null, "Trinnskatten er: " + trinn3 + "%" + " og skatten blir lik " + bruttoinntekt + " kroner");
		}
		if (bruttoinntekt >= 934051) {
			bruttoinntekt = (double) (0.1452*(bruttoinntekt-164100));
			showMessageDialog(null, "Trinnskatten er: " + trinn4 + "%" + " og skatten blir lik " + bruttoinntekt + " kroner");
		}
		if (bruttoinntekt <= 0) {
			showMessageDialog(null, "Ugyldig tall");
		}
	}

}
