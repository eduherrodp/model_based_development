package modelbaseddevelopment.store.provider;

import modelbaseddevelopment.store.product.Producto;
import modelbaseddevelopment.store.suscriptor.Suscriptor;

interface Proveedor {
    void notificarDisponibilidad(Producto producto);
    void suscribir(Suscriptor suscriptor, Producto producto);
}
