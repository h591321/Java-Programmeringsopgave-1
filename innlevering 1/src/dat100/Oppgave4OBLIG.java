package dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class Oppgave4OBLIG {

	public static void main(String[] args) {
		
		int brutto = parseInt(showInputDialog("legg inn din bruttolønn: "));
		
		double trin=0;
		if(brutto>164100) {
			trin=brutto*0.0093;
			if(brutto>230950) {
				trin=brutto*0.0241;
				if(brutto>580650) {
					trin=brutto*0.1152;
					if(brutto>934050) {
						trin=brutto*0.1452;
						
					}
				}
			}
		}
		
		System.out.println(trin+" kroner må du betale i trinnskatt");
		}

	}