package src.ss12_map_tree.thuc_hanh.test;

public class tao_node {
    class TreeNode<E> {
        protected E element;
        protected TreeNode<E> left;
        protected TreeNode<E> right;
        public TreeNode(E e) {
            element = e;
        }
    }

    TreeNode<Integer> root ;

    public tao_node() {
        root = new TreeNode<>(60)  ;
        root.left = new TreeNode<>(55);
        root.right = new TreeNode<>(100);
    }

    public static void main(String[] args) {
        tao_node tree = new tao_node();
        System.out.println("Root: " + tree.root.element);
        System.out.println("Left Child of Root: " + tree.root.left.element);
        System.out.println("Right Child of Root: " + tree.root.right.element);
    }


}
