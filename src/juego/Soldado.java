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
		this.ancho = 45;
		this.altura = 90;
	}
	
	public void dibujate() {
		entorno.dibujarCirculo(this.x, this.y, 12, Color.BLUE);
	}

	public Entorno getEntorno() {
		return entorno;
	}

	public void setEntorno(Entorno entorno) {
		this.entorno = entorno;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public void movimiento() {
		this.x --;
	}
	public void volverParedIzquierda() {
		this.x = 1100;
	}
	
	
}
