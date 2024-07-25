import java.util.HashSet;
import java.util.Set;

public class containDuplicates {
    class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> unique= new HashSet<>();
        for(int i=0; i<nums.length;i++){
            if(unique.contains(nums[i])){
                return true;
            }
            unique.add(nums[i]);
        }
        return false;
    }
}

}
