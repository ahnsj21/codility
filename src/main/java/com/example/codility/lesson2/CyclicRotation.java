package com.example.codility.lesson2;

/**
 * Developer :: Ahn Seong-jin
 * Date :: 2022/05/09
 * Description ::
 */
public class CyclicRotation {

    public static void main(String[] args) {
        int[] A = {3, 8, 9, 7, 6};
        int K = 3;
        CyclicRotation cyclicRotation = new CyclicRotation();
        int[] resultArr = cyclicRotation.solution(A, K);
        for (int result : resultArr) {
            System.out.print(result + " ");
        }
    }
    // {3, 8, 9, 7, 6}
    // i = (i+k) % arrLen
    // 0 = 0+3
    // 1 = 1+3
    // 2 = (2+3)%5
    // 3 = (3+3)%5
    // 4 = (4+3)%5
    public int[] solution(int[] A, int K) {
        int[] resultArr = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int movedIdx = (i + K) % A.length;
            resultArr[movedIdx] = A[i];
        }
        return resultArr;
    }
}
