
class linearSearch{
    public static void main(String[] args) {
       
    int [] arr={4,64,2,7,98,45};
    int target=7;
    int ans =linearSearchAlgo(arr,target);
    System.out.println(ans);

    }

    static int linearSearchAlgo(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            int element=arr[i];
            if(target == element){
                return i;
            }
        }
        return -1;
    }
}