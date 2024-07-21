public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8,9};
        int target=2;
        int ans=searchNumber(arr,target);
        if(ans==target){
            System.out.println("the target element is found in array :- "+ans);
        }else{
            System.out.println("the target element is not found in array :- "+ans);
        }
    }

    static int searchNumber(int[] arr ,int target){
    int low= 0;
    int high= arr.length-1;

    while(low<=high){
        int mid=(low+high)/2;
        if(target>arr[mid]){
            low=mid+1;
        }
        else if(target<arr[mid]){
            high=mid-1;
        } else {
            return mid;
        }
    }
    return -1;
    }
}
