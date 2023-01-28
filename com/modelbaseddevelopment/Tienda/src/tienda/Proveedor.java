package tienda;

interface Proveedor {
    void suscribir(Suscriptor suscriptor, Producto producto);
    void notificarDisponibilidad(Producto producto);
}
