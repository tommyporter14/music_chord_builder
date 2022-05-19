package music_chord_builder;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		//scanner
		Scanner scnr = new Scanner(System.in);
		
		//data and variables
		ArrayList<String> notes = new ArrayList<String>();
		notes.add("C");
		notes.add("C#/Db");
		notes.add("D");
		notes.add("D#/Eb");
		notes.add("E");
		notes.add("F");
		notes.add("F#/Gb");
		notes.add("G");
		notes.add("G#/Ab");
		notes.add("A");
		notes.add("A#/Bb");
		notes.add("B");
		notes.add("C");
		notes.add("C#/Db");
		notes.add("D");
		notes.add("D#/Eb");
		notes.add("E");
		notes.add("F");
		notes.add("F#/Gb");
		notes.add("G");
		notes.add("G#/Ab");
		notes.add("A");
		notes.add("A#/Bb");
		notes.add("B");
		
		ArrayList<String> chords = new ArrayList<String>();
		chords.add("Major");
		chords.add("Minor");
		
		boolean cont = false;
		
		//greeting
		System.out.println("Welcome to my chord builder app");
		
		//loop 1
		while(!cont) {
			//prompt and print notes
			System.out.println("\nWhat would you like the root key of your chord to be?");
			for (int i = 0; i<12; i++) {
			    System.out.println((i+1) + ". " + notes.get(i));
			}
			
			//prompt and get root
			System.out.println("Please enter a number associated with one of the notes above:");
			int root = scnr.nextInt();
			//prompt and print chord types
			System.out.println("What chord type would you like?");
			for (String element : chords) {
			    System.out.println((chords.indexOf(element) + 1) + ". " + element);
			}	
			
			//prompt and get chord type
			System.out.println("Please enter a number associated with one of the chord types above:");
			int chord = scnr.nextInt();
			
			//print choices
			System.out.println("\nChord Root:" + notes.get(root -1));
			System.out.println("Chord Type: " + chords.get(chord -1));
			
			//print methods
			if(chord == 1) {
				System.out.println("Notes in chord: " + makeMajor(notes, root));
			}else {
				System.out.println("Notes in chord: " + makeMinor(notes, root));
			}
			
			//clear scanner
			scnr.nextLine();
			
			//variable for second loop
			boolean cont2 = false;
		
			//loop 2
			while(!cont2) {	
				//prompt to continue and get choice plus validation
				System.out.println("Would you like to make another chord? (Y/N)");
				String yN = scnr.nextLine();
				if(yN.equalsIgnoreCase("y")) {
					cont = false; 
					cont2 = true;
				}else if (yN.equalsIgnoreCase("n")){
					cont = true;
					cont2 = true;
				}else {
					System.out.println("Not a valid input, try again.");
					cont2 = false;
				}
			}
		}
		
		//end prompt
		System.out.println("Thanks for trying out my chord builder app, goodbye!");
		//close scanner
		scnr.close();
	}
	
	//method one for major chords
	public static ArrayList<String> makeMajor (ArrayList<String> notes, int root){
		ArrayList<String> newChord = new ArrayList<String>();
		newChord.add(notes.get(root - 1));
		newChord.add(notes.get(root + 3));
		newChord.add(notes.get(root + 6));
		return newChord;
	}
	
	//method two for minor chords
	public static ArrayList<String> makeMinor (ArrayList<String> notes, int root){
		ArrayList<String> newChord = new ArrayList<String>();
		newChord.add(notes.get(root - 1));
		newChord.add(notes.get(root + 2));
		newChord.add(notes.get(root + 6));
		return newChord;
	}
}
