class Solution { 
    public String minWindow(String s, String t) { 
        if (s.length() == 0 || t.length() == 0) return ""; 
        
        Map<Character, Integer> targetCount = new HashMap<>(); 
        for (char c : t.toCharArray()) { 
            targetCount.put(c, targetCount.getOrDefault(c, 0) + 1); 
        } 
        
        int left = 0, right = 0, minLen = Integer.MAX_VALUE, startIndex = 0, required = 
targetCount.size(), formed = 0; 
        Map<Character, Integer> windowCount = new HashMap<>(); 
        
        while (right < s.length()) { 
            char c = s.charAt(right); 
            windowCount.put(c, windowCount.getOrDefault(c, 0) + 1); 
            if (targetCount.containsKey(c) && windowCount.get(c).intValue() == 
targetCount.get(c).intValue()) { 
                formed++; 
            } 
            
            while (left <= right && formed == required) { 
                if (right - left + 1 < minLen) { 
                    minLen = right - left + 1; 
                    startIndex = left; 
                } 
                
                char leftChar = s.charAt(left); 
                windowCount.put(leftChar, windowCount.get(leftChar) - 1); 
                if (targetCount.containsKey(leftChar) && 
windowCount.get(leftChar).intValue() < targetCount.get(leftChar).intValue()) { 
                    formed--; 
                } 
                left++; 
            } 
            right++; 
        } 
        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + 
minLen); 
    } 
}