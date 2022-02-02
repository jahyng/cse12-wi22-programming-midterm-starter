/**
 * TODO: Add your file header
 * Name:
 * ID:
 * Email:
 * File description: 
 */

/**
 * TODO: Add class header
 */
public class MyArrayList<E> implements MyReverseList<E> {
    static final int DEFAULT_CAPACITY = 5;
    static final String ILLEGAL_CAPACITY_FMT = "Illegal Capacity: %d";
    
    Object[] data;
    int size;

    /**
     * Constructor to create an empty array list
     */
    public MyArrayList() {
        data = new Object[DEFAULT_CAPACITY]; 
    }

    /**
     * Constructor to create an empty array list with a given capacity
     * @param initialCapacity - given arraylist capacity
     */
    public MyArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new 
            IllegalArgumentException(String.format(ILLEGAL_CAPACITY_FMT
                , initialCapacity));
        }
        data = new Object[initialCapacity];
    }

    /**
     * Constructor to create an array list with the given array's elements
     * @param arr - array of elements to be used to construct the ArrayList
     */
    public MyArrayList(E[] arr) {
        if (arr == null) {
            this.data = new Object[DEFAULT_CAPACITY];
        } else {
            this.data = arr.clone();
            this.size = arr.length;
        }
    }

    /**
	 * TODO: Method header comment here
	 */
    public void reverseRegion(int fromIndex, int toIndex){
       /**
        * TODO: Add your solution here
        */
    }

    /**
     * A method that returns the number of valid elements
     * in the ArrayList 
     * @return - number of valid elements in the arraylist
     */
    public int size() {
        return this.size;
    }


}
