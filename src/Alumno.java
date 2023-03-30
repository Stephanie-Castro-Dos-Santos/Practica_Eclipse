
public class Alumno {
	String nombre;
	String apellido;
	String dni;
	
	Alumno(String nom, String ap, String dni){
		this.nombre=nom;
		this.apellido=ap;
		this.dni=dni;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
	}
	
	
}
