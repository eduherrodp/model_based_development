package Tienda;

interface Proveedor {
    void suscribir(Suscriptor suscriptor, Producto producto);
    void notificarDisponibilidad(Producto producto);
}
