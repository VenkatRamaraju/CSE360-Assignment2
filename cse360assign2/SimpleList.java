/**
 *
 * @author - Venkat Ramaraju
 * Class ID: 247
 * CSE 360 - Assignment 1
 *
 * SimpleList is represents an array of maximum size 10, with functionality to add,
 * remove, search and display the contents of the list dynamically.
 */

package cse360assign2; // package to organize the classes

public class SimpleList {

    /**
     * The array to store all the elements
     */

    private int[] list;

    /**
     * The number of elements in the array
     */

    private int count;

    /**
     * The constructor of this class initializes the list to an array of length 10,
     * and sets the initial element count to zero.
     *
     */


    public SimpleList() {

        // Initializes list and count

        list = new int[10];
        count = 0;
    }

    /**
     * The add method places the parameter integer at the beginning of the list
     * and shifts every subsequent element right by one. If the size of the array
     * is already 10, it will push the last element out.
     *
     * @param n integer value to be added at the first index of the list
     */

    public void add(int n) {

        if (count < 10) {
            count++; // One element is being added to the list
        }

            for (int index = count-1; index > 0; index--) {
                list[index] = list[index-1]; // Shifting element positions right
            }

            list[0] = n;
    }

    /**
     * The remove method will search fo the parameter in the list, and will remove it. It shifts
     * all the subsequent instances left by one, and adjusts the count accordingly.
     *
     * @param n element to be searched for and removed from the list
     */

    public void remove(int n) {
        // Finds element in list, removes it, and shifts rest of list left by one

        boolean found = false; // only removing first instance

        for (int index = 0; index < count && !found; index++) {
            if (list[index] == n) { // Searching for element
                found = true;

                for (int shift = index+1; shift < count; shift++) {
                    list[shift-1] = list[shift]; // Shifting remaining elements left
                }

                count--; // One element lost from the list
            }
        }
    }

    /**
     * The count method will return the total number of elements currently in the list.
     *
     * @return number of elements in the SimpleList
     */

    public int count() {
        return count; // Returns total number of elements in the list
    }

    /**
     * The toString method will return the list of elements separated by spaces, with no
     * trailing space
     *
     * @return String of elements spaced
     */

    public String toString() {

        // Returns the list elements separated by a space

        String result = ""; // Stores the result


        for (int index = 0; index < count; index++) {
            if (index == count-1) {
                result += list[index]; // No trailing space
            } else {
                result += list[index] + " ";
            }
        }

        return result; // Returns the constructed string
    }

    /**
     * The search method will search for the parameter in the list and return the first
     * index where it is found, -1 if it is not found.
     *
     * @param n the element to be searched for in the list
     * @return index where the element in found, -1 if not found.
     */

    public int search(int n) {

        boolean found = false; // to only search for first instance

        int index = -1; // to store index if found, -1 if not found

        for (int searchIndex = 0; searchIndex < count && !found; searchIndex++) {
            if (list[searchIndex] == n) {
                index = searchIndex;
                found = true; // we only want the first instance
            }
        }

        return index;
    }
}
