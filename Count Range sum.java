class Solution {
    public int countRangeSum(int[] nums, int lower, int upper) {
        long[] arr = new long[nums.length+1];
        for(int i=0;i<nums.length;i++){
            arr[i+1] = arr[i] + nums[i];
        }
        return mergeSortCnt(arr,0,arr.length-1,lower,upper);
    }
    private int mergeSortCnt(long[] arr,int left,int right,int lower,int upper){
        if(left>=right)return 0;
        int mid = left+(right-left)/2;
        int count = mergeSortCnt(arr,left,mid,lower,upper)+mergeSortCnt(arr,mid+1,right,lower,upper);
        int i=left,j1=mid+1,j2=mid+1;
        while(i<=mid){
            while(j1<=right && arr[j1] - arr[i] < lower)j1++;
            while(j2<=right && arr[j2] - arr[i] <=upper)j2++;
            count += (j2-j1);
            i++;
        }
        merge(arr,left,mid,right);
        return count;
    }
    private void merge(long[] arr,int left,int mid,int right){
        long[] temp = new long[right-left+1];
        int i = left,j = mid+1, k = 0;
        while(i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }
        while(i<=mid)temp[k++] = arr[i++];
        while(j<=right)temp[k++] = arr[j++];
        System.arraycopy(temp,0,arr,left,temp.length);
    }
}
