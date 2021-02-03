 /**
  * This class has the tools to play a game of Hangman (WordGuess)
  *
  * @author Chloe Ng
  * @version - 09/17/2020
  */
 public class WordGuess
 {
 
    public static String makeUserWord(String theWord)
    {
    
      String userWord = "";
      
      for (int counter = 0; counter < theWord.length(); counter++)
      {
         userWord = userWord + "*";
      }
      
      return userWord;
      
    }
    
    public static boolean isInWord(char guess, String word)
    {

      boolean found = false;
    
      for (int i = 0; i < word.length(); i++)
      {
         if (guess == word.charAt(i))
         {
            found = true;
         }   
      }
      
      return found;
      
    }
    
    public static String updateUserWord(char guess, String userWord, String theWord)
    {
     
      for (int i = 0; i < theWord.length(); i++)
      {
         
         if (theWord.charAt(i) == guess)
         {  
		      userWord = userWord.substring(0, i) + guess + userWord.substring(i + 1);
         }       
      }
      
      return userWord;

    }
              
   public static String updateGuesses(String guesses, char guess)
   {
   
      if (!guesses.contains(String.valueOf(guess)))
      {
         guesses += guess; 
      }
         
      return guesses; 
   }
   
   public static String displayUserWord(String userWord)
   {
   
      for (int i = 0; i <= userWord.length(); i++)
      {
         userWord.replace("*","_");
      }
   
      return userWord + " ";
   }
   
   public static String displayGuesses(int strikes, String guesses)
   {
      
      return "Strikes: " + strikes + " Guesses: " + guesses.replaceAll(".", "$0 ");
   
   }
   
}
