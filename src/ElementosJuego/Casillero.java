package ElementosJuego;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class Casillero
{
	public Pieza[] piezas;

	public Casillero(Pieza[] piezas)
	{
		
		this.piezas=piezas;
	}
	public Casillero( )
	{
		piezas=null;		
	}
	@XmlElement
	public Pieza[] getPiezas()
	{
		return piezas;
	}
	public void setPiezas(Pieza[] piezas)
	{
		this.piezas=piezas;
	}
	
}
