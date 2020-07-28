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
	
	public Princesa (int x , int y) {
		this.x = x;
		this.y = y;
		this.altura = 100;
		this.ancho = 45;
		this.direccion = 1;
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

	public int getDireccion() {
		return direccion;
	}

	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}

	public void dibujate () {
		entorno.dibujarCirculo(this.x, this.y, 3, Color.GREEN);
	}
	
}
