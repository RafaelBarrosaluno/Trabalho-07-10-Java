package trabalho;

public class Funcionario {
	private String nome;
    private int idade;
    private double salario;
    private String endereco;
    public String funcao;
    
    public Funcionario(String nome, int idade, double salario, String endereco, String funcao ) {
    	this.nome = nome;
    	this.idade = idade;
    	this.salario = salario;
    	this.endereco = endereco;
    	this.funcao = funcao;
    }
    public String getnome(){
        return nome;
    }
    public void setnome(String nome) {
        this.nome = nome;
    }
    public int getidade(){
        return idade;
    }
    public void setidade(int idade) {
        this.idade = idade;
    }
    public double getsalario(){
        return salario;
    }
    public void setsalario(double salario) {
        this.salario = salario;
    }
    public String getendereco(){
        return endereco;
    }
    public void setendereco(String endereco) {
        this.endereco = endereco;
    }
    public String getfuncao(){
        return funcao;
    }
    public void setfuncao(String funcao) {
        this.funcao = funcao;
    }
    public void cadastrar(){
        System.out.println("Funcionário cadastrado!");
    }
    public void alterar(){
        System.out.println("Funcionário alterado!");
    }
    public void excluir(){
        System.out.println("Funcionário excluido!");
    }
    public void consultar(){
        System.out.println("Detalahes do Funcionário: ");
        System.out.println("Nome: " +nome);
        System.out.println("Idade: " +idade);
        System.out.println("Salario: " +salario);
        System.out.println("Endereço: " +endereco);
        System.out.println("Função: " +funcao);
    }
}

