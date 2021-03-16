package maquinadeturing;

import javax.swing.JOptionPane;

public class MaquinaDeTuring {

    private static int aux;
    private static char FitaDados[];

    public static void iniciaMaquina(String palavra) {
        aux = 0;
        FitaDados = palavra.toCharArray();
        q0();
    }

    // b 1    a 0
    private static void q0() {

        if (aux < FitaDados.length) {
            if (FitaDados[aux] == 'F') {
                FitaDados[aux] = 'F';
                aux++;
                q4();

            } else if (FitaDados[aux] == 'B') {
                FitaDados[aux] = 'B';
                aux++;
                q3();

            } else if (FitaDados[aux] == '0') {
                FitaDados[aux] = 'A';
                aux++;
                q1();

            } else {
                qerro();
            }
        }
    }

    private static void q1() {

        if (aux < FitaDados.length) {

            if (FitaDados[aux] == '0') {
                FitaDados[aux] = '0';
                aux++;
                q1();

            } else if (FitaDados[aux] == 'B') {
                FitaDados[aux] = 'B';
                aux++;
                q1();

            } else if (FitaDados[aux] == '1') {
                FitaDados[aux] = 'B';
                aux--;
                q2();

            } else {
                qerro();
            }
        }
    }

    private static void q2() {

        if (aux < FitaDados.length) {
            if (FitaDados[aux] == '0') {
                FitaDados[aux] = '0';
                aux--;
                q2();

            } else if (FitaDados[aux] == 'B') {
                FitaDados[aux] = 'B';
                aux--;
                q2();

            } else if (FitaDados[aux] == 'A') {
                FitaDados[aux] = 'A';
                aux++;
                q0();

            } else {
                qerro();
            }
        }
    }

    private static void q3() {

        if (aux < FitaDados.length) {

            if (FitaDados[aux] == 'B') {
                FitaDados[aux] = 'B';
                aux++;
                q3();

            } else if (FitaDados[aux] == 'F') {
                FitaDados[aux] = 'F';
                aux++;
                q4();

            } else {
                qerro();
            }
        }
    }

    private static void q4() {
        String palavra = "";
        for (int i = 0; i < (FitaDados.length - 1); i++) {
            if (FitaDados[i] == 'A') {
                FitaDados[i] = '0';
            } else if (FitaDados[i] == 'B') {
                FitaDados[i] = '1';
            }
            palavra += FitaDados[i];
        }
        JOptionPane.showMessageDialog(null, "Palavra aceita:    " + palavra);
    }

    private static void qerro() {
        String palavra = "";
        for (int i = 0; i < (FitaDados.length - 1); i++) {
            if (FitaDados[i] == 'A') {
                FitaDados[i] = '0';
            } else if (FitaDados[i] == 'B') {
                FitaDados[i] = '1';
            }
            palavra += FitaDados[i];
        }
        System.out.println(palavra);
        JOptionPane.showMessageDialog(null, "Palavra NAO aceita:    " + palavra);
    }
}
