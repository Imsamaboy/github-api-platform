# Intervals

+ [Non-overlapping Intervals](#non-overlapping-intervals)

[MDLink]: <>

## Non-overlapping Intervals

https://leetcode.com/problems/non-overlapping-intervals/

```java
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length < 2) return 0;
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        int count = 0;
        int last_included = 0;
        for (int index = 1; index < intervals.length; index++) {
            if (intervals[index][0] < intervals[last_included][1]) {
                count++;
                if (intervals[index][1] < intervals[last_included][1]) last_included = index;
            } else {
                last_included = index;
            }
        }
        return count;
    }
}
```

[Solution]: <>