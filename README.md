# Proyecto Base Screenplay Web - SerenityBDD

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

Este repositorio contiene un escenario de compra de productos, ejemplo ya realizado con Page Object Model + Page Factory (el ejemplo puedes encontrarlo en el siguiente repositorio y rama ([Page Object Model - Rama Page Factory](https://github.com/ingjuanfg/page_object_model_automation_project/tree/page_factory "Page Object Model - Rama Page Factory")).


## Contenido

- Automatización Screenplay Web
- Ejecución por Terminal


## Automatización Screenplay Web

En la rama principal [master](https://github.com/emagudel/qa-web-demo-testing "master") encontrarás 1 escenario, para agregar los productos al carrito.

## Ejecución por Terminal

Para ejecutar y generar la documentación viva, basta con que por medio de una terminal en la ruta donde esta el proyecto ejecutes la siguiente linea:

`gradle clean test aggregate`

Si no cuentas con gradle configurado en tu maquina, usa el wrapper.

`./gradlew clean test aggregate`

Con esta instrucción limpias el proyecto de archivos temporales, ejecuta los test y genera la documentación viva.

Una vez ejecutado, puedes verificar las evidencias en la ruta:

`.../target/site/serenity/index.html`

