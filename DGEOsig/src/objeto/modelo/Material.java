package objeto.modelo;

public class Material {
	String nome;
	String id; // numero de tombamento
	String serial; // 
	String descricao;
	int quantidade;
	
	public Material(String id, String nome) {
		this.id = id;
		this.nome = nome;
		quantidade++;
	}
	public Material(String nome, String id, String serial, String descricao, int quantidade) {
		this.nome = nome;
		this.id = id;
		this.serial = serial;
		this.descricao = descricao;
		this.quantidade = quantidade;
	}
	// GETTERS
	public String getNome() {
		return nome;
	}
	public String getId() {
		return id;
	}
	public String getSerial() {
		return serial;
	}
	public String getDescricao() {
		return descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	// SETTERS
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	public void setSerial(String serial) {
//		this.serial = serial;
//	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	// INCREMENTA A QUANTIDADE 
	public void add(int quantidade) {
		this.quantidade++; 
	}
	
	// 
}
