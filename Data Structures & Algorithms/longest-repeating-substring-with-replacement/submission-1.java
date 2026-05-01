class Solution {
    public int characterReplacement(String s, int k) {
      int left = 0;
      int maxLen = 0;
      int maxFrequency = 0;

      int charCount[] = new int[26];

      for(int right = 0; right < s.length(); right++){

          charCount[s.charAt(right) - 'A']++;
          maxFrequency = Math.max(maxFrequency,charCount[s.charAt(right) - 'A']);

          while((right - left + 1) - maxFrequency > k){
            charCount[s.charAt(left) - 'A']--;
            left++;
          }
          maxLen = Math.max(maxLen,right - left +1);
      }
        return maxLen;
    }
}
