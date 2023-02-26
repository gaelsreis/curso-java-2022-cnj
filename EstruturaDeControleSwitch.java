public class EstruturaDeControleSwitch {
    public static void main(String[] args) {
        // 1 Domingo / 2 Segunda / 3 Terça / 4 Quarta / 5 Quinta / 6 Sexta / 7 Sábado
        
        int DiaSemana = 1;
        
        // Terça
        switch (DiaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido para o dia da semana!");
        }
        String Pergunta = "Outra coisa";

        switch (Pergunta) {
            case "Sim":
                System.out.println("Resposta verdadeira");
                break;
            case "Não":
                System.out.println("Resposta falsa");
                break;
            default:
                System.out.println("Resposta inválida");
        }
    }
}