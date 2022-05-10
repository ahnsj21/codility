package com.example.codility.lesson3;

import java.util.Arrays;

/**
 * Developer :: Ahn Seong-jin
 * Date :: 2022/05/09
 * Description ::
 */
public class PermMissingElem {
    public static void main(String[] args) {
        int[] A = {2, 3, 1, 5};
        PermMissingElem permMissingElem = new PermMissingElem();
        int result = permMissingElem.solution(A);
        System.out.println("result = " + result);
    }

    // {1, 2, 3, 5}
    public int solution(int[] A) {
        Arrays.sort(A);
        for (int i=0; i<A.length; i++) {
            if (A[i] != i+1) {
                return i+1;
            }
        }
        return A.length + 1;
    }
}
