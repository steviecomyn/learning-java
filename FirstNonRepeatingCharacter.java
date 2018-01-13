import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    
        public static String firstNonRepeatingCharacter(String userInput){
            
            // Split the string into an Array.
            String inputArray[] = userInput.split("");
            
            // Counter for storing the Occurrence of a certain Character.
            int characterOccurrence = 0;
            
            // Counter for the For Loop.
            int i = 0;
            
            // HashMap to store Characters and occurrences. 
            HashMap<String, Integer> charCountArray = new HashMap<String, Integer>();
            
            // Get the length of the User's Input.
            int inputLength = userInput.length();
            
            
            for(i = 0; i < inputLength; i++){
                // Middle-man variable.
                String currentCharacter = inputArray[i];
                
                // if the HashMap doesn't have this Character, set it with an Occurrence of 1.
                if(!charCountArray.containsKey(currentCharacter)){
                    characterOccurrence = 1;
                    charCountArray.put(currentCharacter, characterOccurrence);
                }
                // if it's shown up before, increase the occurrence counter.
                else {
                    characterOccurrence = characterOccurrence + 1;
                    charCountArray.put(currentCharacter, characterOccurrence);
                }
            }
            
            String answer ="";
            
            // Cycle through the HashMap to find 1st Non Repeating Character.
            for(i = 0; i < inputLength; i++){
                answer = inputArray[i];
                
                if(charCountArray.get(answer)==1){
                    break;
                }
            }
            
            return answer;
            
        }
    
    
        public static void main(String argsp[]) {
    
        // Users Input for testing purposes.
        String userInput = "bananarama";
        
        System.out.println("The First Non-Repeating Character is: " + firstNonRepeatingCharacter(userInput));
        
    }
}