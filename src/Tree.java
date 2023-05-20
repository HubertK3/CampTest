public class Tree {
    private Node root;

    public void add(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            root.add(value);
        }
    }

    public boolean contains(int value) {
        return root != null && root.contains(value);
    }

    public int max() {
        if (root == null) {
            throw new IllegalStateException("Drzewo jest puste");
        }
        return root.max();
    }

    public int min() {
        if (root == null) {
            throw new IllegalStateException("Drzewo jest puste");
        }
        return root.min();
    }
}

class Node {
    private int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
    }

    public void add(int value) {
        if (value < this.value) {
            if (left == null) {
                left = new Node(value);
            } else {
                left.add(value);
            }
        } else if (value > this.value) {
            if (right == null) {
                right = new Node(value);
            } else {
                right.add(value);
            }
        }
    }

    public boolean contains(int value) {
        if (value == this.value) {
            return true;
        } else if (value < this.value && left != null) {
            return left.contains(value);
        } else if (value > this.value && right != null) {
            return right.contains(value);
        }
        return false;
    }

    public int max() {
        return right != null ? right.max() : value;
    }

    public int min() {
        return left != null ? left.min() : value;
    }
}

