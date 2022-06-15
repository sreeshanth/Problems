/*
Given an integer array A of size N. You can remove any element from the array in one operation.
The cost of this operation is the sum of all elements in the array present before this operation.

Find the minimum cost to remove all elements from the array.
*/

public class Solution {
    public int solve(int[] A) {
        int cost = 0;
        Arrays.sort(A);
        int total = 0;
        for(int i =0;i<A.length;i++){
            total += A[i];
        }
        cost = total;
        for(int i = A.length-2;i>=0;i--){
            total -= A[i+1];
            cost += total;
        }
        return cost;
    }
}
