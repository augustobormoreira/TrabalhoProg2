import java.util.*;
public class Banco{
		Scanner teclado;
		ArrayList<Agencia> agencias;
		ArrayList<Cliente> clientes;
		Agencia facilOnline;

		private String rua, bairro, numeroCasa, cep, pais, cidade;	
		private int dia, mes, ano;

		//cadastro de clientes
		private Cliente coringa;
		private String nome, cpf, tipoCliente;
		private Data dataCliente;
		private Endereco enderecoCliente;

		//cadastro de agencias
		private Agencia agenciaTemp;
		private String numeroAgencia, nomeAgencia;
		private Endereco localizacao;

		//cadastro de contas
		private Conta temp;
		private String codigoConta, tipoConta;
		private Data dataCriacao;
		private Agencia agenciaReponsavel;
		private double montante;
		private int sizeContas;

		public Banco(){
			teclado = new Scanner(System.in);
			agencias = new ArrayList<Agencia>();
			clientes = new ArrayList<Cliente>();
			facilOnline = new Agencia("22222", null, null);
			sizeContas = 0;
		}

		public void addCliente(){
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
					System.out.println("Este tipo de cliente " + tipoCliente + " nao existe na nossa database!");
				}
		}


		public void addAgencia(){
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
		}

		public void addConta(){
			boolean canContinue = false, desejaMontante;
			String deseja;
			System.out.println("Conta Facil/Corrente/Poupanca?");
			tipoConta = teclado.nextLine();
			if(tipoConta.equals("Facil")){
				System.out.println("Informe o cpf do cliente:");
				cpf = teclado.nextLine();
				for(int i = 0; i < clientes.size() && !canContinue; i++){
					if(clientes.get(i).getCpf().equals(cpf)){
						canContinue = true;
					}
				}

				if(!canContinue){
					System.out.println("Cliente nao existe na nossa database, por favor cadastre um novo com o cpf digitado:");
					addCliente();
				}

				System.out.println("Informe a data de hoje:");
				dia = teclado.nextInt();
				mes = teclado.nextInt();
				ano = teclado.nextInt();
				teclado.nextLine();
				dataCriacao = new Data(dia,mes,ano);

				System.out.println("A Conta Facil ser cadastrada na agencia on-line de codigo 22222");


				System.out.println("Informe o numero da conta:");
				codigoConta =teclado.nextLine();

				System.out.println("Deseja depositar algo na conta ou nao?(S/N)");
				deseja = teclado.nextLine();
					if(deseja.equals("S")){
						System.out.println("Informe o montante:");
						montante = teclado.nextDouble();
						teclado.nextLine();
						desejaMontante = true;
					}else{
						desejaMontante = false;
					}
				

				for(int i = 0; i < agencias.size(); i++){
					if(agencias.get(i).getNumeroAgencia().equals(numeroAgencia)){
						for(int j = 0; j < clientes.size(); j++){
							if(clientes.get(j).getCpf().equals(cpf) && desejaMontante){
								temp = new CFacil(codigoConta, clientes.get(j), facilOnline, dataCriacao, montante);
								sizeContas++;
							}
							else if(clientes.get(j).getCpf().equals(cpf)){
								temp = new CFacil(codigoConta, clientes.get(j), facilOnline, dataCriacao);	
								sizeContas++;
							}
						}
					}
				}

			}
			else if(tipoConta.equals("Corrente")){
				System.out.println("Informe o cpf do cliente:");
				cpf = teclado.nextLine();
				for(int i = 0; i < clientes.size() && !canContinue; i++){
					if(clientes.get(i).getCpf().equals(cpf)){
						canContinue = true;
					}
				}

				if(!canContinue){
					System.out.println("Cliente nao existe na nossa database, por favor cadastre um novo com o cpf digitado:");
					addCliente();
				}

				System.out.println("Informe a data de hoje:");
				dia = teclado.nextInt();
				mes = teclado.nextInt();
				ano = teclado.nextInt();
				teclado.nextLine();
				dataCriacao = new Data(dia,mes,ano);

				System.out.println("Informe o numero da agencia:");
				numeroAgencia = teclado.nextLine();


				System.out.println("Informe o numero da conta:");
				codigoConta =teclado.nextLine();

				System.out.println("Deseja depositar algo na conta ou nao?(S/N)");
				deseja = teclado.nextLine();
					if(deseja.equals("S")){
						System.out.println("Informe o montante:");
						montante = teclado.nextDouble();
						teclado.nextLine();
						desejaMontante = true;
					}else{
						desejaMontante = false;
					}
				

				for(int i = 0; i < agencias.size(); i++){
					if(agencias.get(i).getNumeroAgencia().equals(numeroAgencia)){
						for(int j = 0; j < clientes.size(); j++){
							if(clientes.get(j).getCpf().equals(cpf) && desejaMontante){
								temp = new CCorrente(codigoConta, clientes.get(j), agencias.get(i), dataCriacao, montante);
								agencias.get(i).addContas(temp);
								sizeContas++;
							}
							else if(clientes.get(j).getCpf().equals(cpf)){
								temp = new CCorrente(codigoConta, clientes.get(j), agencias.get(i), dataCriacao);
								agencias.get(i).addContas(temp);	
								sizeContas++;
							}
						}
					}
				}
			}
			else if(tipoConta.equals("Poupanca")){
				System.out.println("Informe o cpf do cliente:");
				cpf = teclado.nextLine();
				for(int i = 0; i < clientes.size() && !canContinue; i++){
					if(clientes.get(i).getCpf().equals(cpf)){
						canContinue = true;
					}
				}

				if(!canContinue){
					System.out.println("Cliente nao existe na nossa database, por favor cadastre um novo com o cpf digitado:");
					addCliente();
				}

				System.out.println("Informe a data de hoje:");
				dia = teclado.nextInt();
				mes = teclado.nextInt();
				ano = teclado.nextInt();
				teclado.nextLine();
				dataCriacao = new Data(dia,mes,ano);

				System.out.println("Informe o numero da agencia:");
				numeroAgencia = teclado.nextLine();


				System.out.println("Informe o numero da conta:");
				codigoConta =teclado.nextLine();

				System.out.println("Deseja depositar algo na conta ou nao?(S/N)");
				deseja = teclado.nextLine();
					if(deseja.equals("S")){
						System.out.println("Informe o montante:");
						montante = teclado.nextDouble();
						teclado.nextLine();
						desejaMontante = true;
					}else{
						desejaMontante = false;
					}
				

				for(int i = 0; i < agencias.size(); i++){
					if(agencias.get(i).getNumeroAgencia().equals(numeroAgencia)){
						for(int j = 0; j < clientes.size(); j++){
							if(clientes.get(j).getCpf().equals(cpf) && desejaMontante){
								temp = new CPoupanca(codigoConta, clientes.get(j), agencias.get(i), dataCriacao, montante);
								agencias.get(i).addContas(temp);
								sizeContas++;	
							}
							else if(clientes.get(j).getCpf().equals(cpf)){
								temp = new CPoupanca(codigoConta, clientes.get(j), agencias.get(i), dataCriacao);	
								agencias.get(i).addContas(temp);	
								sizeContas++;
							}
						}
					}
				}
			}
			else{
				System.out.println("Nao possuimos este tipo de conta " + tipoConta +"!");
			}
		}

		public void saque(){

		}

		public int getSizeAgencias(){
			return agencias.size();
		}

		public int getSizeClientes(){
			return clientes.size();
		}

		public int getSizeContas(){
			return sizeContas;
		}

}