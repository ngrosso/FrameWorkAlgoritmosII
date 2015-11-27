package Principal;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import Common.Coordenadas;
import ElementosJuego.Casillero;
import ElementosJuego.Juego;
import ElementosJuego.Pieza;
import ElementosJuego.Tablero;


public class Main
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Motor motor= new Motor();
		motor.correrJuego();
		
	}

}
