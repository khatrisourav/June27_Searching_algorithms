import java.util.Scanner;

public class binary_search {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = s1.nextInt();
        int array[] = new int[size];

        System.out.println("Enter " + size + " sorted elements:");
        for (int i = 0; i < size; i++) {
            array[i] = s1.nextInt();
        }

        System.out.println("Enter the target to search:");
        int target = s1.nextInt();

        int low = 0;
        int high = size - 1;
        int index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                index = mid;
                break;
            } else if (array[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (index == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index " + index);
        }

        s1.close(); // good habit
    }
}

