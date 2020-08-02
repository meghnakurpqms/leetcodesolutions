class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.replaceAll("[^a-zA-z0-9]"," ").toLowerCase();
        String[] words = paragraph.split("\\s+"); 
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String maxString="";
        int max = 0;
        HashSet<String> ban = new HashSet<>();
        for(int i = 0; i < banned.length;i++)
        {
            ban.add(banned[i]);
        }
        for(String word:words)
        {
            System.out.println("word:"+word);
            if(!ban.contains(word))
            {
                
                    map.put(word,map.getOrDefault(word,0)+1);
                    System.out.println("word:"+word+" | map.get:"+map.get(word));
            }
        }
         for(String word:words)
         {
            if(!ban.contains(word)){
//                 System.out.println("Max:"+max +" map.get(word):"+map.get(word));
                if(max < map.get(word))
                {
                    max = map.get(word);
                   
                    maxString = word;
                     System.out.println("max:"+max +" maxString:"+maxString);
                }
            }
         }
        return maxString;
        //return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}