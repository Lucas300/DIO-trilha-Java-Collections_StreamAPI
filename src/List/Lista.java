package List;

import java.util.ArrayList;

@SuppressWarnings("unused")
public class Lista {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		//ou podemos usar List no começo
		ArrayList<Usuario> lista = new ArrayList<>();
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		


		//ou podemos fazer tudo em uma linha só
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3).nome);
		
		//podemos excluir pelo indice ou pelo objeto
		lista.remove(1);
		lista.remove("Manu");
		// lista.remove(u1);//excluira o objeto u1
		
		//temo duas  maneiras de verificar se o elemento esta na lista,
		//pelo objeto e pelo valor do Elemento na list
		System.out.println(lista.contains("Manu")); //excluira todos as Manus
		System.out.println(lista.contains(u1));
		
		
		for (Usuario usuario : lista) {
			System.out.println(usuario.nome);
		}
	}

}
