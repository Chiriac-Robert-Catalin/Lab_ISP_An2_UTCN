package isp.lab3;

import isp.lab3.exercise1.Tree;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreeTest {
    Tree copactest = new Tree();
    @Test
    public void testTreeGrow() {
        assertEquals("Should add 5 meters to tree height", 20, copactest.grow(5));
    }
    @Test
    public void testToString(){
        assertEquals("These 2 strings should be the same","Height is "+copactest.height,copactest.toString());
    }

}
