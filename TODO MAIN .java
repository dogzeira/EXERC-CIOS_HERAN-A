package br.com.generation.Heran�a;

public class todosMain {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		
		dog.setNome("dog");
	    dog.setIdade("2anos");
	    
	System.out.println("====================ANIMAIS========================="); 
	System.out.println("====================================================");
	System.out.println("O NOME DO CACHORRO �:" + dog.getNome());
	System.out.println("A IDADE DO CACHORRO �:" + dog.getIdade());
	System.out.println("====================================================");
	dog.correr();
	System.out.println("====================================================");
	Pregui�a laziness = new Pregui�a();
	
	laziness.setNome("laziness");
	laziness.setIdade("10anos ");
	
	System.out.println("O NOME DA PREGUI�A �:" + laziness.getNome());
	System.out.println("A IDADE DA PREGUI�A �:" + laziness.getIdade());
	System.out.println("====================================================");
	laziness.correr();
	System.out.println("====================================================");
	
	Cavalo horse = new Cavalo();
	
	horse.setNome("horse ");
	horse.setIdade("3anos ");
	
	System.out.println("O NOME DO CAVALO �:" + horse.getNome());
	System.out.println("A IDADE DO CAVALO �:" + horse.getIdade());
	System.out.println("====================================================");
	horse.correr();
	System.out.println("====================================================");
	
	
	}
}
