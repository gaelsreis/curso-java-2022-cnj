/* Tabuada de multiplicação com while utilizando equalsIgnoreCase */

import javax.swing.JOptionPane;

public class ComandoWhile {
    public static void main(String[] args) {

        int A = 1, Resultado = 0;
        int B = 1;
        while (A <= 10) {//condição
            System.out.println(A); //mostrando o valor de A
            A++; //incremento
        } 
        while (A <= 10) {
            while (B <= 10) {// condição
                Resultado = B + A; //instrução matemática
                //instrução de impressão
                System.out.println(B + " X " + A + " = " + Resultado);
                B++; //incremento
            }
            B = 1;
            System.out.println("Fim tabuada :" + A);
            A++;
        }
        String Resposta = "Sim";
        int Contador = 0;
        while(Resposta.equalsIgnoreCase("Sim")){
            System.out.println("Respondeu Sim");
            Contador++;
            Resposta = JOptionPane.showInputDialog("Sim ou Não?");
        }
        System.out.println(Contador);
    }
}