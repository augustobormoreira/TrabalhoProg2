import java.util.*;
public class SistemaCentral{
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);

		Banco ufms = new Banco();
		int menu;


		do{
		System.out.println("Numero de Agencias: " + ufms.getSizeAgencias());
		System.out.println("Numero de Clientes: " + ufms.getSizeClientes());
		System.out.println("Numero de Contas: " + ufms.getSizeContas());
		System.out.println("Bem vindo ao Sistema Central do Banco do Eden! O que desejas fazer?");
		System.out.println("1 - Cadastrar um Cliente");
		System.out.println("2 - Cadastrar uma Agencia");
		System.out.println("3 - Abertura de Conta");
		System.out.println("4 - Sacar");
		System.out.println("5 - Depositar em uma conta");
		System.out.println("6 - Transferir");
		System.out.println("7 - Solicitar um Emprestimo");
		System.out.println("8 - Gerar Extratos");
		System.out.println("9 - Gerar Relatorios");
		System.out.println("10 - Virada do Mes");
		menu = teclado.nextInt();
		teclado.nextLine();

		switch(menu){

			//cadastra 1 cliente
			case 1:
				ufms.addCliente();
			break;

			//cadastra 1 aegncia
			case 2:
				ufms.addAgencia();
			break;

			//cadastro de contas
			case 3:
			     ufms.addConta();
            break;

            case 4:
            	ufms.saque();
            break;  

		}


		}while(menu!=0);


	}
}