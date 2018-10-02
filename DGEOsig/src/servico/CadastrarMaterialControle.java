package servico;

import objeto.modelo.Material;

public class CadastrarMaterialControle {

	public void cadastrar(String nome, String numeroTombamento, String serie, String descricao) {
		
		System.out.println("material cadastrado!");
		
	}
	public Material busca(String chave) {
		return new Material("1111", "Martelo");// TESTE
	}
	public void remover(String chave) {
		System.out.println("Removeu Material");
	}

}
