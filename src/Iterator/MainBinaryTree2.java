package Iterator;

public class MainBinaryTree2 {
    public static void main(String[] args) {
        BinaryTree2 tree = new BinaryTree2(4, 2, 6, 1, 3, 5, 7);
        for (int value : tree) {
            System.out.print("[" + value + "]");
        }
    }
}
