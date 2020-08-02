class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length() == 0)
            return true;
        String allUpper = word.toUpperCase();
        String allLower = word.toLowerCase();
        String firstUpper = allUpper.charAt(0) + allLower.substring(1); 
        //System.out.println("allupper:"+allUpper+" allLower:"+allLower+" firstUpper:"+firstUpper);
        if(word.equals(allUpper) || word.equals(allLower) || word.equals(firstUpper))
            return true;
        else
            return false;
    }
}