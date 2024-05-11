package competec.aula2_loops;
		// crie um loop que atualize o valor de soma 100 vezes
		// imprima o valor da soma 
public class Desafio11 {
	public static void main(String[] args) {
		int soma = 0; // inicialmente a soma é zero.
		int i= 0;

		while(i <= 100){
			soma = soma + i;
			i++;	
		}	
		System.out.println(soma);
	}
}
