package objeto.modelo;

public abstract class discente extends Pessoa{
	String matricula;
	public discente(String mat, String nome, String email) {
		super(nome, email);
		matricula = mat;
	}@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMatricula() {
		return matricula;
	}
}
