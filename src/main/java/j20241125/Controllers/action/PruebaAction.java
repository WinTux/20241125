package j20241125.Controllers.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import j20241125.Models.Producto;
@Namespace("/prueba")
public class PruebaAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	private int edad;
	private String nombre;
	private double estatura;
	private boolean disponible;
	
	private Producto prod;
	
	private List<Producto> prods;
	// Para envío de parámetros desde URL
	private String valor1;
	public String getValor1() {
		return valor1;
	}
	public void setValor1(String valor1) {
		this.valor1 = valor1;
	}
	public int getValor2() {
		return valor2;
	}
	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}
	public String getValor3() {
		return valor3;
	}
	public void setValor3(String valor3) {
		this.valor3 = valor3;
	}
	private int valor2;
	private String valor3;
	
	public List<Producto> getProds() {
		return prods;
	}
	public void setProds(List<Producto> prods) {
		this.prods = prods;
	}
	public Producto getProd() {
		return prod;
	}
	public void setProd(Producto prod) {
		this.prod = prod;
	}
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
	
	@Action(value="ejemploobjetos", results= {
			@Result(name=SUCCESS, location="/WEB-INF/views/prueba/ejobjetos.jsp")
	})
	public String ejobjetos() {
		prod = new Producto("prod123","Atún Tuny", "atun.jpg",13.5,12);
		return SUCCESS;
	}
	@Action(value="ejemplolistaobjetos", results= {
			@Result(name=SUCCESS, location="/WEB-INF/views/prueba/ejlistaobjetos.jsp")
	})
	public String ejListaObjetos() {
		prods = new ArrayList<Producto>();
		prods.add(new Producto("prod01","Atún Tuny", "atun.jpg",13.5,12));
		prods.add(new Producto("prod02","Atún Van Camps", "atun2.png",21,24));
		prods.add(new Producto("prod03","Atún Lidita", "atun3.jpg",12,5));
		return SUCCESS;
	}
	@Action(value="ejemplourl", results= {
			@Result(name=SUCCESS, location="/WEB-INF/views/prueba/ejemplourl.jsp")
	})
	public String ejurl() {
		// Método usado para el ejemplo de paráetros por URL (Query strings)
		System.out.println("Valor 1: "+ valor1);
		return SUCCESS;
	}
	@Action(value="acercade", results= {
			@Result(name=SUCCESS, location="/WEB-INF/views/prueba/acercade.jsp")
	})
	public String acercade() {
		// Método usado para el ejemplo de paráetros por URL (Query strings)
		System.out.println("Valor 2: "+ valor2);
		System.out.println("Valor 3: "+ valor3);
		return SUCCESS;
	}
	@Action(value="contacto", results= {
			@Result(name=SUCCESS, location="/WEB-INF/views/prueba/contacto.jsp")
	})
	public String contacto() {
		
		return SUCCESS;
	}
	
	@Action(value="redireccion", results= {
			@Result(name=SUCCESS, type="redirectAction", params={"namespace","/prueba","actionName","exitoRedirec1"})
	})
	public String paraRedireccion() {
		
		return SUCCESS;
	}
	@Action(value="exitoRedirec1", results= {
			@Result(name=SUCCESS, location="/WEB-INF/views/prueba/exito1.jsp")
	})
	public String exito1() {
		
		return SUCCESS;
	}
	@Action(value="redireccion2", results= {
			@Result(name=SUCCESS, type="redirectAction", params={"namespace","/prueba","actionName","exitoRedirec2", "valor1","${valor1}", "valor2","${valor2}"})
	})
	public String paraRedireccion2() {
		
		return SUCCESS;
	}
	@Action(value="exitoRedirec2", results= {
			@Result(name=SUCCESS, location="/WEB-INF/views/prueba/exito2.jsp")
	})
	public String exito2() {
		System.out.println("valor 1: "+valor1);
		System.out.println("valor 2: "+valor2);
		return SUCCESS;
	}
}
