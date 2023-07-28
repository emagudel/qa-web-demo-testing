package com.reto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.reto.userinterface.ProductoPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AdicionarAlAzar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SELECCIONAR_PRODUCTO_AL_AZAR, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(SELECCIONAR_PRODUCTO_AL_AZAR)
        );
        CANTIDAD.resolveFor(actor).clear();
        actor.attemptsTo(
                Type.theValue("2").into(CANTIDAD),
                Click.on(BOTON_AGREGAR_AL_CARRITO),
                Click.on(BOTON_AGREGAR_GARANTIA_1_AÑO),
                Click.on(SEGUIR_COMPRANDO)
        );
    }

    public static AdicionarAlAzar unProductoAlAzarAlCarrito(){
        return instrumented(AdicionarAlAzar.class);
    }
}
