package com.reto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

import static com.reto.userinterface.DetalleDelCarritoExitosoPage.RESUMEN_DE_LA_ORDEN;
import static com.reto.userinterface.HomePage.BOTON_CARRITO;

public class DetalleDelCarrito implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                Click.on(BOTON_CARRITO)
        );
        return RESUMEN_DE_LA_ORDEN.resolveFor(actor).isVisible();
    }

    public static DetalleDelCarrito esExitoso(){
        return new DetalleDelCarrito();
    }
}
