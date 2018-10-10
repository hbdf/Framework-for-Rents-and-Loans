package objeto.modelo;

import modelo.Usuario;

public class Docente extends Usuario {
	
	
	public Docente(String siape, String cpf, String nome, String email) {
		
		super(siape, cpf, nome, email);
		
		// Docentes n�o devem ter um limite do n�mero de ferramentas solicitadas.
//		this.isLimitado = false;				
	}

}
