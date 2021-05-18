

import javax.swing.JOptionPane;

class LiterToGal {
	
	static String eingabe1, eingabe2, ausgabe1;

	static String[] wertUndEinheit;
	static double volumen;

	public static void main(String[] agrs) {														//Teil 4
		
	
		eingabe1 = JOptionPane.showInputDialog(null, "Bitte geben Sie 'Liter' ein, wenn Sie Liter in eine Galone(n) umrechnen wollen. Oder 'Gal' um eine Galone(n) in Liter umzurechnen.");
		volumen = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte geben Sie die Füllmenge an."));	//Füllmenge in Zahl umwandeln.
		
		
		if(eingabe1.equals("Gal")) {
			ToLiter(volumen);
		}
		else if(eingabe1.equals("Liter")){
			ToGal(volumen);
		}
		else {
			JOptionPane.showMessageDialog(null, "Fehler: Geben Sie 'Liter' oder 'Gal' ein.");
		}
		
		
		wertUndEinheit[1]= eingabe1;
		wertUndEinheit[2]= ausgabe1;
		
		AusgabeM(eingabe1, volumen, wertUndEinheit);

	}

	public static String ToGal(double volumen) { 													//Teil 1
		ausgabe1 = Double.toString(volumen * 0.219969);
	
		return ausgabe1;
	}
	
	public static String ToLiter(double volumen) { 													//Teil 2
		ausgabe1 = Double.toString(volumen / 0.219969);
		
		return ausgabe1;
	}
	
	private static void AusgabeM(String eingabe1_, double volumen_, String[] wertUndEinheit_) {		//Teil 4
		
		if(eingabe1_.equals("Gal")){
			JOptionPane.showMessageDialog(null, volumen_ + " " + wertUndEinheit_[1] + "one(nen), sind: " + wertUndEinheit_[2] + "Liter.");
			
		}
		else if(eingabe1_.equals("Liter")){
			JOptionPane.showMessageDialog(null, volumen_ + " " + wertUndEinheit_[1] + ", sind: " + wertUndEinheit_[2] + "Galone(nen).");
			
		}
	}

}