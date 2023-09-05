package lista3;

import java.util.Objects;

public class Exercicio3 {

	public static void main(String[] args) {
		
		// A classe java.util.Objects é uma classe utilitária introduzida no Java 7 
		// que fornece métodos estáticos para auxiliar na manipulação de objetos em Java. 
		// Algumas de suas funcionalidades incluem:

		// Verificação de igualdade: o método equals(Object a, Object b) 
		// verifica se dois objetos são iguais, mesmo se um ou ambos forem nulos. 
		
		// Hashcode seguro para nulos: o método hashCode retorna o código de hash do objeto especificado, 
		// ou zero se o objeto for nulo.		
		
		String aluno1 = "Domingos Bernardo";
		String aluno2 = "Gabriel Medina";
		String aluno3 = "Italo Ferreira";
		String aluno4 = "Domingos Bernardo";
		
		System.out.println( Objects.equals( aluno1, aluno2 ) );
		System.out.println( Objects.equals( aluno1, aluno4 ) );	
		
		System.out.println( Objects.hash( aluno1 ) );		
		System.out.println( Objects.hash( aluno2, aluno3 ) );
		
	}

}
