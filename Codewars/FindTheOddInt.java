package Codewars;
/*
Given an array of integers, find the one that appears an odd number of times.

There will always be only one integer that appears an odd number of times.

Examples

[7] should return 7, because it occurs 1 time (which is odd).
[0] should return 0, because it occurs 1 time (which is odd).
[1,1,2] should return 2, because it occurs 1 time (which is odd).
[0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
[1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
 */

public class FindTheOddInt {
    public static void main(String[] args) {
        int[] a = {1,2,2,3,3,3,4,3,3,3,2,2,1};
        int num = 0, odd = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    num += 1;
                }
            }
            if (num % 2 == 1) {
                odd = a[i];
                break;
            }
        }
        System.out.print(odd);
    }   
}
