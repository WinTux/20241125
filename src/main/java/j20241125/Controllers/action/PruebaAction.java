package j20241125.Controllers.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
@Namespace("/prueba")
public class PruebaAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private int edad;
	private String nombre;
	private double estatura;
	private boolean disponible;
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	@Action(value="index", results= {
			@Result(name=SUCCESS, location="/WEB-INF/views/prueba/index.jsp")
	})
	public String index() {
		edad = 20;
		nombre = "Pepe";
		estatura = 1.79;
		disponible = true;
		return SUCCESS;
	}
}
