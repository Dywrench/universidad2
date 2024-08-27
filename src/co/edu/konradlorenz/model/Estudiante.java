package co.edu.konradlorenz.model;

public class Estudiante {
 private String nombre;
 private long codigo;
 private String carrera;
public Estudiante(String nombre, long codigo, String carrera) {
	
	this.nombre = nombre;
	this.codigo = codigo;
	this.carrera = carrera;
}
public Estudiante() {
	
	
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public long getCodigo() {
	return codigo;
}
public void setCodigo(long codigo) {
	this.codigo = codigo;
}
public String getCarrera() {
	return carrera;
}
public void setCarrera(String carrera) {
	this.carrera = carrera;
}
@Override
public String toString() {
	return "Estudiante [nombre=" + nombre + ", codigo=" + codigo + ", carrera=" + carrera + "]";
}

 
}
