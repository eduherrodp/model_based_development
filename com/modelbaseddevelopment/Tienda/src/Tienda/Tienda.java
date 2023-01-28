package Tienda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Tienda implements Proveedor {
    private String nombre;
    private Map<Producto, List<Suscriptor>> suscriptores;

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.suscriptores = new HashMap<>();
    }

    @Override
    public void suscribir(Suscriptor suscriptor, Producto producto) {
        if (!this.suscriptores.containsKey(producto)) {
            this.suscriptores.put(producto, new ArrayList<>());
        }
        this.suscriptores.get(producto).add(suscriptor);
    }

    @Override
    public void notificarDisponibilidad(Producto producto) {
        if (this.suscriptores.containsKey(producto)) {
            for (Suscriptor suscriptor : this.suscriptores.get(producto)) {
                suscriptor.recibirNotificacion(producto);
            }
        }
    }
}
