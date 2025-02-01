// Search Insert Position (35)

class Solution {
    public int searchInsert(int[] nums, int t) {
        int l=nums.length;
        int s=0;
        int e=l-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(nums[mid]==t) return mid;
            else if(nums[mid]>t) e=mid-1;
            else s=mid+1;
        }
        return e+1;
    }
}
