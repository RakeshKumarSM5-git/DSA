class ContainerWithMostWater {
    
    public int maxArea(int[] height) {
        
        int len = height.length;

        if (len == 2)
        return Math.min(height[0], height[1]);

        int left = 0, right = len  - 1;

        int hgt = Math.min(height[left], height[right]);

        int width = (right - left);

        int maxArea = (hgt * width);

        int area = 0;

        while (left < right) {

            if ((height[left] != 0) && (height[right] != 0)) {

                hgt = Math.min(height[left], height[right]);
                width = (right - left);
                area = (hgt * width);
                maxArea = Math.max(area, maxArea);
            }

            if (height[left] < height[right])
            left++;

            else
            right--;
        }

        return maxArea;
    }
}
