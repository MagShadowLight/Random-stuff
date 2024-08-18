import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double num1;
        double num2 = 100000000000000.0;
        int stringLeg = 8;

        String text1 = "";
        String text2 = "";

        System.out.println("Give seventeen floating point numbers");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < stringLeg; j++) {
                num1 = Double.valueOf(scan.nextLine());
                num1 = (int) num1;
                if (num1 == num2) {
                    return;
                } else {
                    num2 = num1;
                }


                if (num1 >= 26) {
                    num1 = num1 % 26;
                }

                if (num1 >= 17) {
                    text1 = text1;
                } else if (num1 == 16) {
                    text1 = text1 + "Q ";
                } else if (num1 == 15) {
                    text1 = text1 + "P ";
                } else if (num1 == 14) {
                    text1 = text1 + "O ";
                } else if (num1 == 13) {
                    text1 = text1 + "N ";
                } else if (num1 == 12) {
                    text1 = text1 + "M ";
                } else if (num1 == 11) {
                    text1 = text1 + "L ";
                } else if (num1 == 10) {
                    text1 = text1 + "K ";
                } else if (num1 == 9) {
                    text1 = text1 + "J ";
                } else if (num1 == 8) {
                    text1 = text1 + "I ";
                } else if (num1 == 7) {
                    text1 = text1 + "H ";
                } else if (num1 == 6) {
                    text1 = text1 + "G ";
                } else if (num1 == 5) {
                    text1 = text1 + "F ";
                } else if (num1 == 4) {
                    text1 = text1 + "E ";
                } else if (num1 == 3) {
                    text1 = text1 + "D ";
                } else if (num1 == 2) {
                    text1 = text1 + "C ";
                } else if (num1 == 1) {
                    text1 = text1 + "B ";
                } else {
                    text1 = text1 + "A ";
                }


            }
            if (text2.equals("")) {
                text2 = text1;
                stringLeg = 9;
                text1 = "";
            }
        }

        System.out.println(text1);
        System.out.println(text2);

    }
}