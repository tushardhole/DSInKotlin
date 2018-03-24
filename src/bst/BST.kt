package bst

class BST {

    var root: Node

    constructor(rootKey: Int) {
        this.root = Node(rootKey)
    }

    fun insertKey(key: Int) {
        var current: Node? = root
        var parent: Node?

        while (true) {
            parent = current;

            if (current != null) {
                if (key == current.value) {
                    return
                }
                if (key < current.value) {
                    current = current.left
                    if (current == null) {
                        parent?.left = Node(key)
                        return
                    }
                } else {
                    current = current.right
                    if (current == null) {
                        parent?.right = Node(key)
                        return
                    }
                }
            }
        }
    }

    fun insertKey2(key: Int) {
        root = insertRec(root, key);
    }

    private fun insertRec(parent: Node?, key: Int): Node {
        if (parent == null) {
            return Node(key)
        }
        if (key == parent.value) {
            return parent
        }
        if (key < parent.value) {
            parent.left = insertRec(parent.left, key)
        } else {
            parent.right = insertRec(parent.right, key)
        }
        return parent;
    }
}
