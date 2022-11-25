package academia;

public class Academia {
	private String nome;
	private String CNPJ;
	private int UF;
	private String CEP;
	private Contato contato;
	private Endereco endereco;
	private RedeSocial redeSocial;
	
	public Academia(String nome, String CNPJ, Contato contato,Endereco endereco) {
		this.nome = nome;
		this.CNPJ = CNPJ;
		this.contato = contato;
		this.endereco = endereco;
	}
	
	public void setRedeSocial(RedeSocial redeSocial) {
		this.redeSocial = redeSocial;
	}
	
	public RedeSocial getRedeSocial() {
		return redeSocial;
	}
	
	
}


