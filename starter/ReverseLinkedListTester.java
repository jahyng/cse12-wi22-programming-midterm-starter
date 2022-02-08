/**
 * Tests to check the implementation of reverseRegion method in MyArrayList.java
*/

//other import statements


import org.junit.*;
import static org.junit.Assert.*;

//IMPORTANT: DO NOT MODIFY THE TEST HEADERS!
/**
 * This class contains various test cases to test the reverseRegion method
 */
public class ReverseLinkedListTester {

    MyLinkedList testArrayLen5, testArrayEmpty, testArrayLen6;
    boolean exceptionThrown;
    /**
     * Run before every test
     */
    @Before
    public void setUp(){
        String[] StringList = {"zero","one","two","three","four"};
        Integer[] intList = {0,1,2,3,4,5};

        testArrayLen5 = new MyLinkedList<>(StringList);
        testArrayLen6 = new MyLinkedList<>(intList);
        testArrayEmpty = new MyLinkedList<>(null);

        exceptionThrown = false;
    }


    /**
     * Tests reverseRegion method when either fromIndex or toIndex
     * or both are out of bounds.
     */
    @Test
    public void testReverseIndexOutOfBounds(){
        // odd arrayList toIndex out of bounds
        try {
            testArrayLen5.reverseRegion(2, 9);
        }
        catch (IndexOutOfBoundsException e) {
            exceptionThrown = true;
        }
        assertTrue("Odd list test 1should throw excpetion", exceptionThrown);
        
        // odd arrayLIst fromIndex out of bounds
        try {
            testArrayLen5.reverseRegion(7, 3);
        }
        catch (IndexOutOfBoundsException e) {
            exceptionThrown = true;
        }  
        assertTrue("Odd list test 2 should throw  exception", exceptionThrown);

        // odd arrayList both index out of bounds
        try {
            testArrayLen5.reverseRegion(7, 9);
        }
        catch (IndexOutOfBoundsException e) {
            exceptionThrown = true;
        }
        assertTrue("Odd list test 3should throw exception", exceptionThrown);

        // even arrayList toIndex out of bounds
        try {
           testArrayLen6.reverseRegion(2, 9);
        }
        catch (IndexOutOfBoundsException e) {
            exceptionThrown = true;
        }
        assertTrue("Even list test 1 should throw excpetion", exceptionThrown);

        // even arrayList fromIndex out of bounds
        try {
            testArrayLen6.reverseRegion(7, 3);
        }
        catch (IndexOutOfBoundsException e) {
            exceptionThrown = true;
        }
        assertTrue("Even list test 2 should throw excpetion", exceptionThrown);
            
        // even arrayList both index out of bounds
        try{
            testArrayLen6.reverseRegion(7, 9);
        }
        catch (IndexOutOfBoundsException e) {
            exceptionThrown = true;
        }
        assertTrue("Even list test 3 should throw excpetion", exceptionThrown);

        // empty list test
        try {
            testArrayEmpty.reverseRegion(0, 1);
        }
        catch (IndexOutOfBoundsException e) {
            exceptionThrown = true;
        }
        assertTrue("Empty list test should throw excpetion", exceptionThrown);

    }

    /**
     * Tests reverseRegion method when
     * fromIndex > toIndex
     */
    @Test
    public void testReverseFromIndexGreater(){
        // tests arrayList
        testArrayLen5.reverseRegion(3,2);
        assertEquals("Index 0 is changed!","zero", testArrayLen5.get(0));
        assertEquals("Index 1 is changed!","one", testArrayLen5.get(1));
        assertEquals("Index 2 is changed!","two", testArrayLen5.get(2));
        assertEquals("Index 3 is changed!","three", testArrayLen5.get(3));
        assertEquals("Index 4 is changed!","four", testArrayLen5.get(4));
        assertEquals(5, testArrayLen5.size());





    }

    /**
     * Tests reverseRegion method when
     * fromIndex and toIndex are within bounds
    */
    @Test
    public void testReverseIndexWithinBounds(){
        // test odd arrayList
        testArrayLen5.reverseRegion(1, 4);
        // for (int i = 0; i < testArrayLen5.size(); i++) {
        //     System.out.println(testArrayLen5.get(i));
        // }
        assertEquals("zero", testArrayLen5.get(0));
        assertEquals("four", testArrayLen5.get(1));
        assertEquals("three", testArrayLen5.get(2));  
        assertEquals("two", testArrayLen5.get(3));
        assertEquals("one", testArrayLen5.get(4));

        // test even arrayList
        testArrayLen6.reverseRegion(0, 4);
        assertEquals(4, testArrayLen6.get(0));
        assertEquals(3, testArrayLen6.get(1));
        assertEquals(2, testArrayLen6.get(2));
        assertEquals(1, testArrayLen6.get(3));
        assertEquals(0, testArrayLen6.get(4));
        assertEquals(5, testArrayLen6.get(5));
    }

    /**
     * Custom test
    */
    @Test
    public void testReverseCustom(){
        assertEquals(0, testArrayEmpty.size());
    }


}

