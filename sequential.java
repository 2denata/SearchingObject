public class SearchingObject implements Comparable {

    private int identity;

    public SearchingObject() {}
    public SearchingObject(int identity) {this.identity = identity;}
    public int getIdentity() {return identity;}
    public void setIdentity(int identity) {this.identity = identity;}

    @Override
    public int compareTo(Object t) {
        // Compares this object with another object based on the identity value.
        // If the identity value of object t is equal to the identity value of this object, return 0.
        if (((SearchingObject) t).getIdentity() == identity) {
            return 0;
        } // If the identity value of object t is less than or equal to the identity value of this object, return 1.
        else if (((SearchingObject) t).getIdentity() <= identity) {
            return 1;
        }
        // If the identity value of object t is greater than the identity value of this object, return -1.
        return -1;
    }

    public static int sequentialSearch(Object[] o, Object key) {
        // Performs a sequential search on the array o.
        for (int i = 0; i < o.length; i++) {
            // Compares each element in the array o with the key object using the compareTo method.
            if (((Comparable) o[i]).compareTo(key) == 0) {
                // If a matching element is found, return the index of that element.
                return i;
            }
        }
        // If no matching element is found, return -1.
        return -1;
    }
}
