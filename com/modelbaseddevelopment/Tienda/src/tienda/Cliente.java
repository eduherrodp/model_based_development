package tienda;

class Cliente implements Suscriptor {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void recibirNotificacion(Producto producto) {
        System.out.println(this.nombre + ", el producto " + producto.getNombre() + " ha cambiado de precio.");
    }
}