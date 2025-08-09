class Solution {
    public boolean hasMatch(String s, String p) {
       String[] parts = p.split("\\*",2);
       String preffix = parts[0];
       String suffix = parts[1];
       int i = s.indexOf(preffix);
       return i!=-1 && s.indexOf(suffix, i+preffix.length()) !=-1;
    }
}
