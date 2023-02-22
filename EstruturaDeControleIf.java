/* Média de 4 notas com if, respondendo aprovado >= 7 > reprovado > 4 > recuparação */
public class EstruturaDeControleIf {
    public static void main(String[] args) {
        
        String Aluno = "Luciano Alonso";
        double Nota1 = 10;
        double Nota2 = 10;
        double Nota3 = 0;
        double Nota4 = 10;
        double Media = (Nota1 + Nota2 + Nota3 + Nota4)/4;
        String DiaSemana = "Dois";

        switch (DiaSemana.toUpperCase()) {
            case "Um":
                System.out.println("Domingo");
                break;
            case "Dois":
                System.out.println("Segunda-Feira");
                break;
            default:
                System.out.println("Sábado");
        }

        //Aprovado / Reprovado / Recuperação
        if(Media >= 7) {
            System.out.println("Aluno: " + Aluno + " Média: " + Media + " Aprovado");
        } else if(Media < 4){
            System.out.println("Aluno: " + Aluno + " Média: " + Media + " Reprovado");
        } else {
            System.out.println("Aluno: " + Aluno + " Média: " + Media + " Recuperação");
        }

        String Teste = "Sim";
        if(Teste.equalsIgnoreCase("Sim")) {
            System.out.println("Verdade");
        } else {
            System.out.println("Falsidade");
        }
    }
}