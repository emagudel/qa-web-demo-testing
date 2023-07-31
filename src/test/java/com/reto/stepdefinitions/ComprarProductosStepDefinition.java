package com.reto.stepdefinitions;

import com.reto.interactions.Abrir;
import com.reto.questions.DetalleDelCarrito;
import com.reto.tasks.*;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ComprarProductosStepDefinition {

    @Dado("que {word} ingresa a la pagina para comprar")
    public void queElUsuarioIngresaAlaPaginaDeCompra(String nombreActor) {
        theActorCalled(nombreActor).wasAbleTo(
                Abrir.elNavegador()
        );
    }

    @Y("selecciona la categoria {string} y subcategoria {string}")
    public void seleccionalacategoriaSubcategoria(String categoria, String subCategoria) {
        withCurrentActor(Seleccionar.unaCategoria_y_Subcategoria(categoria, subCategoria));
    }

    @Y("selecciona otra categoria {string} y otra subcategoria {string}")
    public void seleccionaOtracategoriaOtraSubcategoria(String categoria, String subCategoria) {
        withCurrentActor(Seleccionar.unaCategoria_y_Subcategoria(categoria, subCategoria));
    }

    @Cuando("el usuario agrega al carrito el producto {string}")
    public void elUsuarioAgregaAlCarritoElProducto(String producto) {
        withCurrentActor(Adicionar.unProductoAlCarrito(producto));
    }

    @Entonces("el usuario deberia de ver el detalle del carrito exitosamente")
    public void elUsuarioDeberiaDeVerElDetalleExitosamente() {
        theActorInTheSpotlight().should(seeThat(DetalleDelCarrito.esExitoso()));
    }

}
