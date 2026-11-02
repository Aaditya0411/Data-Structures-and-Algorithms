public class BuildBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        } else if (val > root.data) {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static void PreorderTravarsal(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        PreorderTravarsal(root.left);
        PreorderTravarsal(root.right);
    }

    public static void main(String[] args) {
        int[] values = {5, 3, 7, 2, 4, 6, 8};

        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        PreorderTravarsal(root);
    }
}