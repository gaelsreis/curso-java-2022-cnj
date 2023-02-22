/* Tabuada de multiplicação com for e contador i como variável global. */
public class ComandoFor {
    public static void main(String[] args) {

        // sintaxe
        int i; //global

        for(i = 1; i <= 10; i++) {// inicio; condição; contador ou incremento
            System.out.println("Valor = " + i); // comandos do loop
        }
        //fim da repetição

        int Resultado = 0, Multiplicando = 7;
        for(i = 1; i <= 10; i++) {
            Resultado = Multiplicando * i;
            System.out.println(Multiplicando + " X " + i + " = " + Resultado);
        }

        int Resultado2 = 0, A, B;

        for(A = 1; A <= 10; A++) {
            for(B = 1; B<= 10; B++) {
                Resultado2 = B * A;
                System.out.println(A + " X " + B + " = " + Resultado2);
            }
            System.out.println("Fim tabuada do :" + A);
        }
    }
}