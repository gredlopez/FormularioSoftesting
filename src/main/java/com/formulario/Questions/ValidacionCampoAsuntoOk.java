package com.formulario.Questions;

import com.formulario.UserInterface.PaginaPrinFormularioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionCampoAsuntoOk implements Question {
    @Override

    public Boolean answeredBy(Actor actor) {

        return PaginaPrinFormularioPage.VALIDACION_ASUNTO_OK.resolveFor(actor).isVisible();
    }
    public static Question validar(){
        return new ValidacionCampoAsuntoOk();
    }
    }

