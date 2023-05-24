public class Main
{
    public static String removesDuplicates(String word){
        StringBuilder sb = new StringBuilder(word); //creating a stringbuilder that appends the input word
        for(int i=0; i<sb.length(); i++){
            for(int j=i+1; j<sb.length(); j++){ //j represents the indices of elements following the current element
                if(sb.charAt(i)==sb.charAt(j)){ //if the current element and one of the following elements correspond
                    sb.deleteCharAt(j); //the following element is removed (as it is seen as a duplicate)
                    j = j - 1; //we go back
                }
            }
        }
        String updatedWord = sb.toString(); //convert stringbuilder to string
        System.out.println(updatedWord);
        return updatedWord;
    }
    
    public static String capitalizeWords(String sentence){
    StringBuilder sb = new StringBuilder();
    sb.append(sentence.substring(0, 1).toUpperCase()); //capitalizing first letter of the stringbuilder
    
    for(int i=1; i<sentence.length(); i++){ //starting after the first letter
        if(sentence.charAt(i) == ' '){
            sb.append(' '); //if we encounter a space (meaning that we will start with a new word)
            sb.append(sentence.substring(i+1, i+2).toUpperCase()); //we capitalize the letter that follows that space
            i = i + 1;
        }
        else{
            sb.append(sentence.charAt(i));
        }
    }
    System.out.println(sb);
    String newSentence = sb.toString();
    return newSentence;
    }
    
    
    public static boolean startswithIgnoreCase(String word, String prefix){
    for(int i=0; i<prefix.length(); i++){
        if(word.contains(Character.toString(Character.toLowerCase(prefix.charAt(i)))) 
        || word.contains(Character.toString(Character.toUpperCase(prefix.charAt(i))))){
            return true; //if the word contains a string (prefix) regardless of whether its individual characters
        }               //are uppercase or lowercase then return true
    }
    return false; //otherwise we return false;
    }
  
  
    public static String reverse(String word){
    StringBuilder sb = new StringBuilder();
    
    for(int i=0; i<word.length(); i++){
        sb.append("-"); //we initialize the stringbuilder with dashes the number of a given word
    }
    
    for(int i=word.length()-1; i>0-1; i--){
        for(int j=0; j<word.length(); j++){
            sb.replace(j, j+1, Character.toString(word.charAt(i))); //we insert the character at index i onto position j to j+1
            i = i - 1; //we proceed going backwards
        }
    }
    System.out.print(sb);
    String reversedWord = sb.toString();
    return reversedWord;
      
    }
    
    
    
    public static String reverseSentence(String sentence){
    reverse(sentence); //as the method reverse already takes into account spaces
    return sentence;
    }
    
}
