package ruleta;

import java.util.Random;

public class CasillasRuleta {
    int NumeroMinimo = 0;
    int NumeroMaximo = 36;

    Random random = new Random();

    //GENERACIÓN DEL NÚMERO ALEATORIO DEL 0 AL 36.
    int NumeroCasillaAleatorio = random.nextInt((NumeroMaximo - NumeroMinimo) + NumeroMinimo);

    //CÁLCULO DEL RESTO DEL NÚMERO GENERADO ALEATORIAMENTE
    int RestoNumeroCasilla = NumeroCasillaAleatorio % 2;

    //DETECTOR DE PAR O IMPAR
    public void ParImpar(){
        if (RestoNumeroCasilla == 0) {
            boolean Espar = true;
        } else {
            boolean Espar = false;
        }
    }

    //DETECTOR DE DOCENA 1ª 2ª 3ª
    public void NumeroDocena() {
        if (NumeroCasillaAleatorio == 1 || NumeroCasillaAleatorio == 2 || NumeroCasillaAleatorio == 3 || NumeroCasillaAleatorio == 4 || NumeroCasillaAleatorio == 5 || NumeroCasillaAleatorio == 6 || NumeroCasillaAleatorio == 7 || NumeroCasillaAleatorio == 8 || NumeroCasillaAleatorio == 9 || NumeroCasillaAleatorio == 10 || NumeroCasillaAleatorio == 11 || NumeroCasillaAleatorio == 12) {
            boolean PrimeraDocena = true;
            boolean SegundaDocena = false;
            boolean TerceraDocena = false;
        }

        if (NumeroCasillaAleatorio == 13 || NumeroCasillaAleatorio == 14 || NumeroCasillaAleatorio == 15 || NumeroCasillaAleatorio == 16 || NumeroCasillaAleatorio == 17 || NumeroCasillaAleatorio == 18 || NumeroCasillaAleatorio == 19 || NumeroCasillaAleatorio == 20 || NumeroCasillaAleatorio == 21 || NumeroCasillaAleatorio == 22 || NumeroCasillaAleatorio == 23 || NumeroCasillaAleatorio == 24) {
            boolean PrimeraDocena = false;
            boolean SegundaDocena = true;
            boolean TerceraDocena = false;
        }

        if (NumeroCasillaAleatorio == 25 || NumeroCasillaAleatorio == 26 || NumeroCasillaAleatorio == 27 || NumeroCasillaAleatorio == 28 || NumeroCasillaAleatorio == 29 || NumeroCasillaAleatorio == 30 || NumeroCasillaAleatorio == 31 || NumeroCasillaAleatorio == 32 || NumeroCasillaAleatorio == 33 || NumeroCasillaAleatorio == 34 || NumeroCasillaAleatorio == 35 || NumeroCasillaAleatorio == 36) {
            boolean PrimeraDocena = false;
            boolean SegundaDocena = false;
            boolean TerceraDocena = true;
        }
    }

    //DETECTOR DE TERCIO 1º 2º 3º
    public void NumeroTercio() {
        if (NumeroCasillaAleatorio == 3 || NumeroCasillaAleatorio == 6 || NumeroCasillaAleatorio == 9 || NumeroCasillaAleatorio == 12 || NumeroCasillaAleatorio == 15 || NumeroCasillaAleatorio == 18 || NumeroCasillaAleatorio == 21 || NumeroCasillaAleatorio == 24 || NumeroCasillaAleatorio == 27 || NumeroCasillaAleatorio == 30 || NumeroCasillaAleatorio == 33 || NumeroCasillaAleatorio == 36) {
            boolean PrimerTercio = true;
            boolean SegundoTercio = false;
            boolean TercerTercio = false;
        }

        if (NumeroCasillaAleatorio == 2 || NumeroCasillaAleatorio == 5 || NumeroCasillaAleatorio == 8 || NumeroCasillaAleatorio == 11 || NumeroCasillaAleatorio == 14 || NumeroCasillaAleatorio == 17 || NumeroCasillaAleatorio == 20 || NumeroCasillaAleatorio == 23 || NumeroCasillaAleatorio == 26 || NumeroCasillaAleatorio == 29 || NumeroCasillaAleatorio == 32 || NumeroCasillaAleatorio == 35) {
            boolean PrimerTercio = false;
            boolean SegundoTercio = true;
            boolean TercerTercio = false;
        }

        if (NumeroCasillaAleatorio == 1 || NumeroCasillaAleatorio == 4 || NumeroCasillaAleatorio == 7 || NumeroCasillaAleatorio == 10 || NumeroCasillaAleatorio == 13 || NumeroCasillaAleatorio == 16 || NumeroCasillaAleatorio == 19 || NumeroCasillaAleatorio == 22 || NumeroCasillaAleatorio == 25 || NumeroCasillaAleatorio == 28 || NumeroCasillaAleatorio == 31 || NumeroCasillaAleatorio == 34) {
            boolean PrimerTercio = false;
            boolean SegundoTercio = false;
            boolean TercerTercio = true;
        }
    }

    //DETECTOR DE COLOR POR CADA NÚMERO
    public void ColorNumero() {
        if (NumeroCasillaAleatorio == 0) {
            boolean EsVerde = true;
            boolean EsRojo = false;
            boolean EsNegro = false;
        }

        if (NumeroCasillaAleatorio == 1 || NumeroCasillaAleatorio == 3 || NumeroCasillaAleatorio == 5 || NumeroCasillaAleatorio == 7 || NumeroCasillaAleatorio == 9 || NumeroCasillaAleatorio == 12 || NumeroCasillaAleatorio == 14 || NumeroCasillaAleatorio == 16 || NumeroCasillaAleatorio == 18 || NumeroCasillaAleatorio == 19 || NumeroCasillaAleatorio == 21 || NumeroCasillaAleatorio == 23 || NumeroCasillaAleatorio == 25 || NumeroCasillaAleatorio == 27 || NumeroCasillaAleatorio == 30 || NumeroCasillaAleatorio == 32 || NumeroCasillaAleatorio == 34 || NumeroCasillaAleatorio == 36) {
            boolean EsVerde = false;
            boolean EsRojo = true;
            boolean EsNegro = false;
        }

        if (NumeroCasillaAleatorio == 2 || NumeroCasillaAleatorio == 4 || NumeroCasillaAleatorio == 6 || NumeroCasillaAleatorio == 8 || NumeroCasillaAleatorio == 10 || NumeroCasillaAleatorio == 11 || NumeroCasillaAleatorio == 13 || NumeroCasillaAleatorio == 15 || NumeroCasillaAleatorio == 17 || NumeroCasillaAleatorio == 20 || NumeroCasillaAleatorio == 22 || NumeroCasillaAleatorio == 24 || NumeroCasillaAleatorio == 26 || NumeroCasillaAleatorio == 28 || NumeroCasillaAleatorio == 29 || NumeroCasillaAleatorio == 31 || NumeroCasillaAleatorio == 33 || NumeroCasillaAleatorio == 35) {
            boolean EsVerde = false;
            boolean EsRojo = false;
            boolean EsNegro = true;
        }

    }

}
