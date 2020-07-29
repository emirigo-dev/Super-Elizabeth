package juego;

import java.awt.Color;

import entorno.Entorno;

public class Princesa {

	private Entorno entorno;
	private double x;
	private double y;
	private double altura;
	private double ancho;
	private int direccion;

	public Princesa(int x, int y) {
		this.x = x;
		this.y = y;
		this.altura = 100;
		this.ancho = 45;
		this.direccion = 1;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getAltura() {
		return altura;
	}

	public double getAncho() {
		return ancho;
	}

	public int getDireccion() {
		return direccion;
	}

	public void dibujate() {
		entorno.dibujarCirculo(this.x, this.y, 3, Color.GREEN);
	}

	public void caminarDerecha() {
		this.x++;
	}

	public void caminarIzquierda() {
		this.x--;
	}

}
