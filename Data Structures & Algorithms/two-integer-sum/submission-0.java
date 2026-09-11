class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] newArr = new int[]{0,0};

        for (int i = 0; i < nums.length-1; i++){
            for (int j = i + 1; j < nums.length; j++ ){
                if (nums[i] + nums [j] == target){
                    newArr[0] = i;
                    newArr[1] = j;
                }
            }
    }
    return newArr;
    }
}

//int [3, 4, 5, 6] | target = 7
//     i
//        j
//int[0] & int[1]