package com.formulario.UserInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://178.128.77.104/Softesting/Frontend/Caso1.html")


public class PaginaPrinFormularioPage extends PageObject {

    public static final Target TXT_TU_NOMBRE= Target.the("ingresa el nombre del usuario").
            located(By.xpath("//input[@id = 'nombre']"));

    public static final Target VALIDACION_NOMBRE_OK= Target.the("visualizar icono ok en campo nombre").
            located(By.xpath("//i[@class='formulario__validacion-estado far fa-check-circle']"));

    public static final Target TXT_EMAIL= Target.the("ingresa el EMAIL del usuario").
            located(By.xpath("//input[@name = 'email']"));

    public static final Target VALIDACION_EMAIL_ERROR= Target.the("visualizar icono erro campo email").
            located(By.xpath("//i[@class='far formulario__validacion-estado fa-times-circle']"));

    public static final Target VALIDACION_ASUNTO_OK= Target.the("visualizar icono ok campo asunto").
            located(By.xpath("//div[@id='grupo__asunto']/div/i[@class='far formulario__validacion-estado fa-check-circle']"));

    public static final Target VALIDACION_BARRIO= Target.the("visualizar icono ok campo BArrio").
            located(By.xpath("//i[@class='far formulario__validacion-estado fa-check-circle']"));

    public static final Target LABEL_BARRIO= Target.the("ver campo el barrio ").
            located(By.xpath("//div[@id='grupo__barrio']/label"));

    public static final Target LABEL_MENSAJE= Target.the("ver el campo mensaje").
            located(By.xpath("//div/label[.='Mensage:']"));

    public static final Target TXT_BARRIO= Target.the("ingresa el barrio del usuario").
            located(By.xpath("//input[@name='barrio']"));

    public static final Target TXT_ASUNTO= Target.the("ingresa el barrio del usuario").
            located(By.xpath("//input[@name='asunto']"));

    public static final Target TXT_MENSAJE= Target.the("ingresa el barrio del usuario").
            located(By.xpath("//textarea[@name='Mensaje']"));


}
