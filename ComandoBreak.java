public class ComandoBreak {
	public static void main(String[] args) {
		//Comando break
		int i = 1;
		
		//Estrutura de repetição while (enquanto)
		while(i<=10) {
			System.out.println("Valor de i na iteração while: " + i);
			i++;
			if(i==7) {
					break; //parar a execução da repetição
				}
			}
		System.out.println("");
		
		//Estrutura de repetição for (para)
		for(i=1;i<=10;i++) {
			System.out.println("Valor de i na iteração for: " + i);
			if(i==9) {
				break; //parar a execução da repetição
			}
		}
		
		//Estrutura de repetição do while (faça enquanto)
		i = 1;
		do {
			System.out.println("Valor de i na iteração do while: " + i);
			i++;
			if(i==7) {
				break; //parar a execução da repetição
			}
		} while(i<=10);
	}
}