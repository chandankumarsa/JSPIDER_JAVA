package Nov26BinarySearchTree;
class BinarySearchTree {
    private Node root;
    private int count;
    private boolean flag;

    // Method to add a key to the BST
    public boolean add(int key) {
        flag = true;
        root = addNode(root, key);
        return flag;
    }

    // Recursive method to add a node
    private Node addNode(Node node, int key) {
        if (node == null) {
            node = new Node(key);
            count++;
            return node;
        }

        if (key < node.key) {
            node.left = addNode(node.left, key);
        } else if (key > node.key) {
            node.right = addNode(node.right, key);
        } else {
            // Key already exists in the tree
            flag = false;
        }
        return node;
    }

    // Node class for BST
    private static class Node {
        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
        }
    }

    // Main method (test the implementation)
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        System.out.println(bst.add(50)); // Output: true
        System.out.println(bst.add(30)); // Output: true
        System.out.println(bst.add(70)); // Output: true
        System.out.println(bst.add(30)); // Output: false (duplicate)
    }
}

