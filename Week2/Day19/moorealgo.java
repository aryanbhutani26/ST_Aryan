package Week2.Day19;

public class moorealgo {
    static int moores( int [] nums){
        int count=0;
        int candidate=0;
        int current=0;
        for(int i=0; i<nums.length; i++){
            current =nums[i];
            if(count==0)
                candidate=nums[i];
            if(current==candidate)
                count++;
            else
                count--;
        }
        return candidate;
    }
    
   public static void main(String[] args) {
    int [] nums = {1,1,1,1,1,1,2};
    System.out.println(moores(nums));
   } 
    
}
