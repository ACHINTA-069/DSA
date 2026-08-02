

public class two_sum {
    public static int[] twoSum(int[]num,int target){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]+num[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[]num={2,11,7,15};
        int target=9;
        int[]result=twoSum(num, target);
        System.out.print("Result:["+result[0]+","+result[1]+"]");
    }
}
