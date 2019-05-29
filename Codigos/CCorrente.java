public class CCorrente implements Conta{
	public static int quantidadeCCorrente = 0;
	private String codigoConta;
	private Cliente dono;
	private Agencia agenciaResponsavel;
	private Data dataCriacao;
	private double montante;

	public CCorrente(String codigoConta, Cliente dono, Agencia agenciaResponsavel, Data dataCriacao, Double montante){
		this.codigoConta = codigoConta;
		this.dono = dono;
		this.agenciaResponsavel = agenciaResponsavel;
		this.dataCriacao = dataCriacao;
		this.montante = montante;
		quantidadeCCorrente++;
	}

	public CCorrente(String codigoConta, Cliente dono, Agencia agenciaResponsavel, Data dataCriacao){
		this.codigoConta = codigoConta;
		this.dono = dono;
		this.agenciaResponsavel = agenciaResponsavel;
		this.dataCriacao = dataCriacao;
		this.montante = 0;
		quantidadeCCorrente++;
	}

	public int getQuantidade(){
		return quantidadeCCorrente;
	}

	public String getCodigoConta(){
		return codigoConta;
	}

	public void setCodigoConta(String codigoConta){
		this.codigoConta = codigoConta;
	}

	public Cliente getDono(){
		return dono;
	}

	public void setCliente(Cliente dono){
		this.dono = dono;
	}

	public Agencia getAgenciaResponsavel(){
		return agenciaResponsavel;
	}

	public void setAgenciaResponsavel(Agencia agenciaResponsavel){
		this.agenciaResponsavel = agenciaResponsavel;
	}

	public double getMontante(){
		return montante;
	}

	public void setMontante(double montante){
		this.montante = this.montante + montante;
	}

	public Data getDataCriacao(){
		return dataCriacao;
	}

	public void setDataCriacao(Data dataCriacao){
		this.dataCriacao = dataCriacao;
	}
}