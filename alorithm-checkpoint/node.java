 AnalyzeSentence

Input: algorithm that reads a sentence (string) ending with a period (.)

Output:
- Length of the sentence (number of characters)
- Number of words in the sentence
- Number of vowels in the sentence

1. Read the sentence character by character until the period is reached.
2. Initialize the following variables:
   - sentenceLength = 0 (to count the number of characters in the sentence)
   - wordCount = 0 (to count the number of words in the sentence)
   - vowelCount = 0 (to count the number of vowels in the sentence)

3. Iterate through each character in the sentence:
   a. Increment sentenceLength by 1 for each character read.

   b. If the character is a letter:
      - If the character is a vowel (use regex [aeiouAEIOU]):
        - Increment vowelCount by 1

   c. If the character is a space (' '):
      - Increment wordCount by 1

   d. If the character is a period ('.'):
      - Increment wordCount by 1 (to account for the last word before the period).

4. Output the following information:
   - Length of the sentence (sentenceLength)
   - Number of words in the sentence (wordCount)
   - Number of vowels in the sentence (vowelCount)

End of Algorithm

function sum(a,b){
    return number+number;
}
console.log(sum)
