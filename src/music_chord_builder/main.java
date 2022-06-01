package music_chord_builder;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		//object for validation class
		InputValidation input = new InputValidation();
		
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
		chords.add("Diminished");
		chords.add("Augmented");
		chords.add("Maj-7");
		chords.add("Dom-7");
		chords.add("Min-7");
		chords.add("Half Dim-7");
		chords.add("Dim-7");
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
			int root = input.readInteger("Please enter a number associated with one of the notes above:", "Not a valid choice", 1, 12);
			
			//prompt and print chord types
			System.out.println("What chord type would you like?");
			for (String element : chords) {
			    System.out.println((chords.indexOf(element) + 1) + ". " + element);
			}	
			
			//prompt and get chord type
			int chord = input.readInteger("Please enter a number associated with one of the chord types above:", "Not a valid choice", 1,9);
			
			//print choices
			System.out.println("\nChord Root:" + notes.get(root -1));
			System.out.println("Chord Type: " + chords.get(chord -1));
			
			//print methods
			if(chord == 1) {
				System.out.println("Notes in chord: " + makeMajor(notes, root));
			}else if(chord == 2){
				System.out.println("Notes in chord: " + makeMinor(notes, root));
			}else if(chord == 3) {
				System.out.println("Notes in chord: " + makeDiminished(notes, root));
			}else if(chord ==4) {
				System.out.println("Notes in chord: " + makeAugmented(notes, root));
			}else if(chord == 5) {
				System.out.println("Notes in chord: " + makeMaj7(notes, root));
			}else if(chord == 6) {
				System.out.println("Notes in chord: " + makeDom7(notes, root));
			}else if(chord == 7) {
				System.out.println("Notes in chord: " + makeMin7(notes, root));
			}else if(chord == 8) {
				System.out.println("Notes in chord: " + makeHalfDim7(notes, root));
			}else if (chord == 9) {
				System.out.println("Notes in chord: " + makeDim7(notes, root));
			}
			
			//variable for second loop
			boolean cont2 = false;
		
			//loop 2
			while(!cont2) {	
				//prompt to continue and get choice plus validation
				System.out.println("Would you like to make another chord?:"
						+ "\n1. Yes"
						+ "\n2. No");
				int yN = input.readInteger("Please enter the number associated with your choice", "Not a valid choice", 1, 2);
				if(yN == 1) {
					cont = false; 
					cont2 = true;
				}else if (yN == 2){
					cont = true;
					cont2 = true;
				}
			}
		}
		
		//end prompt
		System.out.println("Thanks for trying out my chord builder app, goodbye!");
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
	
	//method for diminished
	public static ArrayList<String> makeDiminished (ArrayList<String> notes, int root){
		ArrayList<String> newChord = new ArrayList<String>();
		newChord.add(notes.get(root - 1));
		newChord.add(notes.get(root + 2));
		newChord.add(notes.get(root + 5));
		return newChord;
	}
	
	//method for augmented
	public static ArrayList<String> makeAugmented (ArrayList<String> notes, int root){
		ArrayList<String> newChord = new ArrayList<String>();
		newChord.add(notes.get(root - 1));
		newChord.add(notes.get(root + 3));
		newChord.add(notes.get(root + 7));
		return newChord;
	}
	
	//method for major 7
	public static ArrayList<String> makeMaj7 (ArrayList<String> notes, int root){
		ArrayList<String> newChord = new ArrayList<String>();
		newChord.add(notes.get(root - 1));
		newChord.add(notes.get(root + 3));
		newChord.add(notes.get(root + 6));
		newChord.add(notes.get(root + 10));	
		return newChord;
	}

	//method for Dominant 7
	public static ArrayList<String> makeDom7 (ArrayList<String> notes, int root){
		ArrayList<String> newChord = new ArrayList<String>();
		newChord.add(notes.get(root - 1));
		newChord.add(notes.get(root + 3));
		newChord.add(notes.get(root + 6));
		newChord.add(notes.get(root + 9));	
		return newChord;
	}
	
	//method two for minor 7
	public static ArrayList<String> makeMin7 (ArrayList<String> notes, int root){
		ArrayList<String> newChord = new ArrayList<String>();
		newChord.add(notes.get(root - 1));
		newChord.add(notes.get(root + 2));
		newChord.add(notes.get(root + 6));
		newChord.add(notes.get(root + 9));
		return newChord;
	}
	
	//method two for minor chords
	public static ArrayList<String> makeHalfDim7 (ArrayList<String> notes, int root){
		ArrayList<String> newChord = new ArrayList<String>();
		newChord.add(notes.get(root - 1));
		newChord.add(notes.get(root + 2));
		newChord.add(notes.get(root + 5));
		newChord.add(notes.get(root + 9));
		return newChord;
	}
	//method two for minor chords
		public static ArrayList<String> makeDim7 (ArrayList<String> notes, int root){
		ArrayList<String> newChord = new ArrayList<String>();
		newChord.add(notes.get(root - 1));
		newChord.add(notes.get(root + 2));
		newChord.add(notes.get(root + 5));
		newChord.add(notes.get(root + 8));
		return newChord;
	}
}
