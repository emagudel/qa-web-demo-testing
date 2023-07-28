package com.reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static com.reto.userinterface.CategoriaSubCategoria.CATEGORIA;
import static com.reto.userinterface.CategoriaSubCategoria.SUBCATEGORIA;
import static com.reto.userinterface.HomePage.MENU;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarAlAzar implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MENU),
                MoveMouse.to(CATEGORIA.of("Tecnología")),
                Click.on(SUBCATEGORIA.of("Smart TV"))
        );
    }

    public static SeleccionarAlAzar unaCategoria_y_Subcategoria(){
        return instrumented(SeleccionarAlAzar.class);
    }
}
