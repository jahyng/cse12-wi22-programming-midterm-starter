/**
 * This file contains the MyReverseList interface
 * that defines the methods to be implemented 
 * by MyArrayList and MyLinkedList classes. 
 */

/**
 * An interface that contains the methods used to 
 * reverse a given region in a list.
 */
public interface MyReverseList<E> {

    /* Get the number of elements in the list */
    int size();

    /* Reverses the given region in a list*/
    void reverseRegion(int fromIndex, int toIndex);

    /* Gets an element at specified index */
    E get(int index);

}