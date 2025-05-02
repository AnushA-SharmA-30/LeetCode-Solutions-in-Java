class Solution { 
public int characterReplacement(String s, int k) { 
int left = 0, maxCount = 0, maxLength = 0; 
int[] charFreq = new int[26]; 
for (int right = 0; right < s.length(); right++) { 
charFreq[s.charAt(right) - 'A']++; 
maxCount = Math.max(maxCount, charFreq[s.charAt(right) - 'A']); 
while ((right - left + 1) - maxCount > k) { 
charFreq[s.charAt(left) - 'A']--; 
left++; 
} 
maxLength = Math.max(maxLength, right - left + 1); 
} 
return maxLength; 
} 
}
public static void main(String[] args) { 
Solution solution = new Solution(); 
String s = "AABABBA"; 
int k = 1; 
System.out.println(solution.characterReplacement(s, k)); // Output: 4 
} 
}