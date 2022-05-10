package com.example.codility.lesson2;

import java.util.HashMap;
import java.util.Map;

/**
 * Developer :: Ahn Seong-jin
 * Date :: 2022/05/09
 * Description ::
 */
public class OddOccurrencesInArray {
    public static void main(String[] args) {
        OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        int result = oddOccurrencesInArray.solution(A);
        System.out.println("result = " + result);
    }
    public int solution(int[] A) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int key : A) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if ((entry.getValue() % 2) == 1) {
                result = entry.getKey();
                break;
            }
        }

        return result;
    }
}
