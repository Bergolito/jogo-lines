package br.com.app.lines;

public enum Cores {

	AZU("AZ","AZUL"),
	AMA("AM","AMARELO"),
	CIA("CI","CIANO"),
	LAR("LA","LARANJA"),
	VDE("VD","VERDE"),
	VME("VM","VERMELHO");
	
	private String codigo;
	private String nome;
	
	private Cores(String c, String n){
		this.codigo = c;
		this.nome = n;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}
	
	
}
