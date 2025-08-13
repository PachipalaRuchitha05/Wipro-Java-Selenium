package asessmentEx;


public class HighestFrequencyCharacter{

public static char FindHighestCharacter(String str) {
	
	 int[] charCounts = new int[256]; 
	 
	 for (char c : str.toCharArray()) {
         charCounts[c]++;
     }
	 
	 int maxCount = -1;
     char highestFreqency = ' ';
     
	 for (int i = 0; i < charCounts.length; i++) {
         if (charCounts[i] > maxCount) {
             maxCount = charCounts[i];
             highestFreqency = (char) i;
         }
     }
     return highestFreqency;
}

public static String replaceFirstVowel(String str) {
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (isVowel(ch)) {
            
            return str.substring(0, i) + '-' + str.substring(i + 1);
        }
    }
    return str;

}

private static boolean isVowel(char ch) {
	 return "aeiouAEIOU".indexOf(ch) != -1;

  }

public static class CharacterCounter {
	private int alphabets;
    private int digits;
    private int specialChar;
    public void countCharacter(String input) {
    	
     alphabets = 0;
     digits = 0;
     specialChar = 0;
    
    for (char ch : input.toCharArray()) {
        if (Character.isLetter(ch)) {
            alphabets++;
        } else if (Character.isDigit(ch)) {
            digits++;
        } else {
            specialChar++;
       }
    }
}
	public int getAlphabets() {
		return alphabets;
	}
	public int getDigits() {
		return digits;
	}
	public int getSpecialChars() {
		return specialChar;
	}

}
public static class RemoveSpaces{
  public String removeSpaces(String input) {
    if (input == null) {
        return null;
    }
    return input.replace(" ", "");
}
}
public static class concatenator{
public String concatenate(String str1, String str2) {
    return str1 + str2;
}
}
}

