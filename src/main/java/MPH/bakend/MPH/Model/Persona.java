package MPH.bakend.MPH.Model;

import java.util.ArrayList;
import java.util.List;

public class Persona {
	private String nombre;
	private int edad;
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	private List<Persona> getGente(){
		List<Persona> gente= new ArrayList<>();
		gente.add(new Persona("Joe",47));
		gente.add(new Persona("Julio",45));
		gente.add(new Persona("Aldo",40));
		gente.add(new Persona("Raul",42));
		return gente;
		}
}


