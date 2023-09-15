package Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class BinaryTreeInOrder implements Iterable<Integer>{
    private ArrayList<Integer>values=new ArrayList<>();

    public BinaryTreeInOrder(Integer... values) {
        this.values.addAll(Arrays.asList(values));
    }

    public Integer get(int index){
        return values.get(index);
    }

    public int size(){
        return values.size();
    }

    public Iterator<Integer>iterator(){
        return new MyIterator7(this);
    }

    static class TreeNode {
        int data;
        BinaryTree.TreeNode left, right;

        public TreeNode(int key) {
            data = key;
            left = right = null;
        }

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
}
