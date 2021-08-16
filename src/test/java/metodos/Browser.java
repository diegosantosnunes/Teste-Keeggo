package metodos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	
	
	 static WebDriver driver;
		
		/**
		 * metodo para abrir Navegador CHROME
		 * @author soldado
		 * @param site
		 * @
		 */
		public void abrirNavegador(String site) {
			try {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
			} catch (Exception e) {
			System.err.println("------- error ao abrir navegador -------" + e.getMessage());
			
			}
		}
}	
		


