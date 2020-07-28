package juego;

import java.awt.Color;

import entorno.Entorno;

public class Soldado {

	private Entorno entorno;
	private double x;
	private double y;
	private double altura;
	private double ancho;
	
	public Soldado (int x, int y) {
		this.x = x;
		this.y = y;
		this.ancho = 3;
		this.altura = 10;
	}
	
	public void dibujate() {
		entorno.dibujarCirculo(this.x, this.y, 12, Color.BLUE);
	}
	
	
}
