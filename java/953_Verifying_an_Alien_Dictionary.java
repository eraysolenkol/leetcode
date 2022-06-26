/* In an alien language, surprisingly, they also use English lowercase letters, but possibly in a different order.
The order of the alphabet is some permutation of lowercase letters.

Given a sequence of words written in the alien language, and the order of the alphabet,
return true if and only if the given words are sorted lexicographically in this alien language. */

class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        for(int i = 0; i < words.length-1; i++) {
            // finds the length of the shorter word.
            int minLengthOfTwoWord = Math.min(words[i].length(),words[i+1].length());
          
            // checking the chars in words until the length of the shorter word.
            for(int j = 0; j < minLengthOfTwoWord; j++) { 
              
                /* if the index of the first word's char in the order string is less than the second words's char,
                   the order for that 2 word is true and we can skip to next words. */
                if (order.indexOf(words[i].charAt(j)) < order.indexOf(words[i+1].charAt(j))) {
                    break;
                  
                // if they are the same character check the next characters.
                } else if (order.indexOf(words[i].charAt(j)) == order.indexOf(words[i+1].charAt(j))){
                  
                    /* if it is end of the shorter word look up the first word, if it is shorter one the order is true and
                       skip to next words else return the function false. */
                    if (j == minLengthOfTwoWord - 1) {
                        if(words[i].length() == minLengthOfTwoWord) {
                            break; 
                        } else {
                            return false;
                        }
                    }
                    continue;
                  
                /* if the index of the first word's char in the order string is not less than the second words's char return
                   the function false. */
                } else {
                    return false;
                }
            } 
        }
        return true;
    }
}
