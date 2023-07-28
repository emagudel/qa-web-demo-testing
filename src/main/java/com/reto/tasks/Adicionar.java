package com.reto.tasks;

import com.reto.interactions.Seleccionar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.type.Type;

import static com.reto.userinterface.ProductoPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Adicionar implements Task {

    private String producto;

    public Adicionar(String producto) {
        this.producto = producto;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Seleccionar.elProducto(producto)
        );
        CANTIDAD.resolveFor(actor).clear();
        actor.attemptsTo(
                Type.theValue("2").into(CANTIDAD),
                Click.on(BOTON_AGREGAR_AL_CARRITO),
                Click.on(BOTON_AGREGAR_GARANTIA_1_AÑO),
                Click.on(SEGUIR_COMPRANDO)
        );
    }

    public static Adicionar unProductoAlCarrito(String producto){
        return instrumented(Adicionar.class, producto);
    }
}
