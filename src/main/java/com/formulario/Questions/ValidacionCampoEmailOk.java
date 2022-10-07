package com.formulario.Questions;

import com.formulario.UserInterface.PaginaPrinFormularioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionCampoEmailOk implements Question {
    @Override

    public Boolean answeredBy(Actor actor) {

        return PaginaPrinFormularioPage.VALIDACION_EMAIL_ERROR.resolveFor(actor).isVisible();
    }
    public static Question validar(){
        return new ValidacionCampoEmailOk();
    }
    }

