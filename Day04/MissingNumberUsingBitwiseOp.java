package Day04;

public class MissingNumberUsingBitwiseOp {
    public int missingNum(int[] nums){
        int missingNumber=0;
        for(int no:nums){
            missingNumber=missingNumber^no;
        }
        for (int i = 0; i <= nums.length+1; i++) {
            missingNumber=missingNumber^i;
        }
        return missingNumber;
    }
    public static void main(String[] args) {
        MissingNumberUsingBitwiseOp msn=new MissingNumberUsingBitwiseOp();
        int[] num={1,2,3,4,5,7,8};
        System.out.println(msn.missingNum(num));
    }
}
