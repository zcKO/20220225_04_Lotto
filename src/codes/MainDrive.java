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

                for (int num : winNumbers) {

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

//        임시 당첨번호 => 당첨 등수 로직 테스트용
        winNumbers[0] = 10;
        winNumbers[1] = 11;
        winNumbers[2] = 20;
        winNumbers[3] = 21;
        winNumbers[4] = 30;
        winNumbers[5] = 31;

        for (int num : winNumbers) {
            System.out.println(num);
        }

        int correctCount = 0;

        for (int myNum : myNumbers) {
            for (int winNum : winNumbers) {
                if (myNum == winNum) {
                    correctCount++;
                }
            }
        }

        if (correctCount == 6) {
            System.out.println("1등");
        } else if (correctCount == 5) {
//            보너스 번호 로직 추가 필요
            System.out.println("임시 - 3등");
        } else if (correctCount == 4) {
            System.out.println("4등");
        } else if (correctCount == 3) {
            System.out.println("3등");
        } else {
            System.out.println("낙첨");
        }

    }

}
