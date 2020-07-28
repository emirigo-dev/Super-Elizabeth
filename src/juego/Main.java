package juego;


import java.awt.Color;

import entorno.Entorno;
import entorno.InterfaceJuego;

public class Main extends InterfaceJuego
{
	// El objeto Entorno que controla el tiempo y otros
	private Entorno entorno;
	private Princesa princesa;
	private Soldado soldado;
	
	// Variables y métodos propios de cada grupo
	// ...
	
	Main()
	{
		// Inicializa el objeto entorno
		this.entorno = new Entorno(this, "Super Elizabeth Sis - Grupo ... - v1", 800, 600);
		this.princesa = new Princesa (100, 425);
		// Inicializar lo que haga falta para el juego
		// ...
		this.soldado = new Soldado (400, 300);

		// Inicia el juego!
		this.entorno.iniciar();
	}

	/**
	 * Durante el juego, el método tick() será ejecutado en cada instante y 
	 * por lo tanto es el método más importante de esta clase. Aquí se debe 
	 * actualizar el estado interno del juego para simular el paso del tiempo 
	 * (ver el enunciado del TP para mayor detalle).
	 */
	public void tick()
	{
		
		entorno.dibujarRectangulo(princesa.getX(), princesa.getY(), princesa.getAncho(), princesa.getAltura(), 0, Color.GREEN);
		entorno.dibujarRectangulo(400, 550, 850, 150, 0, Color.RED);
		// Procesamiento de un instante de tiempo
		// ...
		

	}
	

	public static void main(String[] args)
	{
		Main juego = new Main();
	}
}
