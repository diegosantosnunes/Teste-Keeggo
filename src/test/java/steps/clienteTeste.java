package steps;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Browser;
import metodos.HomePage;
import metodos.Metodos;
import metodos.RegistrarNovoCliente;

public class clienteTeste {

	Browser browser = new Browser();
	HomePage page = new HomePage();
	Metodos metodo = new Metodos();
	RegistrarNovoCliente cadastrar = new RegistrarNovoCliente();

	Elementos el = new Elementos();

	@Given("que acesso o site {string}")
	public void que_acesso_o_site(String site) {
		browser.abrirNavegador(site);
	}

	@Given("acesso o formulario de abertura de conta")
	public void acesso_o_formulario_de_abertura_de_conta() {

		page.formularioRegistrarCliente();

	}

	@When("preencher todos os campos obrigatorios")
	public void preencher_todos_os_campos_obrigatorios() {
		cadastrar.regitrarNovoCliente(Metodos.getNome("keggo"), Metodos.getEmail(), "Teste@12345", "Teste@12345");

	}

	@When("preencher todos os campos nao obrigatorios")
	public void preencher_todos_os_campos_nao_obrigatorios() {
		cadastrar.dadosPessoais("incrid", "alvarez", "11945678976", "bahia", "rua brasil", "salvador", "06796009",
				"Brasil");
		metodo.clicar(el.getCheck(), "clicar check");

	}

	@Then("cliente cadastro com sucesso")
	public void cliente_cadastro_com_sucesso() {

		metodo.clicar(el.getBtn(), "");
		metodo.screenShot("register", "tela de cadastro");
		metodo.fecharNavegador();
		System.out.println("------------ test finish ---------");

	}
}