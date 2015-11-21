package Principal;

import ElementosJuego.Juego;
import ElementosJuego.Tablero;

public class Motor{
public Juego juego;

public void instanciarPiezaEnTablero(){
	
}
public void instanciarJuego(){
	
}
public void instanciarTablero(int x, int y){
	Tablero tablero= new Tablero(x,y);
	juego.setTablero(tablero);
}
}
