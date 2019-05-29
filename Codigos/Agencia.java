import java.util.*;
public class Agencia{
	private String numeroAgencia, nome;
	private Endereco localizacao;
	private ArrayList<Conta> contas;

	public Agencia(String numeroAgencia,String nome, Endereco endereco){
		this.numeroAgencia = numeroAgencia;
		this.nome = nome;
		this.localizacao = endereco;
		contas = new ArrayList<Conta>();
	}

	public String getNumeroAgencia(){
		return numeroAgencia;
	}

	public void setNumeroAgencia(String numeroAgencia){
		this.numeroAgencia = numeroAgencia;
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public Endereco getEndereco(){
		return localizacao;
	}

	public void setEndereco(Endereco endereco){
		this.localizacao = endereco;
	}

	public ArrayList<Conta> getContas(){
		return contas;
	}

	public void addContas(Conta conta){
		contas.add(conta);
	}
}