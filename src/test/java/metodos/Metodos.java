package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Metodos  {
	
WebDriver driver;

public void abrirNavegador() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Usu%C3%A1rio/OneDrive/%C3%81rea%20de%20Trabalho/gravacao_bora/index.html");
   }
public void clicar(By elemento) {
	driver.findElement(elemento).click();
	
}

public void escrever(By elemento, String texto) {
	driver.findElement(elemento).sendKeys(texto);
}

public void validarTextoAlert(String textoEsperado) {
	Alert alert = driver.switchTo().alert();
	String textoAlert =  alert.getText();
	assertEquals(textoEsperado, textoAlert);
} 

public void fecharNavegador() {
	driver.quit();
}

}
