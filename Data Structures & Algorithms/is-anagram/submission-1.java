class Solution {
    public boolean isAnagram(String s, String t) {

        int n = s.length();
        int m = t.length();

        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(char ch:t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)-1);
        }

        for(var count: map.entrySet()){
            if(count.getValue()!=0){
                return false;
            }
        }

        return true;

    }
}
