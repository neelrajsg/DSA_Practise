class Solution {
    // Rename this method to match what Main.java is calling
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            if (!seen.add(num)) {
                return true;
            }
        }
        
        return false;
    }
}