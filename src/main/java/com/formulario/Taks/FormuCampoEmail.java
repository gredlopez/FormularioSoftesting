package com.formulario.Taks;


import com.formulario.Utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.formulario.UserInterface.PaginaPrinFormularioPage.TXT_EMAIL;
import static com.formulario.UserInterface.PaginaPrinFormularioPage.TXT_TU_NOMBRE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FormuCampoEmail implements Task {


    Datos datos = new Datos();
    static final String NOMBRE_EXCEL = "SimulacroFormulario.xlsx";
    private static final String HOJA_EXCEL = "Formulario";

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {

            actor.attemptsTo(
                    Enter.theValue(datos.leerDatosExcel(NOMBRE_EXCEL,HOJA_EXCEL,1,1)).into(TXT_EMAIL)
            );

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static FormuCampoEmail FormuCampoEmail ()
    {
        return instrumented(FormuCampoEmail.class);
    }

}
