package com.example.codility.lesson1;

import java.util.Scanner;
import java.util.Stack;

/**
 * Developer :: Ahn Seong-jin
 * Date :: 2022/05/09
 * Description ::
 */
public class BinaryGap {
    public static void main(String[] args) {
        BinaryGap binaryGap = new BinaryGap();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = binaryGap.solution(n);
        System.out.println("result = " + result);
    }

    private int solution(int N) {
        int result = 0;
        String binaryStr = Integer.toBinaryString(N);
        System.out.println("binaryStr = " + binaryStr);

        Stack<Character> stack = new Stack<>();
        for (Character c : binaryStr.toCharArray()) {
            stack.push(c);
        }

        int cnt = 0;
        boolean isValid = false;
        while (!stack.isEmpty()) {
            Character top = stack.pop();
            if (top == '1') {
                result = Math.max(cnt, result);
                cnt = 0;
                isValid = true;
            } else {
                if (isValid == true) {
                    cnt++;
                }
            }
        }
        return result;
    }
}
