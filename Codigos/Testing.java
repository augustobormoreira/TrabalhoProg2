public class Testing{
	public static void main(String [] args){
		Endereco principal = new Endereco("Caranda", "Vila Piratininga", "35", "79080-660", "Brasil", "Campo Grande");
		Data dataPrincipal = new Data(12, 04, 1997);
		Cliente cliente = new ClienteTrad("Alphonse Elric", "123456", "Tradicional", principal, dataPrincipal);


		System.out.println(cliente.getNome());
	}
}