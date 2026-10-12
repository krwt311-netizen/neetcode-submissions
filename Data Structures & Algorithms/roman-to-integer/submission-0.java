class Solution {
    public int romanToInt(String s) {
        Map<Character , Integer > x = new HashMap<>();
        x.put('I',1);
         x.put('V',5);
          x.put('X',10);
           x.put('L',50);
            x.put('C',100);
             x.put('D',500);
              x.put('M',1000);
              int r = 0 ; 
              for(int i =0 ; i< s.length() ; i++){
                if(i+1<s.length()&& x.get(s.charAt(i))<x.get(s.charAt(i+1))){
                    r = r-x.get(s.charAt(i));
                }
                else{
                    r = r+x.get(s.charAt(i));
                }
              }
              return r;
        
    }
}