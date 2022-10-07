package com.formulario.Questions;

import com.formulario.UserInterface.PaginaPrinFormularioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class OrtografiaFormulario implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {

        return (PaginaPrinFormularioPage.LABEL_MENSAJE.resolveFor(actor).getText().equals("Mensaje")
        && (PaginaPrinFormularioPage.LABEL_BARRIO.resolveFor(actor).getText().equals("Barrio")));


    }
    public static Question validar(){
        return new OrtografiaFormulario();
    }
}

