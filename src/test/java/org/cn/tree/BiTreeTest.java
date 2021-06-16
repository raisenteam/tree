package org.cn.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BiTreeTest {

    @Test
    void testInsert() {
        var tree = new BiTree<Integer>();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        assertEquals(1, tree.get());
    }
}
