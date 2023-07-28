package com.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class ProductoPage extends PageObject {

    public static final Target SELECCIONAR_PRODUCTO_AL_AZAR = the("Seleccionar producto").located(By.xpath("//*[@id='testId-searchResults-products']/child::div[1]//*[contains(text(),'Televisor')]"));
    public static final Target SELECCIONAR_PRODUCTO = the("Seleccionar producto").located(By.xpath("//*[@id=\"testId-searchResults-products\"]/div"));
    public static final Target BOTON_AGREGAR_AL_CARRITO = the("Boton de carrito").located(By.id("buttonForCustomers"));
    public static final Target BOTON_AGREGAR_GARANTIA_1_AÑO = the("Boton de carrito").located(By.id("testId-InCart-inPDP-WarrantyOption-btn-1"));
    public static final Target CANTIDAD = the("Cantidad de articulos").located(By.id("quantity-selector-increment-input"));
    public static final Target SEGUIR_COMPRANDO = the("Seguir comprando").located(By.xpath("//button[text()='Seguir comprando']"));

}

