package roulette;

import java.util.Random;

public class CellsRoullette {

    static int maxNumber = 36;

    private String cellNumber;

    boolean thirdDozen;

    boolean firstThird;
    boolean secondThird;
    boolean thirdThird;

    boolean isRed;
    boolean isBlack;
    boolean isGreen;

    static Random random = new Random();

    //GENERACIÓN DEL NÚMERO ALEATORIO DEL 0 AL 36.
    public static int randomCellNumber = random.nextInt(maxNumber);

    //CÁLCULO DEL RESTO DEL NÚMERO GENERADO ALEATORIAMENTE
    public int finalSolutionNumberCell = randomCellNumber % 2;

    //Even detector
    public boolean isEven() {
        if (finalSolutionNumberCell == 0) {
            return true;
        } else {
            return false;
        }
    }

    //Odd detector
    public boolean isOdd() {
        if (finalSolutionNumberCell == 1) {
            return true;
        } else {
            return false;
        }
    }

    //Dozen detector 1º
    public boolean isFirstDozen() {
        if (randomCellNumber == 1 || randomCellNumber == 2 || randomCellNumber == 3 || randomCellNumber == 4 || randomCellNumber == 5 || randomCellNumber == 6 || randomCellNumber == 7 || randomCellNumber == 8 || randomCellNumber == 9 || randomCellNumber == 10 || randomCellNumber == 11 || randomCellNumber == 12) {
            return true;
        } else {
            return false;
        }
    }

    //Dozen detector 2º
    public boolean isSecondDozen() {
        if (randomCellNumber == 13 || randomCellNumber == 14 || randomCellNumber == 15 || randomCellNumber == 16 || randomCellNumber == 17 || randomCellNumber == 18 || randomCellNumber == 19 || randomCellNumber == 20 || randomCellNumber == 21 || randomCellNumber == 22 || randomCellNumber == 23 || randomCellNumber == 24) {
            return true;
        } else {
            return false;
        }
    }

    //Dozen detector 3º
    public boolean isThirdDozen() {
        if (randomCellNumber == 25 || randomCellNumber == 26 || randomCellNumber == 27 || randomCellNumber == 28 || randomCellNumber == 29 || randomCellNumber == 30 || randomCellNumber == 31 || randomCellNumber == 32 || randomCellNumber == 33 || randomCellNumber == 34 || randomCellNumber == 35 || randomCellNumber == 36) {
            return true;
        } else {
            return false;
        }
    }

    //Third detector
    public boolean isFirstThird() {
        if (randomCellNumber == 3 || randomCellNumber == 6 || randomCellNumber == 9 || randomCellNumber == 12 || randomCellNumber == 15 || randomCellNumber == 18 || randomCellNumber == 21 || randomCellNumber == 24 || randomCellNumber == 27 || randomCellNumber == 30 || randomCellNumber == 33 || randomCellNumber == 36) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isSecondThird() {
        if (randomCellNumber == 3 || randomCellNumber == 6 || randomCellNumber == 9 || randomCellNumber == 15 || randomCellNumber == 18 || randomCellNumber == 21 || randomCellNumber == 24 || randomCellNumber == 27 || randomCellNumber == 30 || randomCellNumber == 33 || randomCellNumber == 36) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isThirdThird() {
        if (randomCellNumber == 1 || randomCellNumber == 4 || randomCellNumber == 7 || randomCellNumber == 10 || randomCellNumber == 13 || randomCellNumber == 16 || randomCellNumber == 19 || randomCellNumber == 22 || randomCellNumber == 25 || randomCellNumber == 28 || randomCellNumber == 31 || randomCellNumber == 34) {
            return true;
        } else {
            return false;
        }
    }

    //DETECTOR DE COLOR POR CADA NÚMERO
    private void NumberColor() {
        if (randomCellNumber == 0) {
            isGreen = true;
            isRed = false;
            isBlack = false;
        }

        if (randomCellNumber == 1 || randomCellNumber == 3 || randomCellNumber == 5 || randomCellNumber == 7 || randomCellNumber == 9 || randomCellNumber == 12 || randomCellNumber == 14 || randomCellNumber == 16 || randomCellNumber == 18 || randomCellNumber == 19 || randomCellNumber == 21 || randomCellNumber == 23 || randomCellNumber == 25 || randomCellNumber == 27 || randomCellNumber == 30 || randomCellNumber == 32 || randomCellNumber == 34 || randomCellNumber == 36) {
            isGreen = false;
            isRed = true;
            isBlack = false;
        }

        if (randomCellNumber == 2 || randomCellNumber == 4 || randomCellNumber == 6 || randomCellNumber == 8 || randomCellNumber == 10 || randomCellNumber == 11 || randomCellNumber == 13 || randomCellNumber == 15 || randomCellNumber == 17 || randomCellNumber == 20 || randomCellNumber == 22 || randomCellNumber == 24 || randomCellNumber == 26 || randomCellNumber == 28 || randomCellNumber == 29 || randomCellNumber == 31 || randomCellNumber == 33 || randomCellNumber == 35) {
            isGreen = false;
            isRed = false;
            isBlack = true;
        }
    }
}