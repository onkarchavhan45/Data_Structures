public class FinfElementInInfiniteArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22};
        int target=14;
        System.out.println("hello");
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr,int target){
        //find the range
        //start with the box of size 2
        int start=0;
        int end =1;

        // condition runs unitill target element lies in the range
        while(target > arr[end]){
            int temp=end+1; // this wiil ganna be new start

            // increase the size of box by double
            // end = end +(end-start+1)*2;  // where (end-start+1) gives length of box or any array
            end =end+(end-start+1)*2;
            // new start
            start=temp;
        }
        return Binarysearch(arr,target,start,end);

    }

    static int Binarysearch(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid =start+(end-start)/2;
            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid +1;
            }else{
                return mid;
            }
        }
     return -1;
    }
}


