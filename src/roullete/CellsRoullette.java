package roullete;

import java.util.Random;

public class CellsRoullette {
    int maxNumber = 36;

    boolean isEven;
    boolean isOdd;

    boolean firstDozen;
    boolean secondDozen;
    boolean thirdDozen;

    boolean firstThird;
    boolean secondThird;
    boolean thirdThird;

    boolean isRed;
    boolean isBlack;
    boolean isGreen;

    Random random = new Random();

    //GENERACIÓN DEL NÚMERO ALEATORIO DEL 0 AL 36.
    int randomCellNumber = random.nextInt(maxNumber);

    //CÁLCULO DEL RESTO DEL NÚMERO GENERADO ALEATORIAMENTE
    int finalSolutionNumberCell = randomCellNumber % 2;

    //DETECTOR DE PAR O IMPAR
    private void Even(){
        if (finalSolutionNumberCell == 0) {
            isEven = true;
        } else {
            isOdd = true;
        }
    }

    //Dozen detector 1º 2º 3º
    private void DozenNumber() {
        if (randomCellNumber == 1 || randomCellNumber == 2 || randomCellNumber == 3 || randomCellNumber == 4 || randomCellNumber == 5 || randomCellNumber == 6 || randomCellNumber == 7 || randomCellNumber == 8 || randomCellNumber == 9 || randomCellNumber == 10 || randomCellNumber == 11 || randomCellNumber == 12) {
            firstDozen = true;
            secondDozen = false;
            thirdDozen = false;
        }

        if (randomCellNumber == 13 || randomCellNumber == 14 || randomCellNumber == 15 || randomCellNumber == 16 || randomCellNumber == 17 || randomCellNumber == 18 || randomCellNumber == 19 || randomCellNumber == 20 || randomCellNumber == 21 || randomCellNumber == 22 || randomCellNumber == 23 || randomCellNumber == 24) {
            firstDozen = false;
            secondDozen = true;
            thirdDozen = false;
        }

        if (randomCellNumber == 25 || randomCellNumber == 26 || randomCellNumber == 27 || randomCellNumber == 28 || randomCellNumber == 29 || randomCellNumber == 30 || randomCellNumber == 31 || randomCellNumber == 32 || randomCellNumber == 33 || randomCellNumber == 34 || randomCellNumber == 35 || randomCellNumber == 36) {
            firstDozen = false;
            secondDozen = false;
            thirdDozen = true;
        }
    }

    //DETECTOR DE TERCIO 1º 2º 3º
    private void ThirdThird() {
        if (randomCellNumber == 3 || randomCellNumber == 6 || randomCellNumber == 9 || randomCellNumber == 12 || randomCellNumber == 15 || randomCellNumber == 18 || randomCellNumber == 21 || randomCellNumber == 24 || randomCellNumber == 27 || randomCellNumber == 30 || randomCellNumber == 33 || randomCellNumber == 36) {
            firstThird = true;
            secondThird = false;
            thirdThird = false;
        }

        if (randomCellNumber == 2 || randomCellNumber == 5 || randomCellNumber == 8 || randomCellNumber == 11 || randomCellNumber == 14 || randomCellNumber == 17 || randomCellNumber == 20 || randomCellNumber == 23 || randomCellNumber == 26 || randomCellNumber == 29 || randomCellNumber == 32 || randomCellNumber == 35) {
            firstThird = false;
            secondThird = true;
            thirdThird = false;
        }

        if (randomCellNumber == 1 || randomCellNumber == 4 || randomCellNumber == 7 || randomCellNumber == 10 || randomCellNumber == 13 || randomCellNumber == 16 || randomCellNumber == 19 || randomCellNumber == 22 || randomCellNumber == 25 || randomCellNumber == 28 || randomCellNumber == 31 || randomCellNumber == 34) {
            firstThird = false;
            secondThird = false;
            thirdThird = true;
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

    public int randomCellNumber() {
        return randomCellNumber;
    }

    public boolean isEven() {
        return isEven;
    }

    public boolean isOdd() {
        return  isOdd;
    }

    public boolean firstDozen() {
        return firstDozen;
    }

    public boolean secondDozen() {
        return secondDozen;
    }

    public boolean thirdDozen() {
        return thirdDozen;
    }

    public boolean firstThird() {
        return firstThird;
    }

    public boolean secondThird() {
        return secondThird;
    }

    public boolean thirdTird() {
        return thirdThird;
    }

    public boolean isRed() {
        return isRed;
    }

    public boolean isBlack() {
        return isBlack;
    }

    public boolean isGreen() {
        return isGreen;
    }
}
