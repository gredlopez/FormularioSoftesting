package com.formulario.Questions;

import com.formulario.UserInterface.PaginaPrinFormularioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionCampoBarrioOk implements Question {
    @Override

    public Boolean answeredBy(Actor actor) {

        return PaginaPrinFormularioPage.VALIDACION_BARRIO.resolveFor(actor).isVisible();
    }
    public static Question validarBarrio(){
        return new ValidacionCampoBarrioOk();
    }
    }

