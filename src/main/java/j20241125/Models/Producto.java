package j20241125.Models;

public class Producto {
	private String id;
	private String nombre;
	private String foto;
	private double precio;
	private int cantidad;
	public Producto(String id, String nombre, String foto, double precio, int cantidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.foto = foto;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
