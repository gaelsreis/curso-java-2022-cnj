//package CAPITULO_6;

public class ClassesAninhadas { //Classe um
    public void ExibirClasseUm() {
        System.out.println("Instruções da classe um");
    }

    public class ClasseDois{ //Classe dois
        public void ExibirClasseDois() {
            System.out.println("Minha classe dois");
        }
        public void MetodoExibir() {
            //Chamando método pra exibir a classe dois
            this.ExibirClasseDois();
            //Chamando método pra exibir a classe um
            ClassesAninhadas.this.ExibirClasseUm();
        }
    }

    public static void main(String[] args) {
        ClassesAninhadas Obj1 = new ClassesAninhadas();
        ClassesAninhadas.ClasseDois Obj2 = Obj1.new ClasseDois();
        Obj2.MetodoExibir();
    }
}