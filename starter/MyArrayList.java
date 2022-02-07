import java.util.function.ToIntBiFunction;

/**
 * TODO: Add your file header
 * Name: Josh Yang
 * ID: A16667394 
 * Email: jwyang@ucsd.edu
 * File description: 
 */

/**
 * This class has method reverse. It uses a default capacity variable and for 
 * the reverse method, it utilizes a temporary list refrence. 
 */
public class MyArrayList<E> implements MyReverseList<E> {
    static final int DEFAULT_CAPACITY = 5;
    
    Object[] data;
    int size;

    //IMPORTANT: DO NOT MODIFY THIS CONSTRUCTOR!
    //IMPORTANT: DO NOT ADD ANY MORE CONSTRUCTORS!

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
	 * This method pops out the region in a new list and flips the new list. 
     * Then it goes back in the original list by replacing the old region.
     * 
     * @param fromIndex gives the index from where the region begins
     * @param toIndex gives the index from where the region ends
	 */ 
    public void reverseRegion(int fromIndex, int toIndex){
        // check if index is in bounds first
        if (fromIndex > this.size || fromIndex < 0 || toIndex > this.size || 
            toIndex < 0) {
            throw new IndexOutOfBoundsException();
        }
        
        if (fromIndex < toIndex) {
            // get difference between from and to index
            int diff = toIndex - fromIndex + 1;
            
            // take out the region into new list
            Object[] region = new Object[diff];
            for (int i = 0; i < diff; i++) {
                region[i] = this.data[fromIndex + i];
                System.out.println(region[i]);
            }
            
            // reverse the region list
            for (int i = 0; i < diff / 2; i++) {
                Object temp = region[i];
                region[i] = region[diff - i - 1];
                region[diff - i - 1] = temp;
            }            
        
            

            // put in flipped region into list
            for (int i = 0; i < diff; i++) {
                this.data[fromIndex + i] = region[i];
            }
        }
    }

    @Override
    /**
     * A method that returns the number of valid elements
     * in the ArrayList 
     * @return - number of valid elements in the arraylist
     */
    public int size() {
        return this.size;
    }

    @Override
    /**
     * A method that returns an Element at the specified index
     * @param index - the index of the return Element
     * @return Element at specified index
     */
    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) data[index];
    }
}
