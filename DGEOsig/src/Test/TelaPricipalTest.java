package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import view.TelaPrincipalClass;

class TelaPricipalTest {

	@Test
	void abrirTelaPrincipal() throws IOException {
		TelaPrincipalClass tela = new TelaPrincipalClass();
		tela.open();
	}

}
