package ElementosJuego;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import Common.Coordenadas;
@XmlAccessorType(XmlAccessType.NONE)
public class Pieza{
	public String nombre;
	public char[] caracterParaPrintear;
	public Coordenadas[] movimientosValidos;
	public int jugador;
	
	

	public Pieza()
	{
	}

	public Pieza(String nombre,char[] caracterParaPrintear,Coordenadas[] movimientosValidos,int jugador)
	{
		this.nombre=nombre;
		this.caracterParaPrintear=caracterParaPrintear;
		this.movimientosValidos=movimientosValidos;
		this.jugador=jugador;
	}
	
	public Pieza(String nombre,char[] caracterParaPrintear,Coordenadas[] movimientosValidos)
	{
		this.nombre=nombre;
		this.caracterParaPrintear=caracterParaPrintear;
		this.movimientosValidos=movimientosValidos;
	}

	public Pieza clonar(){
		Pieza pieza= new Pieza(getNombre(),getCaracterParaPrintear(),getMovimientosValidos());
		return pieza;
	}
	public char caracterPieza(){
		return caracterParaPrintear[jugador-1];
	}
	public boolean validarMovimiento(int xcoor,int ycoor){

		for (int i=0; i< movimientosValidos.length;i++){
			if (movimientosValidos[i].x == xcoor & 
				movimientosValidos[i].y == ycoor) {
			return true;
			}
		}
		return false;
	}
	@XmlAttribute
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	@XmlElement
	public char[] getCaracterParaPrintear()
	{
		return caracterParaPrintear;
	}
	public void setCaracterParaPrintear(char[] caracterParaPrintear)
	{
		this.caracterParaPrintear=caracterParaPrintear;
	}
	@XmlElement
	public Coordenadas[] getMovimientosValidos()
	{
		return movimientosValidos;
	}
	public void setMovimientosValidos(Coordenadas[] movimientosValidos)
	{
		this.movimientosValidos=movimientosValidos;
	}
	@XmlAttribute
	public int getJugador()
	{
		return jugador;
	}
	public void setJugador(int jugador)
	{
		this.jugador=jugador;
	}
	
}
