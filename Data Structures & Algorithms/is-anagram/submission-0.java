class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();

        if(m!=n) return false;

        HashMap<Character,Integer> charcount = new HashMap<>();

        for(char ch: s.toCharArray()){
            charcount.put(ch,charcount.getOrDefault(ch,0)+1);
        }

        for(char ch: t.toCharArray()){
            charcount.put(ch,charcount.getOrDefault(ch,0)-1);
        }


        for(var count: charcount.entrySet()){
            if(count.getValue()!=0){
                return false;
            }
        }

        return true;

    }
}
