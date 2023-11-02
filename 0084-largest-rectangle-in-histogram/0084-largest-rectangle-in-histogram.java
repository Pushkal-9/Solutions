class Solution {
    public int largestRectangleArea(int[] heights) {
        int max=0;
        
        int[] leftMin = new int[heights.length];
        int[] rightMin = new int[heights.length];
        
            rightMin[heights.length - 1] = heights.length;
    leftMin[0] = -1;
        
        for (int i = 1; i < heights.length; i++) {
        int p = i - 1;

        while (p >= 0 && heights[p] >= heights[i]) {
            p = leftMin[p];
        }
        leftMin[i] = p;
    }

    for (int i = heights.length - 2; i >= 0; i--) {
        int p = i + 1;

        while (p < heights.length && heights[p] >= heights[i]) {
            p = rightMin[p];
        }
        rightMin[i] = p;
    }
        
        for(int i=0;i<heights.length;i++){
            max=Math.max(max, heights[i] * (rightMin[i]-leftMin[i]-1));
        }
        
        return max;
        
    }
}