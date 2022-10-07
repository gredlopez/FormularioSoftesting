package com.formulario.Taks;


import com.formulario.Utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.formulario.UserInterface.PaginaPrinFormularioPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FormuCamposAsuntMsj implements Task {


    Datos datos = new Datos();
    static final String NOMBRE_EXCEL = "SimulacroFormulario.xlsx";
    private static final String HOJA_EXCEL = "Formulario";

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {

            actor.attemptsTo(
                    Enter.theValue(datos.leerDatosExcel(NOMBRE_EXCEL,HOJA_EXCEL,1,3)).into(TXT_ASUNTO),
                    Scroll.to(TXT_MENSAJE),
                    Enter.theValue(datos.leerDatosExcel(NOMBRE_EXCEL,HOJA_EXCEL,1,4)).into(TXT_MENSAJE)
            );

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static FormuCamposAsuntMsj FormuCampoAsuntMensaje ()
    {
        return instrumented(FormuCamposAsuntMsj.class);
    }

}
