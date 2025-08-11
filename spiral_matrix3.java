class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int total = rows * cols;
        int[][] result = new int[total][2];
        
        int count = 0;
        int len = 1; // steps in the current direction
        int dir = 0; // 0 = east, 1 = south, 2 = west, 3 = north
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        
        int r = rStart;
        int c = cStart;
        
        result[count++] = new int[]{r, c}; // starting point
        
        while (count < total) {
            // Each "len" steps in current direction
            for (int i = 0; i < 2; i++) { // after 2 directions, len increases
                for (int step = 0; step < len; step++) {
                    r += directions[dir][0];
                    c += directions[dir][1];
                    if (r >= 0 && r < rows && c >= 0 && c < cols) {
                        result[count++] = new int[]{r, c};
                        if (count == total) return result;
                    }
                }
                dir = (dir + 1) % 4; // turn clockwise
            }
            len++;
        }
        
        return result;
    }
}
