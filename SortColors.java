class SortColors {
    
    public void sortColors(int[] nums) {

            int numsLen = nums.length;

            if (numsLen == 1)
            return;

            int mid = 0, low = 0 , high = numsLen - 1;

            while (mid <= high) {
                if (nums[mid] == 0) {
                    swap (low, mid, nums);
                    mid++;
                    low++;
                } else if (nums[mid] == 1) {
                    mid++;
                } else {
                    swap(high, mid, nums);
                    high--;
                }
            }    
    }

    private void swap (int lowOrHigh, int mid, int[] nums) {
        int temp = nums[mid];
        nums[mid] = nums[lowOrHigh];
        nums[lowOrHigh] = temp;
    }
}
