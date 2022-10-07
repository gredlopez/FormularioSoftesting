package com.formulario.Questions;

import com.formulario.UserInterface.PaginaPrinFormularioPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionCampoNombreOk implements Question {
    @Override

    public Boolean answeredBy(Actor actor) {

        return PaginaPrinFormularioPage.VALIDACION_NOMBRE_OK.resolveFor(actor).isVisible();
    }
    public static Question validar(){
        return new ValidacionCampoNombreOk();
    }
    }

