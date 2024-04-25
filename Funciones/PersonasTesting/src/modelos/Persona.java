package modelos;

public class Persona {
	
	//Atributos
	
	
	String nombre;
	String apellidos;
	int edad;
	
	/**
	 * 
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 */
	public Persona(String nombre, String apellidos,int edad){
		if(edad > 130 || edad < 0) {
			throw new IllegalArgumentException("Edad imposible");
		}
		else {
			
		}
	}
	
	public String MostrarEdad(Persona persona) {
		if(persona.getEdad() < 18) {
			return "Menor de edad";
		}
		else if(persona.getEdad() >= 18 && persona.getEdad() <= 65) {
			return "Mayor de edad";
		}
		else {
			return "Jubilado";
		}
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public void setEdad(int edad) {
		this.edad = edad;
		
		
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellidos;
	}
	public int getEdad() {
		return edad;
	}

}
