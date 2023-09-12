package model;

public enum Sexo {
	MASCULINO("Masculino"), FEMININO("Feminino"), NUNHUM("Outros");

	private String descricao;

	private Sexo(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
