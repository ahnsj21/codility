package com.example.codility.lesson4;

import java.util.*;

/**
 * Developer :: Ahn Seong-jin
 * Date :: 2022/05/09
 * Description ::
 */
public class FrogRiverOne {
    public static void main(String[] args) {
        FrogRiverOne frogRiverOne = new FrogRiverOne();
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        int X = 5;
        int result = frogRiverOne.solution(X, A);
        System.out.println("result = " + result);
    }

    public int solution(int X, int[] A) {
        int result = -1;
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<A.length; i++) {
            set.add(A[i]);
            if (set.size() == X) {
                result = i;
                break;
            }
        }
        return result;
    }

    // timeout error
    public int solution_timeout_error(int X, int[] A) {
        int result = -1;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < X; i++) {
            queue.offer(i + 1);
        }

        for (int i=0; i<A.length; i++) {
            int value = A[i];
            boolean contains = queue.contains(value);
            if (contains) {
                queue.remove(value);
                if (queue.isEmpty()) {
                    result = i;
                    break;
                }
            }
        }

        return result;
    }
}
