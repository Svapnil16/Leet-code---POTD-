class Solution {
    public int firstUniqChar(String s) {

        A : for ( int i = 0 ; i < s.length() ; i++)
        {
            for ( int j = 0 ; j < s.length() ; j++)
            {
                if ( i != j && s.charAt(i) == s.charAt(j) )
                {
                    continue A;
                }
            }
            return i;       
        }
        return -1;
    }
}
