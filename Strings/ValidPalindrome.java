class Solution {
    public boolean isPalindrome(String s) {
       String res = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
       String rev = new StringBuilder(res).reverse().toString();
       for(int i =0;i<res.length();i++)
       {
        if(rev.charAt(i)!=res.charAt(i))
        {
            return false;
        }
       }
       return true;
    }
}
