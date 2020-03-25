package problem_0892_SurfaceAreaOf3DShapes;

/*
 * 892. 三维形体的表面积
 * 在 N * N 的网格上，我们放置一些 1 * 1 * 1 的立方体。
 * 每个值 v = grid[i][j] 表示 v 个正方体叠放在对应单元格 (i, j) 上。
 * 请你返回最终形体的表面积。
 *
 * 示例 1：
 * 输入：[[2]]
 * 输出：10
 *
 * 示例 2：
 * 输入：[[1,2],[3,4]]
 * 输出：34
 *
 * 示例 3：
 * 输入：[[1,0],[0,2]]
 * 输出：16
 *
 * 示例 4：
 * 输入：[[1,1,1],[1,0,1],[1,1,1]]
 * 输出：32
 *
 * 示例 5：
 * 输入：[[2,2,2],[2,1,2],[2,2,2]]
 * 输出：46
 *
 * 提示：
 * 1 <= N <= 50
 * 0 <= grid[i][j] <= 50
 */
public class SurfaceAreaOf3DShapes {
    public int surfaceArea(int[][] grid) {
        int[][] direction = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        int surfaceArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] > 0) {
                    surfaceArea += 2;
                    for (int[] dir : direction) {
                        int x = i + dir[0];
                        int y = j + dir[1];
                        if (x < 0 || x >= grid.length || y < 0 || y >= grid[i].length) {
                            surfaceArea += grid[i][j];
                        } else {
                            surfaceArea += Math.max(grid[i][j] - grid[x][y], 0);
                        }
                    }
                }
            }
        }
        return surfaceArea;
    }
}
