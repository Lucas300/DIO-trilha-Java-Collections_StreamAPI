package SET;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoConvidados {
	private Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<>();
	}
	
	public void adicionarConvidado(String nome,int codigoConvite) {
		convidadoSet.add(new Convidado(nome,codigoConvite));
	}
	
	public void removerConvidadoPorCodigoConvite(int codigo) {
		Convidado convidadoParaRemover = null;
		for (Convidado c : convidadoSet) {
			if(c.getCodigoConvite()==codigo) {
				convidadoParaRemover = c;
				break;
			}
		}
		convidadoSet.remove(convidadoParaRemover);
	}
	//verificado se existem  codigos de convites iguais
	
	
	
	public int contarConvidados() {
		return convidadoSet.size();
	}
	@Override
	public int hashCode() {
		return Objects.hash(convidadoSet);
	}

	

	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}
	
	public static void main(String[] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		System.out.println("Existem "+conjuntoConvidados.contarConvidados()+" Convidados");
		//o equal na classe impede que tenha varios convidados com o mesmo codigo
		conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
		conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
		conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
		conjuntoConvidados.adicionarConvidado("Convidado 4", 1237);
		
		System.out.println("Existem "+conjuntoConvidados.contarConvidados()+" Convidados");
		conjuntoConvidados.exibirConvidados();
		
		conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
		System.out.println("Existem "+conjuntoConvidados.contarConvidados()+" Convidados");
	
	
	}
}
