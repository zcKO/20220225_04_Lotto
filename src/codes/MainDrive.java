package codes;

import java.util.Scanner;

public class MainDrive {

    public static void main(String[] args) {

//        6개의 숫자 입력 받기
        Scanner myScanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {

            System.out.print((i + 1) + " 번째 숫자 : ");
            int inputNum = myScanner.nextInt();

        }
        myScanner.close();

    }

}
