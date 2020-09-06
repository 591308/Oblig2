package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave5 {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			int poeng = parseInt(showInputDialog("Skriv inn poengsum: "));
			String utTxt = "Med " + poeng + " har du oppnådd karakter ";
			
			if ((poeng >= 0) && (poeng <= 39)) {
				showMessageDialog(null, utTxt += "F");
			}
			else if ((poeng >= 40) && (poeng <= 49)) {
				showMessageDialog(null, utTxt += "E");
			}
			else if ((poeng >= 50) && (poeng <= 59)) {
				showMessageDialog(null, utTxt += "D");
			}
			else if ((poeng >= 60) && (poeng <= 79)) {
				showMessageDialog(null, utTxt += "C");
			}
			else if ((poeng >= 80) && (poeng <= 89)) {
				showMessageDialog(null, utTxt += "B");
			}
			else if ((poeng >= 90) && (poeng <= 100)) {
				showMessageDialog(null, utTxt += "A");
			}
			else if ((poeng > 100) || (poeng < 0)) {
				showMessageDialog(null, "Feilmelding, tast inn på nytt");
				i--;
			}
		}
	}

}
