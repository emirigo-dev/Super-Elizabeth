package juego;

import java.util.*;
import java.awt.Color;

import entorno.Entorno;
import entorno.InterfaceJuego;

public class Main extends InterfaceJuego {
	// El objeto Entorno que controla el tiempo y otros
	private Entorno entorno;
	private Princesa princesa;
	ArrayList<Soldado> soldado = new ArrayList<Soldado>();
	Soldado s1 = new Soldado(700, 460);
	Soldado s2 = new Soldado(1000, 460);
	Soldado s3 = new Soldado(1300, 460);
	Soldado s4 = new Soldado(1600, 460);

	// Variables y métodos propios de cada grupo
	// ...
	public void movimiento() {
		if (entorno.estaPresionada(entorno.TECLA_DERECHA)) {
			princesa.caminarDerecha();
		}
		if (entorno.estaPresionada(entorno.TECLA_IZQUIERDA)) {
			princesa.caminarIzquierda();
		}

	}

	public void soldadosTocanPared(Soldado soldado) {

		if (soldado.getX() + soldado.getAncho()/2 < 0) {
			soldado.volverParedIzquierda();
		}

	}

	Main() {

		// Inicializa el objeto entorno
		this.entorno = new Entorno(this, "Super Elizabeth Sis - Grupo ... - v1", 800, 600);
		this.princesa = new Princesa(100, 450);
		// Inicializar lo que haga falta para el juego
		// ...
		soldado.add(s1);
		soldado.add(s2);
		soldado.add(s3);
		soldado.add(s4);

		// Inicia el juego!
		this.entorno.iniciar();
	}

	/**
	 * Durante el juego, el método tick() será ejecutado en cada instante y por lo
	 * tanto es el método más importante de esta clase. Aquí se debe actualizar
	 * el estado interno del juego para simular el paso del tiempo (ver el enunciado
	 * del TP para mayor detalle).
	 */
	public void tick() {
		entorno.dibujarRectangulo(s1.getX(), s1.getY(), s1.getAncho(), s1.getAltura(), 0, Color.ORANGE);
		entorno.dibujarRectangulo(s2.getX(), s2.getY(), s2.getAncho(), s2.getAltura(), 0, Color.ORANGE);
		entorno.dibujarRectangulo(s3.getX(), s3.getY(), s3.getAncho(), s3.getAltura(), 0, Color.ORANGE);
		entorno.dibujarRectangulo(s4.getX(), s4.getY(), s4.getAncho(), s4.getAltura(), 0, Color.ORANGE);
		entorno.dibujarRectangulo(princesa.getX(), princesa.getY(), princesa.getAncho(), princesa.getAltura(), 0,
				Color.GREEN);
		entorno.dibujarRectangulo(400, 550, 850, 100, 0, Color.RED);
		movimiento();
		for (int i = 0; i < soldado.size(); i++) {
			soldado.get(i).movimiento();
			soldadosTocanPared(soldado.get(i));
		}

		// Procesamiento de un instante de tiempo
		// ...

	}

	public static void main(String[] args) {
		Main juego = new Main();
	}
}
