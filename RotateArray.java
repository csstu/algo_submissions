class Solution {

    private int[] invert(int[] nums, int start, int finish) {
        int size = finish - start + 1;
        int temp;

        if(size == 1 || size == 0)
            return nums;

        for(int i = 0; i < size/2; i++) {
            temp = nums[start + (size - i - 1)];
            nums[start + (size - i - 1)] = nums[start + i];
            nums[start + i] = temp;
        }
        return nums;
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        nums = invert(nums, nums.length - k, nums.length - 1);
        nums = invert(nums, 0, nums.length - k - 1);
        nums = invert(nums, 0, nums.length - 1);
        System.out.println(nums);
    }
}
