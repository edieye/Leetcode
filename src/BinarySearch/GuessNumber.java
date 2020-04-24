package BinarySearch;

/**
 * Created by edieye on 2020-04-23.
 */
public class GuessNumber {
    /**374. Guess Number Higher or Lower **/
    public int guessNumber(int n) {
        int i = 1;
        while (i <= n) {
            int mid = i + (n - i) /2;
            int guess = guess(mid);
            if (guess == 0) return mid;
            else if (guess == -1) n = mid -1;
            else i = mid + 1;
        }
        return i;
    }

    // not part of algo, Leetode pre-defined guess
    int guess(int num) {
        return num;
    }
}
