public class ComandoDoWhile {
    public static void main(String[] args) {
        //do while sintaxe

        int A = 1, Resultado = 0, B = 1;

        do { // inicio da estrutura
        
        System.out.println("Valor de A: " + A); // comandos que serão repetidos
        A++;
        // loop infinito

        } while (A <= 10); // teste lógico ou critério ou pergunte

        do { // primeiro loop
            do { // segundo loop
            Resultado = A * B;
            System.out.println(B + " X " + A + " = " + Resultado);
            A++;
            } while (A <= 10);
            A = 1;
            System.out.println("Fim da tabuada: " + B);
            B++;
        } while (B <= 10);
    }
}