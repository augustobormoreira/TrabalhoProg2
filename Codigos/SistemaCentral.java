import java.util.*;
public class SistemaCentral{
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		ArrayList<Agencia> agencias = new ArrayList<Agencia>();
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		int menu;

		String rua, bairro, numeroCasa, cep, pais, cidade;
		int dia, mes, ano;

		//cadastro de clientes
		Cliente coringa;
		String nome, cpf, tipoCliente;
		Data dataCliente;
		Endereco enderecoCliente;

		//cadastro de agencias
		Agencia agenciaTemp;
		String numeroAgencia, nomeAgencia;
		Endereco localizacao;


		System.out.println("Bem vindo ao Sistema Central do Banco do Eden! O que desejas fazer?");
		System.out.println("1 - Cadastrar um Cliente");
		System.out.println("2 - Cadastrar uma Agencia");
		System.out.println("3 - Sacar");
		System.out.println("4 - Depositar em uma conta");
		System.out.println("5 - Transferir");
		System.out.println("6 - Solicitar um Emprestimo");
		System.out.println("7 - Gerar Extratos");
		System.out.println("8 - Gerar Relatorios");
		System.out.println("9 - Virada do Mes");
		System.out.println("10 - Abertura de Conta");
		menu = teclado.nextInt();
		teclado.nextLine();

		switch(menu){
			case 1:
				System.out.println("Por favor informe o nome, o cpf, e o tipo do cliente a ser cadastrado:");
				nome = teclado.nextLine();
				cpf = teclado.nextLine();
				tipoCliente = teclado.nextLine();
				System.out.println("Por favor informe a data de nascimento do cliente(dd/mm/yyyy):");
				dia = teclado.nextInt();
				mes = teclado.nextInt();
				ano = teclado.nextInt();
				teclado.nextLine();
				System.out.println("Por favor informe o endereco do cliente:");
				System.out.println("Rua:");
				rua = teclado.nextLine();
				System.out.println("Bairro");
				bairro = teclado.nextLine();
				System.out.println("Numero da Casa");
				numeroCasa = teclado.nextLine();
				System.out.println("Cep");
				cep = teclado.nextLine();
				System.out.println("Pais");
				pais = teclado.nextLine();
				System.out.println("Cidade");
				cidade = teclado.nextLine();

				dataCliente = new Data(dia, mes, ano);
				enderecoCliente = new Endereco(rua, bairro, numeroCasa, cep, pais, cidade);
				if(tipoCliente.equals("Tradicional")){
					coringa = new ClienteTrad(nome, cpf, tipoCliente, enderecoCliente, dataCliente);
					clientes.add(coringa);
					coringa = null;
				}
				else if(tipoCliente.equals("Premium")){
					coringa = new ClientePremium(nome, cpf, tipoCliente, enderecoCliente, dataCliente);
					clientes.add(coringa);
					coringa = null;	
				}
				else{
					System.out.println("Este tipo de cliente " + tipoCliente + "nao existe na nossa database!");
				}
			break;


			case 2:
				System.out.println("Por favor informe o nome e o codigo da agencia a ser cadastrada: ");
				nomeAgencia = teclado.nextLine();
				numeroAgencia = teclado.nextLine();
				System.out.println("Por favor informe a localizacao da agencia:");
				System.out.println("Rua:");
				rua = teclado.nextLine();
				System.out.println("Bairro");
				bairro = teclado.nextLine();
				System.out.println("Numero da Casa");
				numeroCasa = teclado.nextLine();
				System.out.println("Cep");
				cep = teclado.nextLine();
				System.out.println("Pais");
				pais = teclado.nextLine();
				System.out.println("Cidade");
				cidade = teclado.nextLine();

				localizacao =  new Endereco(rua, bairro, numeroCasa, cep, pais, cidade);

				agenciaTemp = new Agencia(numeroAgencia, nomeAgencia, localizacao);

				agencias.add(agenciaTemp);

				agenciaTemp = null;

				break;




		}


	}
}