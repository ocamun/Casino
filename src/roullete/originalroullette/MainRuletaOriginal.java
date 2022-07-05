package roullete.originalroullette;

import javax.swing.*;

public class MainRuletaOriginal extends JFrame{

    public static void main(String[] args) {
        inizialize();
    }

    private static void inizialize() {
        WindowOriginalRoullette V = new WindowOriginalRoullette();      // creamos una ventana
        V.setVisible(true);             // hacemos visible la ventana creada
    }
}
