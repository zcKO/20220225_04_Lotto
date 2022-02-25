package codes;

import java.util.Scanner;

public class MainDrive {

    public static void main(String[] args) {

//        6개의 숫자 입력 받기
        Scanner myScanner = new Scanner(System.in);

        int[] myNumbers = new int[6];

        for (int i = 0; i < myNumbers.length; i++) {

            while (true) {

                System.out.print((i + 1) + " 번째 숫자 : ");
                int inputNum = myScanner.nextInt();

                boolean isRangeOk = (1 <= inputNum) && (inputNum <= 45);
                boolean isDuplOk = true;

                for (int myNum : myNumbers) {
                    if (myNum == inputNum) {
                        isDuplOk = false;
                        break;
                    }
                }

                if (isRangeOk && isDuplOk) {
                    myNumbers[i] = inputNum;
                    break;
                } else {
                    System.out.println("동일한 숫자 또는 범위 (1 ~ 45)가 벗어 났습니다. 다시 입력해주세요");
                }

            }

        }
        myScanner.close();

        int[] winNumbers = new int[6];

        for (int i = 0; i < winNumbers.length; i++) {

            while (true) {
//                0 <= 랜덤 값을 < 1
//                * 45 + 1 :  1 <= (랜덤 값 * 45 + 1) < 46
//                Random class 를 사용해도 된다.
                int randomNum = (int) (Math.random() * 45 + 1);

                boolean isDuplOk = true;

                for (int num: winNumbers) {

                    if (num == randomNum) {
                        isDuplOk = false;
                        break;
                    }

                }

                if (isDuplOk) {
                    winNumbers[i] = randomNum;
                    break;
                }

            }

        }

        for (int num: winNumbers) {
            System.out.println(num);
        }


    }

}
