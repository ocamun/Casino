package roulette;

import javax.swing.*;
import java.util.Scanner;

public class Bet {

    private JLabel text;
    private JTextField box;
    public void betSelection() {
        System.out.println("Seleccionen su tipo de apuesta.");
        System.out.println("1. Número máximo 36 números");
        System.out.println("2. Número par o impar");
        System.out.println("3. Primera dozena");
        System.out.println("4. ");
        Scanner sc = new Scanner(System.in);
        int betChoice = Integer.parseInt(sc.nextLine());
    }



}
