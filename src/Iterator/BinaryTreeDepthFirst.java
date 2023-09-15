package Iterator;

import java.util.*;

public class BinaryTreeDepthFirst implements Iterable<Integer> {
    private ArrayList<Integer> values=new ArrayList<>();

    public BinaryTreeDepthFirst(Integer... values) {
        this.values.addAll(Arrays.asList(values));
    }

    public Integer get(int index){
        return values.get(index);
    }

    public int size(){
        return values.size();
    }

    public Iterator<Integer> iterator(){
        return new MyIterator10(this);
    }

    static class TreeNode {
        int data;
        BinaryTree.TreeNode left, right;

        public TreeNode(int key) {
            data = key;
            left = right = null;
        }

    }

    static void preorder(BinaryTree.TreeNode TreeNode) {
        if (TreeNode == null)
            return;

        // Traverse root
        System.out.print(TreeNode.data + " ");
        // Traverse left
        preorder(TreeNode.left);
        // Traverse right
        preorder(TreeNode.right);
    }

    static void inorder(BinaryTree.TreeNode TreeNode) {
        if (TreeNode == null)
            return;

        // Traverse left
        inorder(TreeNode.left);
        // Traverse root
        System.out.print(TreeNode.data + " ");
        // Traverse right
        inorder(TreeNode.right);
    }

    static void postorder(BinaryTree.TreeNode TreeNode) {
        if (TreeNode == null)
            return;

        // Traverse left
        postorder(TreeNode.left);
        // Traverse right
        postorder(TreeNode.right);
        // Traverse root
        System.out.print(TreeNode.data + " ");
    }
    static void printLevelOrder(BinaryTree.TreeNode root) {
        Queue<BinaryTree.TreeNode> queue = new LinkedList<BinaryTree.TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTree.TreeNode tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            /*add left child to the queue */
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            /*add right right child to the queue */
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }
}
