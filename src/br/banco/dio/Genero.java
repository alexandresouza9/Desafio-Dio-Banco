package br.banco.dio;

public class Genero {
	public static final char MASCULINO = 'M';
	public static final char FEMININO = 'F';
	
	private Character genero;
	
	public static String getNomeGenero(char genero) {
	
		switch(genero) {
		case MASCULINO:
			return "Masculino";
		case FEMININO:
			return "FEMININO";
		
			default:
				return "Desconhecido";
		}
	}
	public Genero() {}
	public Genero(char genero) {
		this.genero = genero;
	}

	public boolean isGeneroFeminino(Character genero) {
		return genero != null && genero == FEMININO;
	}
	
	public boolean isGeneroMasculino(Character genero) {
		return genero != null && genero == MASCULINO;
	}
	public boolean isEmpty() {
		return this.genero == null;
	}
	
	public Character getGenero() {
		return genero;
	}

	public void setGenero(Character genero) {
		this.genero = genero;
	}


}
