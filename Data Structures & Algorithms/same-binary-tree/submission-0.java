/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }

        if(p==null || q==null){
            return false;
        }

        if(p.val != q.val){
            return false;
        }

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);

        // List<String> list1 = new ArrayList<>();
        // List<String> list2 = new ArrayList<>();
        // Queue<TreeNode> queue = new LinkedList<>();

        // queue.add(p);
        // while(!queue.isEmpty()){
        //     int size = queue.size();
        //     for(int i=0;i<size;i++){
        //         TreeNode ele = queue.poll();
        //         list1.add(String.valueOf(ele.val));
        //         if(ele.left != null){
        //             queue.offer(ele.left);
        //         }else{
        //             list1.add("Lnull");
        //         }
        //         if(ele.right != null){
        //             queue.offer(ele.right);
        //         }else{
        //             list1.add("Rnull");

        //         }
        //     }
        // }

        // queue.add(q);

        // while(!queue.isEmpty()){
        //     int size = queue.size();
        //     for(int i=0;i<size;i++){
        //         TreeNode ele = queue.poll();
        //         list2.add(String.valueOf(ele.val));

        //         if(ele.left != null){
        //             queue.offer(ele.left);
        //         }else{
        //             list2.add("Lnull");
        //         }
        //         if(ele.right != null){
        //             queue.offer(ele.right);
        //         }else{
        //             list2.add("Rnull");

        //         }
        //     }
        // }

        // if(list1.size() != list2.size()){
        //     return false;
        // }

        // for(int i=0;i<list1.size();i++){
        //     if(!list1.get(i).equals(list2.get(i))){
        //         return false;
        //     }
        // }

        // return true;

    }
}