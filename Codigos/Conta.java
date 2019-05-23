public interface Conta{
	//quantidade de contas de x tipo
	public int getQuantidade();

	//Codigo da conta
	public String getCodigoConta();
	public void setCodigoConta(String codigoConta);

	//Dono da conta
	public Cliente getDono();
	public void setCliente(Cliente dono);

	//Agencia responsavel pela conta
	public Agencia getAgenciaResponsavel();
	public void setAgenciaResponsavel(Agencia agenciaResponsavel);

	//montante da conta
	public double getMontante();
	public void setMontante(double montante);

	//data de criaçao da conta
	public Data getDataCriacao();
	public void setDataCriacao(Data dataCriacao);
}