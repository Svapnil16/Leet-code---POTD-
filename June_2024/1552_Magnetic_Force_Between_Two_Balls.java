Input: position = [1,2,3,4,7], m = 3
Output: 3
Explanation: Distributing the 3 balls into baskets 1, 4 and 7 will make the magnetic force between ball pairs [3, 3, 6]. The minimum magnetic force is 3. We cannot achieve a larger minimum magnetic force than 3.
Example 2:

Input: position = [5,4,3,2,1,1000000000], m = 2
Output: 999999999
Explanation: We can use baskets 1 and 1000000000.
 

Constraints:

n == position.length
2 <= n <= 105
1 <= position[i] <= 109
All integers in position are distinct.
2 <= m <= position.length
Solutions
JAVA
C++
PYTHON
GO
JAVASCRIPT
class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int left = 1, right = position[position.length - 1];
        while (left < right) {
            int mid = (left + right + 1) >>> 1;
            if (check(position, mid, m)) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    private boolean check(int[] position, int f, int m) {
        int prev = position[0];
        int cnt = 1;
        for (int i = 1; i < position.length; ++i) {
            int curr = position[i];
            if (curr - prev >= f) {
                prev = curr;
                ++cnt;
            }
        }
        return cnt >= m;
    }
}
