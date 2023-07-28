package com.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class CategoriaSubCategoria extends PageObject {

    public static final Target CATEGORIA =
            the("Categoria")
                    .locatedBy("//*[@class='TaxonomyDesktop-module_scrollWrapper__3Pu06']//*[text()='{0}']");
    public static final Target SUBCATEGORIA =
            the("SubCategoria")
                    .locatedBy("//*[@class='SecondLevelCategories-module_subCategoryContent__3L7Af']//*[text()='{0}']");

}
