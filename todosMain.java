package br.com.generation.Herança;

public class todosMain {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		
		dog.setNome("dog");
	    dog.setIdade("2anos");
	    
	System.out.println("====================ANIMAIS========================="); 
	System.out.println("====================================================");
	System.out.println("O NOME DO CACHORRO É:" + dog.getNome());
	System.out.println("A IDADE DO CACHORRO É:" + dog.getIdade());
	System.out.println("====================================================");
	dog.correr();
	System.out.println("====================================================");
	Preguiça laziness = new Preguiça();
	
	laziness.setNome("laziness");
	laziness.setIdade("10anos ");
	
	System.out.println("O NOME DA PREGUIÇA É:" + laziness.getNome());
	System.out.println("A IDADE DA PREGUIÇA É:" + laziness.getIdade());
	System.out.println("====================================================");
	laziness.correr();
	System.out.println("====================================================");
	
	Cavalo horse = new Cavalo();
	
	horse.setNome("horse ");
	horse.setIdade("3anos ");
	
	System.out.println("O NOME DO CAVALO É:" + horse.getNome());
	System.out.println("A IDADE DO CAVALO É:" + horse.getIdade());
	System.out.println("====================================================");
	horse.correr();
	System.out.println("====================================================");
	
	
	}
}
