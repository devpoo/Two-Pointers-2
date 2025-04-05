package week3;

public class SearchIn2DMatrix {

    public boolean search(int[][] nums, int target) {
        int r = 0;
        int c = nums[0].length-1;

        int m = nums.length-1;
        int n = nums[0].length-1;

        while(r <= m && c >= 0) {
            if(nums[r][c] == target) {
                return true;
            } else if(target > nums[r][c]) {
                r++;
            } else {
                c--;
            }
        }
        return false;
    }
}
