package com.example.codility.lesson3;

/**
 * Developer :: Ahn Seong-jin
 * Date :: 2022/05/09
 * Description ::
 */
public class FrogJmp {
    public static void main(String[] args) {
//        int X = 10;
//        int Y = 85;
//        int D = 30;
        int X = 50;
        int Y = 199;
        int D = 4;
        FrogJmp frogJmp = new FrogJmp();
        int result = frogJmp.solution(X, Y, D);
        System.out.println("result = " + result);
    }

    // 1 : 10 + 30 = 40
    // 2 : 10 + 30 + 30 = 70
    // 3 : 10 + 30 + 30 + 30 = 100
    public int solution(int X, int Y, int D) {
        int distance = Y - X;
        int jumpCount = distance / D;
        int remains = distance % D;
        return remains == 0 ? jumpCount : jumpCount + 1;
    }
}
