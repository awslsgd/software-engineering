import java.util.ArrayList;

public class max {
    // 解法
    public static int getMaxSubArrayValue(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException(" illegalArgument");
        }

        // 记录最大值
        int max = Integer.MIN_VALUE;
        // 当前最大值
        int currentMaxValue = 0;
        for (int i : arr) {
            if (currentMaxValue <= 0) {
                currentMaxValue = i;
            } else {
                currentMaxValue += i;
            }

            if (max < currentMaxValue) {
                max = currentMaxValue;
            }
        }
        return max;
    }

}
