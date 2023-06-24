import java.util.*;

//  where intervals[i] = [starti, endi],
// determine if a person could attend all meetings if it is then return true or return false.
// Input: intervals = [[0,30],[5,10],[15,20]] // Output: false
public class MettingInterval {

    public static boolean ispersoncanattend(int[][] intervals) {
        int n = intervals.length;
        // 1st declaring two start and end with n
        // Two pointer approach
        int start[] = new int[n];
        int end[] = new int[n];
        // iterating over the intervals
        for (int i = 0; i < n; i++) {
            // got the start and end time stored into the variavles
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        // used Arrasy.sort to sort the intervals in asscending order
        // let's sort the intevals so we can compair
        Arrays.sort(start);
        Arrays.sort(end);
        // 2nd to find the intervals
        for (int i = 1; i < n; i++) {
            if (start[i] < end[i - 1]) {
                // Overlapping Intervals found
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int intervals[][] = { { 0, 30 }, { 5, 10 }, { 15, 20 } };
        System.out.println(MettingInterval.ispersoncanattend(intervals));
    }
}