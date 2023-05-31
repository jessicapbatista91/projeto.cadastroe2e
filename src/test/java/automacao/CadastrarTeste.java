package automacao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementos.Elementos;
import metodos.Metodos;

public class CadastrarTeste {
	
	Metodos metodo = new Metodos();
	Elementos el =new Elementos();
	
	@Before
	public void executaAntesDoTeste() {
		metodo.abrirNavegador();
		metodo.clicar(el.btnCadastrar);
		metodo.escrever(el.nome, "Jessica");
		metodo.escrever(el.sobrenome, "Batista");
		metodo.escrever(el.usuario, "jessica_batista");
		metodo.escrever(el.senha, "123456");
		metodo.escrever(el.email, "teste@teste");
		metodo.escrever(el.dataNasc, "19/06/1991");
		metodo.clicar(el.cadastrar);
		metodo.validarTextoAlert("Cadastro realizado!");
	}
	
	@After
	public void executaDepoisDoTeste() {
		//metodo.fecharNavegador();
	}
	
	@Test
	public void cadastrarUsuario() {
		 
	}
	
	public void cadastrarDadosEmBranco() {
		
	}
	
	public void cadastrarDadosInvalidos() {
		
	}

}
