package task;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import appObjects.LoginAppObject;

public class Login {

	private LoginAppObject loginAppObject;
	
	public Login(WebDriver driver) {
		this.loginAppObject = new LoginAppObject(driver);		
	}
	
	public void PreencherCadastro(String nome, String email, String senha, String confirmaSenha, String telefone, String cidade) {
		this.loginAppObject.getNomeCompletoTextField().sendKeys(nome);
		this.loginAppObject.getEmailTextField().sendKeys(email);
		this.loginAppObject.getSenhaTextField().sendKeys(senha);
		this.loginAppObject.getConfirmaSenhaTextField().sendKeys(confirmaSenha);
		this.loginAppObject.getTelefoneTextField().sendKeys(telefone);	
		this.loginAppObject.getCidadeComboBox().sendKeys(Keys.ARROW_DOWN);
		this.loginAppObject.getCidadeComboBox().sendKeys(Keys.ENTER);
	}
	
	public void EnviarFormulario() {
		this.loginAppObject.getCadastrarButton().submit();
		
	}
	
}
