class Solution {
    public int possibleStringCount(String word) {
        char ch=word.charAt(0);
        int count=0;
        for(char c:word.toCharArray())
        {
            if(c==ch)
            {
                count++;
            }
            ch=c;

        }
        return count;
    }
}