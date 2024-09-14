 class Solution {
    public static int removeDuplicates(int[] nums) {
        // Edge case: empty array
        if (nums.length == 0) return 0;

        int i = 0; // Initialize index for placement of valid elements

        // Iterate through the array
        for (int j = 0; j < nums.length; j++) {
            // Allow up to 2 occurrences of each element
            if (i < 2 || nums[j] != nums[i - 2]) {
                nums[i++] = nums[j]; // Place element and increment index
            }
        }

        return i; // Return the length of the modified array
    }

    public static void main(String[] args) {
        // Example test cases
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int length1 = removeDuplicates(nums1);
        System.out.println("New length: " + length1); // Output: 5
        System.out.println("Modified array: " + java.util.Arrays.toString(java.util.Arrays.copyOf(nums1, length1)));

        int[] nums2 = {1, 1, 2, 2, 2, 3, 3};
        int length2 = removeDuplicates(nums2);
        System.out.println("New length: " + length2); // Output: 5
        System.out.println("Modified array: " + java.util.Arrays.toString(java.util.Arrays.copyOf(nums2, length2)));

        int[] nums3 = {1, 2, 3, 4, 5};
        int length3 = removeDuplicates(nums3);
        System.out.println("New length: " + length3); // Output: 5
        System.out.println("Modified array: " + java.util.Arrays.toString(java.util.Arrays.copyOf(nums3, length3)));

        int[] nums4 = {1, 1, 1, 1, 1};
        int length4 = removeDuplicates(nums4);
        System.out.println("New length: " + length4); // Output: 2
        System.out.println("Modified array: " + java.util.Arrays.toString(java.util.Arrays.copyOf(nums4, length4)));
    }
}
