package org.cn.tree;

public class BiTree<K extends Comparable<K>> {
    Node<K> root;

    public void insert(K key) {
        if(root == null) {
            root = new Node<>(key);
            return;
        }

        var node = root;
        while(node != null) {
            node = addOrStepDown(node, key);
        }
    }

    private Node<K> addOrStepDown(Node<K> parent, K childKey) {
        Node<K> stepDownNode = null;
        int compareResult = childKey.compareTo(parent.key);
        if(compareResult > 0) {
            if(parent.right() == null) {
                parent.setRight(new Node<>(childKey));
            } else {
                stepDownNode = parent.right();
            }
        }
        if(compareResult < 0) {
            if(parent.left() == null) {
                parent.setLeft(new Node<>(childKey));
            } else {
                stepDownNode = parent.left();
            }
        }
        // if compareResult == 0 then nothing to do

        return stepDownNode;
    }

    public K get() {
        return root == null ? null : root.key;
    }


}
