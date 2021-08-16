package steps;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.HomePage;
import metodos.Metodos;
import metodos.RegistrarNovoCliente;

public class Teste {
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();
	HomePage page = new HomePage();
	RegistrarNovoCliente cadastrar = new RegistrarNovoCliente();

	@Given("acessar a tela de login")
	public void acessar_a_tela_de_login() {
		metodo.clicar(el.menuUser, "");

	}

	@When("preencher login e senha")
	public void preencher_login_e_senha() {
		cadastrar.login("keggo", "Teste@12345");
		metodo.clicar(el.getBtn(), "");
		metodo.clicar(el.getLembreMe(), "");
		metodo.clicar(el.getSignin(), "");

	}

	@Then("login com sucesso")
	public void login_com_sucesso() {
		metodo.screenShot("login", "Tela de login");
		metodo.fecharNavegador();

	}

}
