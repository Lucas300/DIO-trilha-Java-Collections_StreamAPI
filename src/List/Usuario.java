package List;

import java.util.Objects;

@SuppressWarnings("unused")
public class Usuario {
	String nome;

	Usuario(String nome){
		this.nome = nome;
	}
	//esse método vai fazer com que cada vez que chame um usuário antes do nome apareça Meu nome é...nome
	public String toString() {
		return "Meu nome é "+ this.nome +".";	
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome);
	}
	
	
}
