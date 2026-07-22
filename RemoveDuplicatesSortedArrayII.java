class RemoveDuplicatesSortedArrayII {

    public int removeDuplicates(int[] nums) {

        int numsLen = nums.length;

        if (numsLen == 1)
        return 1;

        int readPtr = 0, writePtr = 0, cnt = 0;

        while (readPtr < numsLen) {

            if (readPtr == 0 || (nums[readPtr] != nums[readPtr - 1])) {
                cnt = 1;
            } else {
                cnt++;
            }

            if (cnt <= 2) {
                nums[writePtr] = nums[readPtr];
                writePtr++;
            }
            readPtr++;
        }

        return writePtr;    
    }
}
