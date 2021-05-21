import javax.swing.JOptionPane;

public class Liter_calc {

	public static double liter_to_g(double in) {
		double liter_calc = in;
		double out = liter_calc * 4.546;


		return out;
	}

	public static double g_to_liter(double in) {
		double gali_calc = in;
		double out = gali_calc / 4.546;;

		return out;
	}

	public static void output(double array[]) {
		double[] output_1 = array;
		//String eingabe_out1 = eingabe;
		//double eingabe_out2 = eing_2;

		JOptionPane.showMessageDialog(null,"Sind umgerechnet "+ output_1 + ".");
	}

	public static void main(String[] args) {
		double[] array = new double[2];


		String eingabe = JOptionPane.showInputDialog(null, "Bitte geben Sie eine Zahl ein.");
		array[1] = Double.parseDouble(eingabe);

		String eingabe_2 = JOptionPane.showInputDialog(null, "Bitte geben Sie die Einheit l. oder Imp.gal ein.");
		double eing_2 = Double.parseDouble(eingabe_2);
		array[0] = eing_2;

			switch(eingabe_2){
			case "Imp.gal": g_to_liter(array[1]);
				break;

			case "l.": liter_to_g(array[1]);
				break;


			default: JOptionPane.showMessageDialog(null, "Ihre Eingabe ist falsch, bitte versuchen Sie es erneut.");
			}

			//double out_1= out[];

			array[0] = new double out;

			output(array[2]);
	}

}
