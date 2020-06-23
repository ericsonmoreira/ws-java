public class Main {

	public static void main(String[] args) {
		
		Personagem gerreiro = new Personagem("Connan", 50, 50, 0, 10);
		
		Personagem mostro = new Personagem("Morcego", 10, 10, 0, 0);
		
		System.out.println("Antes do ataque");
		System.out.println(gerreiro);
		System.out.println(mostro);
		
		gerreiro.atacar(mostro); // ataque aqui.
		
		System.out.println("Depois do ataque");
		System.out.println(gerreiro);
		System.out.println(mostro);
		
		// Scanner para ler o que o usuário digita.
//		Scanner scanner = new Scanner(System.in);
//		
//		Personagem personagem;
//		
//		System.out.println("Digite o nome do personagem:");
//		String nome = scanner.nextLine();
//		
//		System.out.println("Digite o ataque do personagem:");
//		int ataque = scanner.nextInt();
//		
//		System.out.println("Digite a defesa do personagem:");
//		int defesa = scanner.nextInt();
//		
//		System.out.println("Digite a magia do personagem:");
//		int magia = scanner.nextInt();
//		
//		System.out.println("Digite a inteligencia do personagem:");
//		int inteligencia = scanner.nextInt();		
//		
//		personagem = new Personagem(nome, ataque, defesa, magia, inteligencia);
//		
//		System.out.println(personagem);
 	}

}
