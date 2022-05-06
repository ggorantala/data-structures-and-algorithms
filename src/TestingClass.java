public class TestingClass {
  public static void main(String[] args) {
    char ch = 'a';

    System.out.println(findMissingLetter(new char[] {'a', 'b', 'c', 'd', 'f'}));
  }

  public static char findMissingLetter(char[] array) {
    char ch = 0;
    int[] nums = new int[array.length];
    for (int i = 0; i < array.length; i++) {
      nums[i] = array[i] - '0';
    }

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] - nums[i - 1] > 1) {
        System.out.println(nums[i]);
        ch = (char) ((nums[i] - 1) + '0');
        break;
      }
    }
    return ch;
  }
}
