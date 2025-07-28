//For anagrams to work, both words or phrases must contain the same letters in the same quantity.
class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length())
        return false;

        int freq[]=  new int[26];

        for(char c: s.toCharArray())
        {
            freq[c-'a']++;
        }
        for(char c: t.toCharArray())
        {
            freq[c-'a']--;
        }
        for(int count: freq)
        {
            if (count!=0)
            return false;
        }
        return true;
    }

}

//Using enhanced for loop to iterate through characters in the string.
//Time Complexity: O(n) 
//Space Complexity: O(1) - since the frequency array size is constant (26 for lowercase letters).

//"Can your solution handle Unicode characters?" No But we can use a HashMap to handle Unicode characters.