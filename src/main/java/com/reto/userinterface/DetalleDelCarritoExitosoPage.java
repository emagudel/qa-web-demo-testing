package com.reto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class DetalleDelCarritoExitosoPage {

    public static final Target RESUMEN_DE_LA_ORDEN =
            the("Resumen de la orden")
                    .located(By.id("pricing"));

}
