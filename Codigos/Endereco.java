public class Endereco{
	private String rua, bairro, numeroCasa, cep, pais, cidade;

	public Endereco(String rua, String bairro, String numeroCasa, String cep, String pais, String cidade){
		this.rua = rua;
		this.bairro = bairro;
		this.numeroCasa = numeroCasa;
		this.cep = cep;
		this.pais = pais;
		this.cidade = cidade;
	}

	public String getRua(){
		return rua;
	}

	public void setRua(String rua){
		this.rua = rua;
	}

	public String getBairro(){
		return bairro;
	}

	public void setBairro(String bairro){
		this.bairro = bairro;
	}

	public String getNumeroCasa(){
		return numeroCasa;
	}

	public void setNumeroCasa(String numeroCasa){
		this.numeroCasa = numeroCasa;
	}

	public String getCep(){
		return cep;
	}

	public void setCep(String cep){
		this.cep = cep;
	}

	public String getPais(){
		return pais;
	}

	public void setPais(String pais){
		this.pais = pais;
	}

	public String getCidade(){
		return cidade;
	}

	public void setCidade(String cidade){
		this.cidade = cidade;
	}
}