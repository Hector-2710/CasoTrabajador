package Main;

import Dominio.AFP;
import Dominio.Isapre;
import Dominio.Trabajador;
import Interfaces.VentanaUsuario;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {

		//para probar la ventana de usuario

		AFP afp = new AFP();
		Isapre isapre = new Isapre();
		Trabajador trabajador = new Trabajador(isapre, afp, "Juan", "Perez", "12345678");

		VentanaUsuario vu = new VentanaUsuario(trabajador);
	}
}