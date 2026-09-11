class Solution {
    public boolean isAnagram(String s, String t) {
        
        //size
        if (s.length() != t.length()){
            return false;
        }
        
        int[] arr = new int[26];

        //check s and t
        for(int i = 0; i <s.length(); i++){
            arr[s.charAt(i) - 'a'] += 1;
            arr[t.charAt(i) - 'a'] -= 1; // alpha way to do it
            //System.out.println (s.charAt(i));
            //System.out.println (t.charAt(i));
        }

        
        for (int i = 0; i< arr.length; i++){
            if (arr[i] != 0){
                return false;
            }

        }

        /*for(int i = 0; i <t.length(); i++){
            arr[t.charAt(i) - 'a'] -= 1;
        }*/ //beta way to do it
        //int f = arr[s.charAt(0) - 'a'];
        return true;
        //
    }
}

// s0 ="abbc"   ++  
// s1 = "bacb"  --
//       a, b, c, d
// arr= [0][0][0][0]