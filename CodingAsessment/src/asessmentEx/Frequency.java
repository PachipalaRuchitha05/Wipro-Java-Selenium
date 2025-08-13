package asessmentEx;

import asessmentEx.HighestFrequencyCharacter.CharacterCounter;
import asessmentEx.HighestFrequencyCharacter.RemoveSpaces;
import asessmentEx.HighestFrequencyCharacter.concatenator;


public class Frequency {

	public static void main(String[] args) {
	String String = "Java Selenium";
    char result = HighestFrequencyCharacter.FindHighestCharacter(String);
    System.out.println("The highest frequency character is: " + result);
    
    String input = "selenium";  
    String res = HighestFrequencyCharacter.replaceFirstVowel(input);
     System.out.println("\n Modified String: " + res);
     
     String ch = "Java123@Selenium&Batch7#";
     CharacterCounter counter = new CharacterCounter();
     counter.countCharacter(ch);
     
     System.out.println("Alphabets: " + counter.getAlphabets());
     System.out.println("Digits: " + counter.getDigits());
     System.out.println("Special Characters: " + counter.getSpecialChars());
     
     String r = "Java programming ";

     RemoveSpaces remover = new RemoveSpaces();
     String res1 = remover.removeSpaces(r);  
     System.out.println("String without spaces: \"" + res1 + "\"");
     
    
     concatenator concatenator = new concatenator();
     String st = concatenator.concatenate("Hello ", "World!");
     System.out.println(st);

	}
	
}

	

