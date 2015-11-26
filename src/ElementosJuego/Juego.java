package ElementosJuego;


public class Juego
{	
	public Tablero tablero;
	public String chequearVictoria;
	public Pieza[] piezasParaCopiar;
	
	public void setTablero(Tablero tablero)
	{
		this.tablero=tablero;
	}

	public String getChequearVictoria()
	{
		return chequearVictoria;
	}

	public void setChequearVictoria(String chequearVictoria)
	{
		this.chequearVictoria=chequearVictoria;
	}

	public Pieza[] getPiezas()
	{
		return piezasParaCopiar;
	}

	public void setPiezas(Pieza[] piezasParaCopiar)
	{
		this.piezasParaCopiar=piezasParaCopiar;
	}

	public Tablero getTablero()
	{
		return tablero;
	}

}
