public class EstruturaDeControleTernario {
    public static void main(String[] args) {
        int A = 0, B = 100;
        String ResultadO;
        boolean Resultado;
        // > / < / >= / <= / !=

        ResultadO = (A > B) ? "Maior" : (A < B) ? "Menor" : "Igual";
        System.out.println(ResultadO);
        ResultadO = (A < B) ? "Menor" : "Maior";
        System.out.println(ResultadO);
        ResultadO = (A >= B) ? "Maior" : "Menor";
        System.out.println(ResultadO);
        ResultadO = (A <= B) ? "Menor" : "Maior";
        System.out.println(ResultadO);
        ResultadO = (A != B) ? "Sim" : "Não";
        System.out.println(ResultadO);
    }
}