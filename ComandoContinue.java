public class ComandoContinue {
    public static void main(String[] args) {
        //while - for - do while

        //while
        int A = 1;
        while (A <= 10) {
            if (A == 2) {
                A++;
                continue;
            }
            if (A == 7) {
                A++;
                continue;
            }
            if (A == 9) {
                A++;
                continue;
            }
            System.out.println("Valor de A: " + A);
            A++;
        }

        System.out.println("For");
        // Estrutura de repetição for (para)
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println("Valor de i: " + i);
        }

        System.out.println("Do While");
        //do while
        int B = 1;
        do {
            if (B < 6) {
                B++;
                continue;
            }
            System.out.println("Valor de B: " + B);
            B++;
        } while (B <= 10);
    }
}