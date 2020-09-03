package dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave5OBLIG {

	public static void main(String[] args) {

		final int n = 1000;
		String Karakter = "";
		for (int i=0;i<10;i++) {
			int kar = parseInt(showInputDialog("legg inn score: "));
			
			for(int j=0; j<n ;j++) {
				if(kar<0 || kar>100) {
					kar = parseInt(showInputDialog("feil, legg inn gyldig score: "));
				}else{j=n;}
			}
		if(kar>=0) {
			Karakter="F";
			if(kar>=40) {
				Karakter="E";
				if(kar>=50) {
					Karakter="D";
					if(kar>=60) {
						Karakter="C";
						if(kar>=80) {
							Karakter="B";
							if(kar>=90) {
								Karakter="A";
		}}}}}}
		showMessageDialog(null, Karakter);	
		}
	}		

	}

