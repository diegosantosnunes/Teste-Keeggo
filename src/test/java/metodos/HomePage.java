package metodos;

import elementos.Elementos;

public class HomePage {
	
	  Metodos metodos = new Metodos();
	  Elementos el = new Elementos();
	  
	  public void formularioRegistrarCliente() {
		  
		  metodos.clicar(el.menuUser, "menu user");
		  metodos.clicarPorTexto("a","CREATE NEW ACCOUNT","formulario para abrir conta");
		  
		  
		  
		  
	  }

	}
