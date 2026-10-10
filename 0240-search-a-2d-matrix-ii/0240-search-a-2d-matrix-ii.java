class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int row=0;
        int column = m-1;

        while(row < n && column >= 0){
            if(matrix[row][column] == target) return true;

            if(matrix[row][column] > target){
                column--;
            }else{
                row++;
            }
        }
        return false;
    }
}