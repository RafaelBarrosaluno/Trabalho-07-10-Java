package trabalho;



public class Main {
	public static void main(String[] args) {
	Funcionario funcionario = new Funcionario("Roberto", 48, 2.500, "Rua Olinda", "Operador");
	
	funcionario.cadastrar();
	funcionario.alterar();
	funcionario.excluir();
	funcionario.consultar();
}
}
