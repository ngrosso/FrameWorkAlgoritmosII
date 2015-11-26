package ElementosJuego;

import Common.Coordenadas;

public class Pieza{
	public String nombre;
	public char[] caracterParaPrintear;
	public Coordenadas[] movimientosValidos;
	public int jugador;
	
	
	public Pieza(String nom,char[] caracter,Coordenadas[] movimientos,int player){
		nombre=nom;
		caracterParaPrintear=caracter;
		movimientosValidos=movimientos;
		jugador=player;
	}
	public Pieza(String nom,char[] caracter,Coordenadas[] movimientos){
		nombre=nom;
		caracterParaPrintear=caracter;
		movimientosValidos=movimientos;
	}
	public Pieza clonar(){
		Pieza pieza= new Pieza(getNombre(),getCaracterParaPrintear(),getMovimientosValidos(),getJugador());
		return pieza;
	}
	public char caracterPieza(){
		return caracterParaPrintear[jugador];
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
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	public char[] getCaracterParaPrintear()
	{
		return caracterParaPrintear;
	}
	public void setCaracterParaPrintear(char[] caracterParaPrintear)
	{
		this.caracterParaPrintear=caracterParaPrintear;
	}
	public Coordenadas[] getMovimientosValidos()
	{
		return movimientosValidos;
	}
	public void setMovimientosValidos(Coordenadas[] movimientosValidos)
	{
		this.movimientosValidos=movimientosValidos;
	}
	public int getJugador()
	{
		return jugador;
	}
	public void setJugador(int jugador)
	{
		this.jugador=jugador;
	}
	
}
