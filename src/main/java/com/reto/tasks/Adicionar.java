package com.reto.tasks;

import com.reto.interactions.Seleccionar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
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
                Scroll.to(BOTON_AGREGAR_AL_CARRITO),
                Click.on(BOTON_AGREGAR_AL_CARRITO)
        );
        if(BOTON_AGREGAR_GARANTIA_2_AÑO.isVisibleFor(actor)){
            actor.attemptsTo(
                    Scroll.to(BOTON_AGREGAR_GARANTIA_2_AÑO),
                    Click.on(BOTON_AGREGAR_GARANTIA_2_AÑO),
                    Scroll.to(SEGUIR_COMPRANDO),
                    Click.on(SEGUIR_COMPRANDO)
            );
        }else{
            actor.attemptsTo(
                    Scroll.to(SEGUIR_COMPRANDO),
                    Click.on(SEGUIR_COMPRANDO)
            );
        }

    }

    public static Adicionar unProductoAlCarrito(String producto){
        return instrumented(Adicionar.class, producto);
    }
}
