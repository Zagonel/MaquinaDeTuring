package maquinadeturing;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        String palavra;
        palavra = JOptionPane.showInputDialog(null, "Digite a palavra:  ");      
        palavra = palavra.concat(Character.toString('F'));
        
        MaquinaDeTuring.iniciaMaquina(palavra);        
    }    
    
}
