public class BST<Key extends Comparable<Key>, Value> {

    private TreeNode root;

    private class TreeNode {
        private Key key;
        private Value val;
        private TreeNode left, right;

        public TreeNode(Key key, Value val) {
            this.key = key;
            this.val = val;
        }
    }

    private Value get(Key key) {
        // Return value associated with key in the entire tree;
        // return null if key not present in subtree rooted at x.
        ???
    }

    private Value get(TreeNode x, Key key) {
        // Return value associated with key in the subtree rooted at x;
        // return null if key not present in subtree rooted at x.
        ???
    }

}