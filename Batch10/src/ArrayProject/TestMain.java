package ArrayProject;

public class TestMain {

    public static boolean contains12(int[] nums) {

        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == 2) {
                        flag = true;
                    }
                }
            }
        }
       // System.out.println(flag);
        return flag;
    }

    public static void main(String[] args) {
        int [] array={3,3,5,2,1,1};
        TestMain.contains12(array);
        //System.out.println(array);
        System.out.println(TestMain.contains12(array));
        }
    }
