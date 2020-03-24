package problem_0945_MinimumIncrementToMakeArrayUnique;

import java.util.Arrays;

/*
 * 945. 使数组唯一的最小增量
 * 给定整数数组 A，每次 move 操作将会选择任意 A[i]，并将其递增 1。
 * 返回使 A 中的每个值都是唯一的最少操作次数。
 *
 * 示例 1:
 * 输入：[1,2,2]
 * 输出：1
 * 解释：经过一次 move 操作，数组将变为 [1, 2, 3]。
 *
 * 示例 2:
 * 输入：[3,2,1,2,1,7]
 * 输出：6
 * 解释：经过 6 次 move 操作，数组将变为 [3, 4, 1, 2, 5, 7]。
 * 可以看出 5 次或 5 次以下的 move 操作是不能让数组的每个值唯一的。
 *
 * 提示：
 * 0 <= A.length <= 40000
 * 0 <= A[i] < 40000
 */
public class MinimumIncrementToMakeArrayUnique {
    /*
     * 方法1：计数
     */
    public int minIncrementForUnique1(int[] A) {
        int[] count = new int[80000];
        for (int i : A) {
            count[i]++;
        }
        int res = 0;
        for (int num = 0; num < 80000; num++) {
            if (count[num] > 1) {
                res += count[num] - 1;
                count[num + 1] += count[num] - 1;
            }
        }
        return res;
    }

    /*
     * 方法2：排序
     */
    public int minIncrementForUnique2(int[] A) {
        Arrays.sort(A);
        int res = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] >= A[i]) {
                res += A[i - 1] + 1 - A[i];
                A[i] = A[i - 1] + 1;
            }
        }
        return res;
    }
}
