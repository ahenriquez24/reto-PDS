# language: es
# autor: Angel H

@HU
Característica: Carga pagina de practica de automatizacion
  Como usuario quiero realizar compras de libros.

  @CargaProducto
  Escenario: Cargar productos en carrito
    Dado que ingreso la pagina de practice.automation
    Cuando carga los libros al carrito eliminando el de mayor costo
    Entonces verifica sea menor a "400" el valor final de la compra
