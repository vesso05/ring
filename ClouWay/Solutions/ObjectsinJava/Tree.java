// part of 2. Objects in Java

public class Tree {

    Node root;


    /**
     * Adds the elements to the tree
     * @param current
     * @param value
     * @return
     */
    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }


    /**
     * starts the recursion from the root node:
     * @param value
     */
    public void add(int value) {
        root = addRecursive(root, value);
    }


    /**
     *
     * @param node
     */
    public void printElements(Node node) {
        if (node != null) {
            printElements(node.left);
            System.out.print(" " + node.value);
            printElements(node.right);
        }
    }


    /**
     * Check if the tree contains value
     * @param current
     * @param value
     * @return
     */
    private boolean containsInNode(Node current, int value) {
        if (current == null) {
            return false;
        }

        if (value == current.value) {
            return true;
        }

        return value < current.value
                ? containsInNode(current.left, value)
                : containsInNode(current.right, value);
    }

    public static void main(String[] args) {



     //   Tree check = new Tree();

     //   check.add(3);
    //    check.add(7);
    //    check.add(9);
    //    check.add(4);
     //   check.add(3);



     //   check.printElements(check.root);


    }




}

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}





