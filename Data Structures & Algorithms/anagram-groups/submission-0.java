public class Solution {
    public List<List<String>> groupAnagrams(String[] strs){
        Map<String, List<String>> res = new HashMap<>();
        for(String s : strs){
            char[] a = s.toCharArray();
            Arrays.sort(a);
            String sortedS =  new String(a);
            res.putIfAbsent(sortedS, new ArrayList<>());
            res.get(sortedS).add(s);
        }
        return new ArrayList<>(res.values());
    }

}