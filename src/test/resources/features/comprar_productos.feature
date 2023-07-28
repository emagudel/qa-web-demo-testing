#language:es

Característica: Compra de productos
  Yo como usuario quiero agregar productos al carrito
  Para realizar la compra

  Esquema del escenario: Comprar un producto de manera exitosa
    Dado que <nombre> ingresa a la pagina para comprar
    Y selecciona la categoria "Tecnología" y subcategoria "Portátiles"
    Cuando el usuario agrega al carrito el producto "Portátil"
    Y selecciona otra categoria "Electrohogar" y otra subcategoria "Nevecones"
    Cuando el usuario agrega al carrito el producto "Nevecones"
    Entonces el usuario deberia de ver el detalle del carrito exitosamente
    Ejemplos:
      | nombre  |
      | Juan    |