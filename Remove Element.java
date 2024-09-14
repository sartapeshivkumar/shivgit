
class  RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count = 0; // This will count the number of elements that are not equal to `val`.
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i]; // Place the non-val element at the current count index.
                count++; // Increment count to reflect the next position for non-val elements.
            }
        }
        
        return count; // Return the new length of the array after removal.
    }
}
