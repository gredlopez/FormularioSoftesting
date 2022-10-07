package com.formulario.StepDefinitions;

import com.formulario.Questions.*;
import com.formulario.Taks.FormuCampoEmail;
import com.formulario.Taks.FormuCampoBarrio;
import com.formulario.Taks.FormuCamposAsuntMsj;
import com.formulario.Taks.FormularioCampoNombre;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import com.formulario.UserInterface.PaginaPrinFormularioPage;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class FormularioStepD {

    @Managed(driver = "Chrome")
    private WebDriver navegador;
    private Actor gregoria = Actor.named("gregoria");
    PaginaPrinFormularioPage paginaPrinFormularioPage = new PaginaPrinFormularioPage();


    @Before
    public void configuracion() {

        gregoria.can(BrowseTheWeb.with(navegador));
    }

    @Dado("que el usuario se encuentre en el formulario de softesting")
    public void queElUsuarioSeEncuentreEnElFormularioDeSoftesting() {
        gregoria.attemptsTo(Open.browserOn(paginaPrinFormularioPage));

    }

    @Cuando("digite en el campo nombre")
    public void digiteEnElCampoNombre() {
        gregoria.attemptsTo(FormularioCampoNombre.paginaPrincipalFormulario());

    }


    @Cuando("digite en el campo Email")
    public void digiteEnElCampoEmail() {
        gregoria.attemptsTo(FormuCampoEmail.FormuCampoEmail());
    }


    @Cuando("digite en el campo barrio")
    public void digiteEnElCampoBarrio() {
        gregoria.attemptsTo(FormuCampoBarrio.FormuCampoVarrio()
        );

    }

    @Cuando("digite en los campos asunto y  mensage")
    public void digiteEnLosCamposAsuntoYMensage() {

        gregoria.attemptsTo(FormuCamposAsuntMsj.FormuCampoAsuntMensaje());
    }


    @Entonces("se puede observar el campo nombre diligenciado correctamente")
    public void sePuedeObservarElCampoNombreDiligenciadoCorrectamente() {
        gregoria.should(seeThat("el actor puede ver ", ValidacionCampoNombreOk.validar(), Matchers.equalTo(true)));
    }

    @Entonces("se puede observar el campo email diligenciado correctamente")
    public void sePuedeObservarElCampoEmailDiligenciadoCorrectamente() {
        gregoria.should(seeThat("el actor puede ver ", ValidacionCampoEmailOk.validar(), Matchers.equalTo(true)));
    }

    @Entonces("se puede observar el campo barrio diligenciado correctamente")
    public void sePuedeObservarElCampoBarrioDiligenciadoCorrectamente() {
        gregoria.should(seeThat("el actor puede ver ", ValidacionCampoBarrioOk.validarBarrio(), Matchers.equalTo(true)));

    }

    @Entonces("se puede observar el campo asunto y mensaje diligenciado correctamente")
    public void sePuedeObservarElCampoAsuntoYMensajeDiligenciadoCorrectamente() {
        gregoria.should(seeThat("el actor puede ver ",ValidacionCampoAsuntoOk.validar(), Matchers.equalTo(true)));

    }

    @Entonces("verifica que la ortografia del formulario sea correcta")
    public void verificarQueLaOrtografiaDelFormularioSeaCorrecta() {
        gregoria.should(seeThat("el actor puede observar", OrtografiaFormulario.validar(),Matchers.equalTo(true)));

    }
}
