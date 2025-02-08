package com.pksv;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(new ContainerWithMostWater().maxArea(height));
    }

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int area = (right - left) * h;
            maxArea = Math.max(maxArea, area);
            while (left < right && height[left] <= h) left++;
            while (left < right && h >= height[right]) right--;
        }
        return maxArea;
    }
}
