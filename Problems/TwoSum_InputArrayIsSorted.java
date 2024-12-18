public class TwoSum_InputArrayIsSorted {
    public int[] twoSum1(int[] numbers, int target) {
        int result[] = new int[2];
        result[0] = -1;
        result[1] = -1;
        int n = numbers.length;
        int i = 0, j = n - 1;
        while (i <= j) {
            int currentSum = numbers[i] + numbers[j];
            if (currentSum == target) {
                result[0] = i + 1;
                result[1] = j + 1;

                break;
            } else if (currentSum > target) {
                j--;
            } else {
                i++;
            }
        }
        return result;
    }

    // OR
    public int[] twoSum2(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] > target) {
                j--;
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            } else {
                return new int[] { i + 1, j + 1 };
            }
        }
        return null;
    }
}
