//两个(具有不同单词的)文档的交集(intersection)中元素的个数除以并集(union)中元素的个数，就是这两个文档的相似度。例如，{1, 5, 3}
// 和 {1, 7, 2, 3} 的相似度是 0.4，其中，交集的元素有 2 个，并集的元素有 5 个。给定一系列的长篇文档，每个文档元素各不相同，并与一个 
//ID 相关联。它们的相似度非常“稀疏”，也就是说任选 2 个文档，相似度都很接近 0。请设计一个算法返回每对文档的 ID 及其相似度。只需输出相似度大于 0 的组合
//。请忽略空文档。为简单起见，可以假定每个文档由一个含有不同整数的数组表示。 
//
// 输入为一个二维数组 docs，docs[i] 表示 id 为 i 的文档。返回一个数组，其中每个元素是一个字符串，代表每对相似度大于 0 的文档，其格式为
// {id1},{id2}: {similarity}，其中 id1 为两个文档中较小的 id，similarity 为相似度，精确到小数点后 4 位。以任意顺序
//返回数组均可。 
//
// 示例: 
//
// 输入: 
//[
//  [14, 15, 100, 9, 3],
//  [32, 1, 9, 3, 5],
//  [15, 29, 2, 6, 8, 7],
//  [7, 10]
//]
//输出:
//[
//  "0,1: 0.2500",
//  "0,2: 0.1000",
//  "2,3: 0.1429"
//] 
//
// 提示： 
//
// 
// docs.length <= 500 
// docs[i].length <= 500 
// 
//
// Related Topics 数组 哈希表 排序 👍 47 👎 0


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> computeSimilarities(int[][] docs) {
        List<Set<Integer>> setList = new ArrayList<>();
        for (int[] doc : docs) {
            Set<Integer> set = new HashSet<>();
            for (int i : doc) {
                set.add(i);
            }
            setList.add(set);
        }
        int setListSize = setList.size();
        List<String> res = new ArrayList<>();

        // 超时
        for (int i = 0; i < setListSize; i++) {
            Set<Integer> set1 = setList.get(i);
            for (int j = i + 1; j < setListSize; j++) {
                Set<Integer> set2 = setList.get(j);
                Set<Integer> jiao = new HashSet<>(set1);
                jiao.retainAll(set2);
                Set<Integer> bing = new HashSet<>(set1);
                bing.addAll(set2);
                double similarity = (double) jiao.size() / bing.size();
                if (similarity > 1e-6) {
                    res.add(String.format("%d,%d: %.4f", i, j, similarity));
                }
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
