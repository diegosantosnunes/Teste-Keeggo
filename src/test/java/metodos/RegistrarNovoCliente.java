package metodos;

import org.openqa.selenium.By;

public class RegistrarNovoCliente {

	Metodos metodos = new Metodos();

	// Elementos da da class ClienteTeste

	By usernameRegisterPage = By.name("usernameRegisterPage");
	By emailRegisterPage = By.name("emailRegisterPage");
	By passwordRegisterPage = By.name("passwordRegisterPage");
	By confirmPasswordRegisterPage = By.name("confirm_passwordRegisterPage");
	By name = By.name("first_nameRegisterPage");
	By sobre = By.name("last_nameRegisterPage");
	By fone = By.name("phone_numberRegisterPage");
	By city = By.name("cityRegisterPage");
	By endereco = By.name("addressRegisterPage");
	By cidade = By.name("state_/_province_/_regionRegisterPage");
	By cep = By.name("postal_codeRegisterPage");
	By coutr = By.name("countryListboxRegisterPage");
	By check = By.name("i_agree");
	
	// Elementos da class de login
	
	By login = By.name("username");
	By senha = By.name("password");

	

	public void regitrarNovoCliente(String nome, String email, String senha, String confSenha) {
		metodos.escrever(this.usernameRegisterPage, nome, " preencher campo nome");
		metodos.escrever(this.emailRegisterPage, email, " preencher campo email");
		metodos.escrever(this.passwordRegisterPage, senha, " preencher campo senha");
		metodos.escrever(this.confirmPasswordRegisterPage, confSenha, " preencher confirmacao da senha");

	}

	

	public void dadosPessoais(String name, String sobre, String fone, String city, String endereco, String cidade,
			String cep, String coutr) {

		metodos.escrever(this.name, name, "");
		metodos.escrever(this.sobre, sobre, "");
		metodos.escrever(this.fone, fone, "");
		metodos.escrever(this.city, city, "");
		metodos.escrever(this.endereco, endereco, "");
		metodos.escrever(this.cidade, cidade, "");
		metodos.escrever(this.cep, cep, "");
		metodos.escrever(this.coutr, coutr, "");

	}

	

	public void login(String login, String senha) {

		metodos.escrever(this.login, login, "");
		metodos.escrever(this.senha, senha, "");

	}
}