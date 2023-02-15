public class jaggedArray{
    public static void main(String[] args) {
        // when columns not fixed

        int nums[][] = new int [3][];
        nums[0] = new int [4];
        nums[1] = new int [2];
        nums[2] = new int [3];
        
        int count = 1;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[i].length; j++){
                nums[i][j] = count;
                count++;
            }
        }

        for(int[] a : nums){
            for(int b : a){
                System.out.print(b + " ");
            }
        }
    }
} 