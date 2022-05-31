package music_chord_builder;
import java.util.Scanner;

class InputValidation {
	private Scanner scnr;
	InputValidation(){
		scnr = new Scanner(System.in);
	}
	public int readInteger (String promptMsg, String errorMsg) {
		int num = 0;
		String strInput;
		boolean valid = false;
		
		while (valid == false) {
			System.out.println(promptMsg);
			strInput = scnr.nextLine();
			try {
				num = Integer.parseInt(strInput);
				valid = true;
			} catch(NumberFormatException e) {
				System.out.println(errorMsg);
			}
		}
		return num;
	}
	public int readInteger (String promptMsg, String errorMsg, int low, int hi) {
		int num = 0;
		String strInput;
		boolean valid = false;
		
		while (valid == false) {
			System.out.println(promptMsg);
			strInput = scnr.nextLine();
			try {
				num = Integer.parseInt(strInput);
				if (num >= low && num <= hi) {
					valid = true;
				} else {
					System.out.println(errorMsg);
				}
			} catch(NumberFormatException e) {
				System.out.println(errorMsg);
			}
		}
		return num;
	}
	public double readDouble (String promptMsg, String errorMsg) {
		double num = 0;
		String strInput;
		boolean valid = false;
		
		while (valid == false) {
			System.out.println(promptMsg);
			strInput = scnr.nextLine();
			try {
				num = Double.parseDouble(strInput);
				valid = true;
			} catch(NumberFormatException e) {
				System.out.println(errorMsg);
			}
		}
		return num;
	}
	public double readDouble (String promptMsg, String errorMsg, int low, int hi) {
		double num = 0;
		String strInput;
		boolean valid = false;
		
		while (valid == false) {
			System.out.println(promptMsg);
			strInput = scnr.nextLine();
			try {
				num = Double.parseDouble(strInput);
				if (num >= low && num <= hi) {
					valid = true;
				} else {
					System.out.println(errorMsg);
				}
			} catch(NumberFormatException e) {
				System.out.println(errorMsg);
			}
		}
		return num;
	}
}
