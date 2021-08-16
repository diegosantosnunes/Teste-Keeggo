package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Metodos extends Browser {
	
	

		/**
		 * Metodo para clicar em um elemento web
		 * 
		 * @author soldado
		 * @param elemento
		 * @param passo
		 */
		public void clicar(By elemento, String passo) {
			try {
				driver.findElement(elemento).click();
			} catch (Exception e) {
				System.err.println("-------- error ao clicar -------" + passo);
			}

		}

		/**
		 * Metodo para clicar informando um texto especifico e uma tag
		 * 
		 * @author soldado
		 * @param texto
		 * @param tag
		 * @param passo
		 */
		public void clicarPorTexto(String tag, String texto, String passo) {
			try {
				Thread.sleep(3000);
				driver.findElement(By.xpath("//" + tag + "[text()=\"" + texto + "\"]")).click();
			} catch (Exception e) {
				System.err.println("-------- error ao clicar por texto -------" + passo);
			}

		}

		/**
		 * Gerador de nome com Keeggo e mais 3 letras aleatorias
		 * 
		 * @author soldado
		 * @return
		 */
		public static String getNome(String nome) {
			String geradorNome = RandomStringUtils.randomAlphabetic(4);
			return nome + geradorNome;
		}

		/**
		 * Gerador de email com Keeggo e mais 3 letras aleatorias
		 * 
		 * @author soldado
		 * @return
		 */
		 public static String getEmail() {
			String geradorEmail = RandomStringUtils.randomAlphabetic(5);
			return geradorEmail + "@keeggo.com";
		}

		/**
		 * Metodo para escrever um texto
		 * 
		 * @author soldado
		 * @param elemento
		 * @param texto
		 * @param passo
		 */
		public void escrever(By elemento, String texto, String passo) {
			try {
				// Thread.sleep(10);
				driver.findElement(elemento).sendKeys(texto);
			} catch (Exception e) {
				System.err.println("-------- error ao escrever -------" + passo + " " + e.getMessage());
			}

		}

		/**
		 * Metodo para tirar screenshot da tela
		 * 
		 * @author soldado
		 * @author escrever o seu nome aqui
		 * @param nome
		 */
		public void screenShot(String nome, String passo) {
			try {
				TakesScreenshot scrShot = ((TakesScreenshot) driver);
				File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
				File destFile = new File("./Evidencias/" + nome + ".png");
				FileUtils.copyFile(scrFile, destFile);
			} catch (Exception e) {
				System.out.println("----- error no screenShot -----" + passo + " " + e.getMessage());
			}

		}

		/**
		 * Metodo para fechar a pagina web
		 * 
		 * @author soldado
		 */

		public void fecharNavegador() {
			driver.quit();

		}

		/**
		 * Metodo para validar se dois textos s�o iguais
		 * 
		 * @author soldado
		 * @param elemento
		 * @param textoEsperado
		 * @param passo
		 */
		public void validarTexto(String textoEsperado, By elemento, String passo) {
			try {
				/// Thread.sleep(3000);
				String textoCapturado = driver.findElement(elemento).getText();
				assertEquals(textoEsperado, textoCapturado);
			} catch (Exception e) {
				System.err.println("-------- error ao validar texto -------" + passo + " " + e.getMessage());
			}

		}
	}
	
	


