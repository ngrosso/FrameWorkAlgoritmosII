package ElementosJuego;

import Common.Coordenadas;

public class Pieza{
	public String nombre;
	public char[] caracterParaPrintear;
	public Coordenadas[] movimientosValidos;
	public Jugador jugador;
	
	
	public Pieza(String nom,char[] caracter,Coordenadas[] movimientos,Jugador player){
		nombre=nom;
		caracterParaPrintear=caracter;
		movimientosValidos=movimientos;
		jugador=player;
	}
	public char caracterPieza(){
		return caracterParaPrintear[jugador.numero];
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
}
