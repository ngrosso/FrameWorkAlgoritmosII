package ElementosJuego;

public class Juego
{	
	public Tablero tablero;
	public String chequearVictoria;
	public Pieza[] piezas;
	
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
		return piezas;
	}

	public void setPiezas(Pieza[] piezas)
	{
		this.piezas=piezas;
	}

	public Tablero getTablero()
	{
		return tablero;
	}

}
