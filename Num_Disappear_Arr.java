class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        HashSet<Integer> numberSet = new HashSet<>();
        ArrayList<Integer> missingNumbers = new ArrayList<>();

        //first add the values from the array to the hashset to use the contains method
        for (int i = 0; i < nums.length; i++) {
            numberSet.add(nums[i]);
        }

        //define n because we were given the range
        int n = nums.length;

        //iterate through to look for the missing numbers
        for (int i = 1; i <= n; i++) {

            //if the Set does NOT contain an element, that means that there is a missing number
            if (!numberSet.contains(i)) {
                //add the missing number to an ArrayList to return later to show the missing numbers
                missingNumbers.add(i);
            }
        }

        return missingNumbers;
    }
}