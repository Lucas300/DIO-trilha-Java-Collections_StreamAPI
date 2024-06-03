package List.Pessoa;

public class Program {
	public static void main(String[] args) {
		OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa(null);
		ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
		ordenacaoPessoa.adicionarPessoa("Nome 2", 30, 1.80);
		ordenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.70);
		ordenacaoPessoa.adicionarPessoa("Nome 4", 17, 1.56);
		
		System.out.println("Lista normal");
		System.out.println(ordenacaoPessoa.pessoaList);
		System.out.println("Lista por idade");
		System.out.println(ordenacaoPessoa.ordernarPorIdade());
		System.out.println("Lista altura");
		System.out.println(ordenacaoPessoa.ordernarPorAltura());
	}
}
