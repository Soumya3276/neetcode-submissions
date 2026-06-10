class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        String sLower = s.toLowerCase();

        while(l<r){
            //skipping non alpha numeric from front
            while(l<r && !alphaNum(s.charAt(l)))
            {
                l++;
            }
            //skipping non alpha numeric from back
            while(r>l && !alphaNum(s.charAt(r)))
            {
                r--;
            }
            //checks if both the character are not same
            if(sLower.charAt(l) != sLower.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
        
    }

    boolean alphaNum(char c){
        return (c>='A' && c<='Z') || 
               (c>='a' && c<='z') ||
               (c>='0' && c<='9');
    }
}
