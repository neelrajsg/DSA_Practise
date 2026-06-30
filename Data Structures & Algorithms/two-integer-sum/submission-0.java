class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int t=target;
        int i;
        int j;
    //  ArrayList<Integer> fi = new ArrayList<>();
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++){

                if(nums[i]+nums[j]==t && i!=j){
                       return new int[] {j,i}; 
                }

            }
        }
        return new int[]{}; 
    }
}
