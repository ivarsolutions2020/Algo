package sorting;

public class BubbleSort {

    public void sort(int[] nums) {
        for(int i=0; i < nums.length ; ++i)  {
            for (int j=i+1; j < nums.length; ++j) {
                if(nums[i] > nums[j]) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
    }

    public void display(int[] nums) {
        for(int i=0; i < nums.length; ++i) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {

        int[] list = new int[] {20,10,15,45,99};
        BubbleSort sorter = new BubbleSort();
        sorter.sort(list);
        sorter.display(list);

    }
    
}
