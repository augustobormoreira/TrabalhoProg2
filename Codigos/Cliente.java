public interface Cliente{
	//nome
	public String getNome();
	public void setNome(String nome);
	
	//endereco
	public Endereco getEndereco();
	public void setEndereco(Endereco endereco);
	
	//data nascimento
	public Data getDataNascimento();
	public void setDataNascimento(Data dataNascimento);

	//CPF
	public String getCpf();
	public void setCpf(String cpf);

	//Tipo do Cliente
	public String getTipoCliente();
	public void setTipoCliente(String tipoCliente);

	//Mostrar todas as contas do clinete
	public void displayContas();
}