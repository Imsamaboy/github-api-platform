# Graph

+ [Number of Islands](#number-of-islands)

[MDLink]: <>

## Number of Islands

https://leetcode.com/problems/number-of-islands/

```java
class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[0].length; column++) {
                if (grid[row][column] == '1') {
                    dfs(grid, row, column);
                    count++;
                }
            }
        }
        return count;
    }
    private static void dfs(char[][] grid, int row, int column) {
        if (row != grid.length && column != grid[0].length && row != -1 && column != - 1 && grid[row][column] == '1') {
            grid[row][column] = '+';
            dfs(grid , row + 1, column);
            dfs(grid, row, column + 1);
            dfs(grid, row - 1, column);
            dfs(grid, row, column - 1);
        }
    }
}
```

[Solution]: <>