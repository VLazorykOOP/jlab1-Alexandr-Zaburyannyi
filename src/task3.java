    import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n (n < 20):"   );
        int n = scanner.nextInt();
        int[][] A = new int[n][n];

        System.out.println("Enter elemnts of matrix A:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                A[i][j] = scanner.nextInt();
            }
        int maxSum = 0;
        int maxSumIndex = -1;

        for (int i = 0; i < n; i++) {
            int currSum = 0;
            for (int j = 0; j < n; j++) {
                currSum += A[i][j];
            }
            if(currSum > maxSum) {
                maxSum = currSum;
                maxSumIndex = i;
            }
        }

        int smallestNum = A[maxSumIndex][0];
        for (int i = 0; i < n; i++) {
            if(smallestNum > A[maxSumIndex][i]){
                smallestNum = A[maxSumIndex][i];
            }
        }
        System.out.println("The smallest number is " + smallestNum);
    }
}
