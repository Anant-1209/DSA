// Given an array arr[] of size n. Calculate the sum of Bitwise ANDs ie: calculate sum of arr[i] & arr[j] for all the pairs in the given array arr[] where i < j.

// Input:
// n = 3
// arr = {5, 10, 15}
// Output:
// 15
// Explanation:
// The bitwise Ands of all pairs where i<j are (5&10) = 0, (5&15) = 5 and (10&15) = 10.
// Therefore, the total sum = (0+5+10) = 15.

// Input:
// n = 4
// arr = {10, 20, 30, 40}
// Output:
// 46
// Explanation:
// The sum of bitwise Ands 
// of all pairs = (0+10+8+20+0+8) = 46.

public class SumOfProduct {
    static long pairAndSum(int n, long arr[]) {
        long sum = 0;

        // Count the number of set bits at each position
        for (int i = 0; i < 32; i++) { // Assuming long has 64 bits, we iterate 32 times
            long count = 0;
            for (int j = 0; j < n; j++) {
                if (((arr[j] >> i) & 1) == 1) {
                    count++;
                }
            }
            // For each bit position, add the sum contributed by pairs of 1s
            sum += count * (count - 1) / 2 * (1 << i); // (count choose 2) * 2^i
        }

        return sum;
    }
}
