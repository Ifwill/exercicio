package model;

public enum Sexo {
	MASCULINO("Masculino"), 
	FEMININO("Feminino"), 
	NUNHUM("Nao pretende falar");

	private String descricao;

	private Sexo(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
