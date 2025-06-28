package org.example;

import org.junit.Test;
import  static org.junit.Assert.*;
public class AssertionTest{
    Assertions assertion=new Assertions();
    @Test
    public void testEquals(){
        assertEquals(7,assertion.sum(3,4));
    }
    @Test
    public void NotEquals() {
        assertNotEquals(9, assertion.sum(3, 4));
    }
    @Test
    public void TestTrue(){
        assertTrue(assertion.isGreater(8,7));
    }
    @Test
    public void TestFalse(){
        assertFalse(assertion.isLess(5,4));
    }
    @Test
    public void testNull(){
        assertNull(assertion.getNullObject());
    }
    @Test
    public void notNull(){
        assertNotNull(assertion.NotNullObject());
    }
    @Test
    public void sameReference(){
        String s1=assertion.getString();
        String s2=assertion.getString();
        assertSame(s1,s2);
    }
    @Test
    public void NotSameReference(){
        String s1=assertion.getString();
        String s2=assertion.newString("Test String");
        assertNotSame(s1,s2);
    }
    @Test
    public void testArray(){
        String[] s1={"A","B","C"};
        assertArrayEquals(s1, assertion.CharArray());
    }
    @Test
    public void testIntArray(){
        int[] arr={1,2,3};
        assertArrayEquals(arr,assertion.getArray());
    }
}
