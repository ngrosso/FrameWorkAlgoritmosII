package ElementosJuego;

public class Pieza{
	public String nombre;
	public char[] caracterParaPrintear;
	public int[][] movimientosValidos;
	public Jugador jugador;
	
	
	public Pieza(String nom,char[] caracter,int[][] movimientos,Jugador player){
		nombre=nom;
		caracterParaPrintear=caracter;
		movimientosValidos=movimientos;
		jugador=player;
	}
	public char caracterPieza(){
		return caracterParaPrintear[jugador.numero];
	}
	public boolean validarMovimiento(int x,int y,int nx,int ny){
		
		
		return true;
	}
}
