//现在你总共有 numCourses 门课需要选，记为 0 到 numCourses - 1。给你一个数组 prerequisites ，其中 
//prerequisites[i] = [ai, bi] ，表示在选修课程 ai 前 必须 先选修 bi 。 
//
// 
// 例如，想要学习课程 0 ，你需要先完成课程 1 ，我们用一个匹配来表示：[0,1] 。 
// 
//
// 返回你为了学完所有课程所安排的学习顺序。可能会有多个正确的顺序，你只要返回 任意一种 就可以了。如果不可能完成所有课程，返回 一个空数组 。 
//
// 
//
// 示例 1： 
//
// 
//输入：numCourses = 2, prerequisites = [[1,0]]
//输出：[0,1]
//解释：总共有 2 门课程。要学习课程 1，你需要先完成课程 0。因此，正确的课程顺序为 [0,1] 。
// 
//
// 示例 2： 
//
// 
//输入：numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]]
//输出：[0,2,1,3]
//解释：总共有 4 门课程。要学习课程 3，你应该先完成课程 1 和课程 2。并且课程 1 和课程 2 都应该排在课程 0 之后。
//因此，一个正确的课程顺序是 [0,1,2,3] 。另一个正确的排序是 [0,2,1,3] 。 
//
// 示例 3： 
//
// 
//输入：numCourses = 1, prerequisites = []
//输出：[0]
// 
//
// 
//提示：
//
// 
// 1 <= numCourses <= 2000 
// 0 <= prerequisites.length <= numCourses * (numCourses - 1) 
// prerequisites[i].length == 2 
// 0 <= ai, bi < numCourses 
// ai != bi 
// 所有[ai, bi] 互不相同 
// 
//
// Related Topics 深度优先搜索 广度优先搜索 图 拓扑排序 👍 843 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import java.util.LinkedList;

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // 待选课程
        LinkedList<Integer> waitCourses = new LinkedList<>();
        
        // 存储结果
        int[] res = new int[numCourses];
        int resIndex = 0;
        // ArrayList<Integer> res = new ArrayList<>();

        // 每个节点的入度
        int[] inDegree = new int[numCourses];
        
        // 邻接矩阵
        int[][] g = new int[numCourses][numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            // prerequisites[i][1] -> prerequisites[i][0]
            g[prerequisites[i][1]][prerequisites[i][0]] = 1;
        }

        // 找出入度为0的课程放入待选课程
        for (int col = 0; col < g[0].length; col++) {
            // int inDegree = 0;
            for (int row = 0; row < g.length; row++) {
                if (g[row][col] == 1) {
                    // inDegree++;
                    inDegree[col]++;
                }
            }
            if (inDegree[col] == 0) {
                waitCourses.add(col);
            }
        }

        // 还有候选课程
        while (!waitCourses.isEmpty()) {
            // 取出一个放到结果集中
            Integer c = waitCourses.pop();
            res[resIndex++] = c;
            // res.add(c);
            // 将c指向的课程的入度减1
            for (int i = 0; i < g[c].length; i++) {
                if (g[c][i] == 1) {
                    if (--inDegree[i] <= 0) {
                        waitCourses.add(i);
                    }
                }
            }
        }

        // return res.stream().mapToInt(Integer::intValue).toArray();
        // ！！！如果不可能完成所有课程，返回 一个空数组 。 
        return resIndex == numCourses ? res : new int[0];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
