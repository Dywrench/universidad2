package co.edu.konradlorenz.controller;

import java.util.ArrayList;
import java.util.Iterator;

import co.edu.konradlorenz.model.Estudiante;
import co.edu.konradlorenz.view.Ventana;

public class Control {
	protected Estudiante objEst = new Estudiante();
	protected Ventana objView = new Ventana();
	private ArrayList <Estudiante> lista = new ArrayList();
	
	public void run() {
		String menu = "Señor usuario digite la opción que desea realizar"
				+"1.crear"
				+"leer"
				+"actualizar"
				+"borrar";
		int op = Ventana.pedirEntero(menu);
		do {
			switch (op) {
			case 1: {
				crearEstudiante();
				break;
			}case 2: {
				buscarEstudiante();
				break;
			}case 3: {
				modificarEstudiante();
				break;
			}case 4: {
				borrarEstudiante();
				break;
			}case 5: {
				objView.mostrarEstudiante("Adios");
				break;
			}
			default:
				objView.mostrarEstudiante("opción Invalida");
			}
		} while (op!=5);
	}
	
	

	private void borrarEstudiante() {
		int pos = buscarEstudiante();
		if(pos <= lista.size()) {
			lista.remove(pos);
		}
		else {
			objView.mostrarEstudiante("El estudiante no existe");
		}
		
	}



	private void modificarEstudiante() {
		int pos = buscarEstudiante();
		if(pos <= lista.size()) {
		lista.get(pos).setNombre(Ventana.pedirString("Digite el nuevo nombre"));
		lista.get(pos).setCarrera(Ventana.pedirString("Digite la nueva carrera"));
		objView.mostrarEstudiante(null);
		}
		else {
			objView.mostrarEstudiante("El estudiante no existe");
		}
	}

	private int buscarEstudiante() {
		objView.mostrarEstudiante("Buscar Estudiate \n");
		long codEst = Ventana.pedirLong();
		for (int i =0; i<lista.size();i++) {
			if(codEst == lista.get(i).getCodigo()) {
				objView.mostrarEstudiante(lista.get(i).toString());
				return i;
			}
		}
		 objView.mostrarEstudiante("Estudiante no encontrado");
		 return lista.size()+1;
	}

	public void crearEstudiante() {
		objView.mostrarEstudiante("Crear Estudiate \n");
		String n,c;
		long cod;
		n = Ventana.pedirString("Digite el nombre del estudiante");
		c = Ventana.pedirString("Digite el nombre de  la carrera");
		cod = Ventana.pedirLong();
		objEst = new Estudiante (n,cod,c);
		lista.add(objEst);
	}
}
