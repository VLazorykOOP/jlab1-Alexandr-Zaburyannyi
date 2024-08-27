import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements A (< 500):");
        int n = scanner.nextInt();
        int[] A = new int[n];
        System.out.println("Enter element in A:");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.print("Enter number of elements B (< 200):");
        int m = scanner.nextInt();
        int[] B = new int[m];
        System.out.println("Enter element in B:");
        for (int i = 0; i < m; i++) {
            B[i] = scanner.nextInt();
        }

        int[] unionArray = new int[n + m];
        int unionSize = 0;

        for (int i = 0; i < n; i++) {
            if (!existsInArray(unionArray, unionSize, A[i])) {
                unionArray[unionSize] = A[i];
                unionSize++;
            }
        }

        for (int i = 0; i < m; i++) {
            if (!existsInArray(unionArray, unionSize, B[i])) {
                unionArray[unionSize] = B[i];
                unionSize++;
            }
        }

        int sum = 0;
        System.out.println("Elements of union A & B:");
        for (int i = 0; i < unionSize; i++) {
            System.out.print(unionArray[i] + " ");
            sum += unionArray[i];
        }

        System.out.println("\nSum of elements of union': " + sum);
    }

    public static boolean existsInArray(int[] array, int size, int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}
