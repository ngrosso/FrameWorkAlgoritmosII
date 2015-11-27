package ElementosJuego;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="juego")
@XmlAccessorType(XmlAccessType.NONE)
public class Juego
{	
	public Tablero tablero;
	public String chequearVictoria;
	public Pieza[] piezasParaCopiar;
	
	
	
	public Juego()
	{
	}

	public Juego(Tablero tablero,String chequearVictoria,Pieza[] piezasParaCopiar)
	{
		this.tablero=tablero;
		this.chequearVictoria=chequearVictoria;
		this.piezasParaCopiar=piezasParaCopiar;
	}

	public void setTablero(Tablero tablero)
	{
		this.tablero=tablero;
	}
	@XmlElement
	public String getChequearVictoria()
	{
		return chequearVictoria;
	}

	public void setChequearVictoria(String chequearVictoria)
	{
		this.chequearVictoria=chequearVictoria;
	}
	@XmlElement
	public Pieza[] getPiezas()
	{
		return piezasParaCopiar;
	}

	public void setPiezas(Pieza[] piezasParaCopiar)
	{
		this.piezasParaCopiar=piezasParaCopiar;
	}
	@XmlElement
	public Tablero getTablero()
	{
		return tablero;
	}

}
