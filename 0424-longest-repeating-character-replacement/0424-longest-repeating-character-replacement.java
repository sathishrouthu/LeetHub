class Solution {
    public int characterReplacement(String s, int k) {
        int ans = 1;
        int i = 0,j=0;
        int maxRepeated = 0;
        int[] freq = new int[26];
        while(j < s.length()){
            maxRepeated = Math.max(maxRepeated,++freq[s.charAt(j)-'A']);
            if( j-i+1 - maxRepeated > k){
                freq[s.charAt(i)-'A']--;
                i++;
            }
            j++;
        }
        return j-i;
    }
}

//  public int characterReplacement(String s, int k) {
//         int len = s.length();
//         int[] count = new int[26];
//         int start = 0, maxCount = 0, maxLength = 0;
//         for (int end = 0; end < len; end++) {
//             maxCount = Math.max(maxCount, ++count[s.charAt(end) - 'A']);
//             while (end - start + 1 - maxCount > k) {
//                 count[s.charAt(start) - 'A']--;
//                 start++;
//             }
//             maxLength = Math.max(maxLength, end - start + 1);
//         }
//         return maxLength;
//     }