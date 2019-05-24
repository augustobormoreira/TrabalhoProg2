import java.util.*;
public class ClienteTrad implements Cliente{
	private String nome, cpf, tipoCliente;
	private Data dataNascimento;
	private Endereco endereco;
	private ArrayList<Conta> contas;

	public ClienteTrad(String nome, String cpf, String tipoCliente, Endereco endereco, Data dataNascimento){
		this.nome = nome;
		this.cpf = cpf;
		this.tipoCliente = tipoCliente;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.contas = new ArrayList<Conta>();
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getCpf(){
		return cpf;
	}

	public void setCpf(String cpf){
		this.cpf = cpf;
	}

	public String getTipoCliente(){
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente){
		this.tipoCliente = tipoCliente;
	}

	public Endereco getEndereco(){
		return endereco;
	}

	public void setEndereco(Endereco endereco){
		this.endereco = endereco;
	}

	public Data getDataNascimento(){
		return dataNascimento;
	}

	public void setDataNascimento(Data dataNascimento){
		this.dataNascimento = dataNascimento;
	}

	public void displayContas(){
		int i = 0;
		while(i < contas.size()){
			System.out.println(contas.get(i).toString());
		}
	}
}