package com.reto.interactions;

import com.reto.tasks.EliminarPopup;
import com.reto.userinterface.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Abrir implements Interaction {

    private HomePage homePage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
              Open.browserOn(homePage)
        );
        actor.attemptsTo(
                EliminarPopup.enElHome()
        );
    }

    public static Performable elNavegador(){
        return instrumented(Abrir.class);
    }

}
