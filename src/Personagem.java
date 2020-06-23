/**
 * Classe que repesenta um pessonagem do nosso RPG.
 *
 */
public class Personagem {
	
	private String nome;
	private int ataque;
	private int defesa;
	private int magia;
	private int inteligencia;
	private int vida;
	
	// Geters and Seters
	
	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	public int getMagia() {
		return magia;
	}

	public void setMagia(int magia) {
		this.magia = magia;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getVida() {
		return vida;
	}
	
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public Personagem(String nome, int ataque, int defesa, int magia, int inteligencia) {
		this.nome = nome;
		this.ataque = ataque;
		this.defesa = defesa;
		this.magia = magia;
		this.inteligencia = inteligencia;
		this.setVida(100);
	}
	
	public void atacar(Personagem inimigo) {
		inimigo.setVida(inimigo.getVida() - this.ataque);
	}

	@Override
	public String toString() {
		return "Personagem [nome=" + nome + ", ataque=" + ataque + ", defesa=" + defesa + ", magia=" + magia
				+ ", inteligencia=" + inteligencia + ", vida=" + vida + "]";
	}

		
}
