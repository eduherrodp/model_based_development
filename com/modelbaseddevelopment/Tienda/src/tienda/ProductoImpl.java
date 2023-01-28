package tienda;

class ProductoImpl implements Producto {
    private String nombre;
    private String descripcion;
    private double precio;
    private boolean disponible;
    private final Tienda tienda;

    public ProductoImpl(String nombre, String descripcion, double precio, boolean disponible, Tienda tienda) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.disponible = disponible;
        this.tienda = tienda;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
        this.tienda.notificarDisponibilidad(this);
    }

    @Override
    public boolean isDisponible() {
        return disponible;
    }

    @Override
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
        this.tienda.notificarDisponibilidad(this);
    }
}