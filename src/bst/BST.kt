package bst

class BST {

    var root: Node

    constructor(rootKey: Int) {
        this.root = Node(rootKey)
    }

    fun insertKey(key: Int) {
        var current: Node? = root
        var parent: Node?;

        while (true) {
            parent = current;
            if (current != null && key < current.value as Int) {
                current = current.left;
                if (current == null) {
                    parent?.left = Node(key);
                    return;
                }
            } else {
                current = current?.right;
                if (current == null) {
                    parent?.right = Node(key);
                    return;
                }
            }
        }
    }
}
