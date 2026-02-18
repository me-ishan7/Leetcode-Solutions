class Solution {
    public String toggleCase(String s) {
        
        StringBuilder str = new StringBuilder(s);
     
        for(int i = 0; i < str.length(); i++) {
            
            char ch = str.charAt(i);
            int ascii = (int)ch;
            
            if(ascii >= 97 && ascii <= 122){
                
                ascii -= 32;
                char ns = (char)ascii;
                str.setCharAt(i, ns);
                
            }
            else {
                ascii += 32;
                char ns = (char)ascii;
                str.setCharAt(i, ns);
            }
            
        }
        return str.toString();
    }
}
