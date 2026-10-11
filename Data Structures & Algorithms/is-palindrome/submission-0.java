class Solution {
    public boolean isPalindrome(String s) {
       StringBuffer s1 = new StringBuffer();
       for(char ch : s.toCharArray()){
        if(Character.isLetterOrDigit(ch)){
            s1.append(Character.toLowerCase(ch));
        }
       }
       if(s1.toString().equals(s1.reverse().toString())){
        return true;
       }
       return false;
        
    }
}
