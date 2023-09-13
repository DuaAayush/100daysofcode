class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}

public class BinaryTreeTraversal {

    // Inorder Traversal (Left, Root, Right)
    public void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }
    }

    // Preorder Traversal (Root, Left, Right)
    public void preorderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    // Postorder Traversal (Left, Right, Root)
    public void postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.val + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTreeTraversal treeTraversal = new BinaryTreeTraversal();
        TreeNode root = new TreeNode(
