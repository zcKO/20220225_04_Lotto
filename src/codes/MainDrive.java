package codes;

import java.util.Scanner;

public class MainDrive {

    public static void main(String[] args) {

//        6개의 숫자 입력 받기
        Scanner myScanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {

            while (true) {

                System.out.print((i + 1) + " 번째 숫자 : ");
                int inputNum = myScanner.nextInt();

                boolean isRangeOk = (1 <= inputNum) && (inputNum <= 45);

                if (isRangeOk) {
                    break;
                } else {
                    System.out.println("범위가 벗어 났습니다. 다시 입력해주세요");
                }

            }

        }
        myScanner.close();

    }

}
