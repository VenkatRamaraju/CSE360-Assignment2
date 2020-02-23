/**
 *
 * @author - Venkat Ramaraju
 * Class ID: 247
 * CSE 360 - Assignment 1
 *
 * SimpleListTest is a JUnit file that performs tests on every method that is
 * implemented in the SimpleTest.java file
 */

package cse360assign2; // package to organize the classes
import static org.junit.jupiter.api.Assertions.*; // Importing necessary libraries

class SimpleListTest {

    /**
     * The SimpleList1 method tests whether the constructor correctly initializes the
     * list with a zero count.
     */

    @org.junit.jupiter.api.Test
    void SimpleList1() {

        // Testing for success case

        SimpleList list = new SimpleList();
        assertTrue(0 == list.count());
    }

    /**
     * The SimpleList2 method tests that the add method fails to assert "true" for an incorrect input
     */

    @org.junit.jupiter.api.Test
    void SimpleList2() {

        // Testing for failure case

        SimpleList list = new SimpleList(); // Creating a simple list with elements to test method

        assertFalse(1 == list.count()); // Should be zero, based on initialization specifications
    }

    /**
     * The add1 method tests that 11 elements have been placed in the correct
     * order in the list, and that the list size increases by 50% when the original
     * limit is reached.
     */

    @org.junit.jupiter.api.Test
    void add1() {

        // Testing for success case

        SimpleList list = new SimpleList(); // Creating a simple list with elements to test method
        list.add(10);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0); // Size increases by 50%, from 10 to 15.

        String successCase = "0 1 2 3 4 5 6 7 8 9 10";
        successCase.equals(list.toString());

    }

    /**
     * The add2 method tests that the add method fails to assert "true" for an incorrect input
     */

    @org.junit.jupiter.api.Test
    void add2() {

        // Testing for failure case

        SimpleList list = new SimpleList(); // Creating a simple list with elements to test method
        list.add(10);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(100); // This should push 10 out of the array at the end

        String failCase = "1 2 3 4 5 6 7 8 9 10"; // To ensure that 100 gets placed correctly
        assertFalse(failCase.equals(list.toString())); // Ensure that 10 gets pushed out
    }

    /**
     * The remove1 method tests that the first instance of an element has been correctly removed from
     * the array, and the list size shrinks if 25% of the list is free.
     */

    @org.junit.jupiter.api.Test
    void remove1() {

        // Testing for success case

        SimpleList list = new SimpleList(); // Creating a simple list with elements to test method
        list.add(10);
        list.add(9);
        list.add(5);
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0); // Currently length 15, count 12

        list.remove(5); // Removing an element and observing the size shrink by 25%

        String successCase = "0 1 2 3 4 6 7 8 5 9 10"; // Size shrinks, length 11 and count 11
        assertTrue(successCase.equals(list.toString()));


    }

    /** The remove2 method checks that if the searched element is not found, the list
     * will remain as it initially was
     */

    @org.junit.jupiter.api.Test
    void remove2() {

        // Testing for success case

        SimpleList list = new SimpleList(); // Creating a simple list with elements to test method
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        list.remove(6); // To check if only the first instance of 5 is removed

        String successCase = "1 2 3 4 5";
        assertTrue(successCase.equals(list.toString()));
    }


    /**
     * The remove3 method tests that the remove method only removes the first instance of a number, and
     * does not assert true for an incorrect outputs
     */

    @org.junit.jupiter.api.Test
    void remove3() {
        // Testing for failure case

        SimpleList list = new SimpleList(); // Creating a simple list with elements to test method
        list.add(10);
        list.add(9);
        list.add(5); // to check only first instance gets removed
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(100);
        list.remove(5);


        String failureCase = "100 1 2 3 4 6 7 9"; // would be true if both instances got removed
        assertFalse(failureCase.equals(list.toString()));
    }

    /**
     * The count1 method tests that the count instance variable is equal to the number of elements
     * in the list
     */

    @org.junit.jupiter.api.Test
    void count1() {

        // Testing for success case

        SimpleList list = new SimpleList(); // Creating a simple list with elements to test method
        list.add(5);
        list.add(4);
        list.add(3);
        list.remove(3);
        list.remove(4);

        // Adding 3 elements and removing 2 elements should return 1 as the count

        assertTrue(1 == list.count());
    }

    @org.junit.jupiter.api.Test

    /**
     * The count2 method tests that the count is updated with every add and removal, and
     * does not assert true for incorrect outputs
     */

    void count2() {
        // Testing for failure case

        SimpleList list = new SimpleList(); // Creating a simple list with elements to test method
        list.add(5);
        list.add(4);
        list.add(3);
        list.remove(3);
        list.remove(4);

        int count = 5; // wrong output to test failed case
        assertFalse(count == list.count());
    }

    /**
     * The toString1 method tests that a spaced list of elements (with no trailing space
     * for the last element) is returned by the toString method in the SimpleList class
     */

    @org.junit.jupiter.api.Test
    void toString1() {

        // Testing for success case

        SimpleList list = new SimpleList(); // Creating a simple list with elements to test method
        list.add(10);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        String successCase = "1 2 3 4 5 6 7 8 9 10"; // prints the correct order with no trailing space
        assertTrue(successCase.equals(list.toString()));
    }

    /**
     * The toString2 method tests that the toString method prints the elements in the correct
     * order and format, and also ensures that the method does not assert true for an incorrect output
     */

    @org.junit.jupiter.api.Test
    void toString2() {
        // Testing for failure case

        SimpleList newList = new SimpleList(); // Creating a simple list with elements to test method
        newList.add(10);
        newList.add(9);
        newList.add(8);
        newList.add(7);
        newList.add(6);


        String failCase = "6 7 8 9 10 "; // wrong output (space after last element) to test failed case
        assertFalse(failCase.equals(newList.toString()));
    }

    /**
     * The search1 method tests whether the correct index is returned for an element
     * that is searched in the array
     */

    @org.junit.jupiter.api.Test
    void search1() {

        // Testing for success case

        SimpleList list = new SimpleList(); // Creating a simple list with elements to test method
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        assertTrue(2 == list.search(3)); // checking if 3 is found at the second index
    }

    /**
     * The search2 method tests that the search returns -1 if the element that is being searched
     * in the array is not found
     */

    @org.junit.jupiter.api.Test
    void search2() {
        // Testing for success case

        SimpleList list = new SimpleList(); // Creating a simple list with elements to test method
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        assertTrue(-1 == list.search(6)); // checking if -1 is found when not found in list
    }

    /**
     * The search3 method tests whether only the index of the first instance of the searched
     * element is returned
     */

    @org.junit.jupiter.api.Test
    void search3() {
        // Testing for success case

        SimpleList list = new SimpleList(); // Creating a simple list with elements to test method
        list.add(5);
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(1);

        assertTrue(2 == list.search(5)); // To check only first instance is returned
    }

    /**
     * The search4 method tests that the search method searches indices correctly and
     * does not assert true for an incorrect output
     */

    @org.junit.jupiter.api.Test
    void search4() {

        // Testing for failure case

        SimpleList newList = new SimpleList(); // Creating a simple list with elements to test method
        newList.add(10);
        newList.add(9);
        newList.add(8);
        newList.add(7);
        newList.add(6);

        // wrong output to test failed case

        assertFalse(1 == newList.search(8)); // should be found at index 2, not 1
    }

}