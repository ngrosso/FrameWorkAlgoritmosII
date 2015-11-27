package ElementosJuego;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import groovy.util.Eval;
import Common.Coordenadas;
import errores.ErrorValidacionPieza;
import errores.ErrorValidacionTablero;

@XmlAccessorType(XmlAccessType.NONE)
public class Tablero{
	public Casillero[][] casilleros;
	public String codigoMovimiento;
	public String codigoColocacion;

	public Tablero(int x, int y){
		casilleros =new Casillero[x][y];	
		
	}
	
	
	public Tablero()
	{
	}


	public Tablero(Casillero[][] casilleros,String codigoMovimiento,String codigoColocacion)
	{
		this.casilleros=casilleros;
		this.codigoMovimiento=codigoMovimiento;
		this.codigoColocacion=codigoColocacion;
	}


	public void moverFicha(int x, int y,int nx,int ny,int jugador,Juego juego) throws ErrorValidacionTablero, ErrorValidacionPieza{
		if (casilleros[x][y].getPiezas()[jugador].validarMovimiento(nx-x,ny-y)) {
			Coordenadas[] coordenadas =new Coordenadas[]{new Coordenadas(x,y),new Coordenadas(nx,ny)};
			if (!((Boolean)Eval.xyz(coordenadas,jugador,juego,getCodigoMovimiento()))){
				throw new ErrorValidacionTablero("movimiento invalido (en tablero)");
			}
		}
		else{
			throw new ErrorValidacionPieza("movimiento invalido (en pieza)");
		}
	}
	@XmlElement
	public Casillero[][] getCasilleros()
	{
		return casilleros;
	}

	public void setCasilleros(Casillero[][] casilleros)
	{
		this.casilleros=casilleros;
	}
	@XmlElement
	public String getCodigoMovimiento()
	{
		return codigoMovimiento;
	}

	public void setCodigoMovimiento(String codigoMovimiento)
	{
		this.codigoMovimiento=codigoMovimiento;
	}
	@XmlElement
	public String getCodigoColocacion()
	{
		return codigoColocacion;
	}

	public void setCodigoColocacion(String codigoColocacion)
	{
		this.codigoColocacion=codigoColocacion;
	}
	
	
}
