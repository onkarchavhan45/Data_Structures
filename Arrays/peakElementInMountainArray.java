public class peakElementInMountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,4,2,0};
        System.out.println(peakIndexInMountainArray(arr));

    }

    static int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end =arr.length-1;

        while(start < end){
            int mid =start+(end-start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid +1;
            }
        }
      return start; // we can return start or end anyone from both as they are pointing to the same number.
    }
}