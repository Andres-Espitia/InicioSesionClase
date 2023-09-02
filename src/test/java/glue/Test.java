package glue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    private ChromeDriver driver;
    private WebElement usuario;
    private WebElement password;
    private WebElement boton;
    private String usu,pass;
    @Given("el usuario se encuentra en la pagina principal")
    public void el_usuario_se_encuentra_en_la_pagina_principal() {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ZIP-B205-E-018\\IdeaProjects\\InicioSesionClase\\src\\test\\java\\resource\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/v1/");

        driver.manage().window().maximize();
    }
    @When("el ingresa usuario y contraseña")
    public void el_ingresa_usuario_y_contraseña() {
        usu = "standard_user";
        pass = "secret_sauce";

        usuario = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        usuario.sendKeys(usu);
        password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys(pass);

        boton = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
        boton.click();


    }
    @Then("deberia hacer proceso de login")
    public void deberia_hacer_proceso_de_login() {
    }

}
