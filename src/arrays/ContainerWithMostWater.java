package arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public static int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;

        int maxArea = 0;

        while (start < end) {
            int area = Math.min(height[start], height[end]) * (end - start);
            maxArea = Math.max(maxArea, area);

            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }

        return maxArea;
    }
}
