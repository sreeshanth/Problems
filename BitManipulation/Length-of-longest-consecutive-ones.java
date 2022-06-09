#InterviewBit
/*
Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.
Input 1:
    A = "111000"
Output 1:
    3

Input 2:
    A = "111011101"
Output 2:
    7
*/

public class Solution {
    public int solve(String A) {
        int totalOnes = 0;
        for(int i =0;i<A.length();i++){
                                                          //findingTotal number of Ones in the given String
            if(A.charAt(i) == '1'){
                totalOnes++;
            }
        }
        //EdgeCase if string doesn't have any Zeroes
        if(totalOnes == A.length()){
            return totalOnes;
        }
        int res = 0;
        for(int i=0;i<A.length();i++){
            int left = 0;
            int right = 0;
            if(A.charAt(i) == '0'){
            
                for(int j = i-1;j>=0;j--){
                    if(A.charAt(j) == '1'){
                        left++;
                    }
                    else{
                        break;
                    }
                }
                for(int k = i+1;k<A.length();k++){
                    if(A.charAt(k) == '1'){
                        right++;
                    }
                    else{
                        break;
                    }
                }
                //EdgeCase
                if(left+right == totalOnes){
                    res = Math.max(left+right,res);
                }
                else{
                    res = Math.max(left+right+1,res);
                }
            }
        }
        return res;
    }
}
