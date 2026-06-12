class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        return false;

        //all values are zero
        int[] count = new int[26];

        String sLower = s.toLowerCase();
        String tLower = t.toLowerCase();

        for(int i=0; i<s.length();i++){
            count[sLower.charAt(i) - 'a']++; //incrementing the value for that character in array
            count[tLower.charAt(i) - 'a']--; //decrementing the value for that character in array
        }

        for(int v : count){
            if(v!=0)
            return false;
        }
        return true;

        
    }
}
