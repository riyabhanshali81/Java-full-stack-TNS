package manthan.Collaction1.assigment1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTestScoreTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of test scores: ");
        int n = scanner.nextInt();

        // Initialize the array to store test scores
        int[] testScores = new int[n];

        // Input the test scores
        System.out.println("\nEnter the test scores:");
        for (int i = 0; i < n; i++) {
            System.out.print((i+1)+" Test score: ");
            testScores[i] = scanner.nextInt();
        }

        // Initialize an ArrayList to store test scores
        ArrayList<Integer> scoreList = new ArrayList<>();

        // Transfer the test scores from the array to the ArrayList
        for (int score : testScores) {
            scoreList.add(score);
        }

        // Display the test scores using the ArrayList
        System.out.println("\nTest scores are:");
        for (int score : scoreList) {
            System.out.print(score + " ");
        }
    }
}

