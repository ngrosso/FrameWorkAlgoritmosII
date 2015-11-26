package ElementosJuego;
import groovy.util.Eval;
import Common.Coordenadas;
import errores.ErrorValidacionPieza;
import errores.ErrorValidacionTablero;

public class Tablero{
	public Pieza[][] piezas;
	public String codigoMovimiento;
	public String codigoColocacion;

	public Tablero(int x, int y){
		piezas =new Pieza[x][y];
		
	}
	
	public void moverFicha(int x, int y,int nx,int ny) throws ErrorValidacionPieza,ErrorValidacionTablero{
		if (piezas[x][y].validarMovimiento(nx-x,ny-y)) {
			Coordenadas coor =new Coordenadas(x,y);
			Coordenadas coorFinal = new Coordenadas(nx,ny);
			if (!((Boolean)Eval.xyz(getPiezas(),coor,coorFinal,getCodigoMovimiento()))){
				throw new ErrorValidacionTablero("movimiento invalido (en tablero)");
			}
		}
		else{
			throw new ErrorValidacionPieza("movimiento invalido (en pieza)");
		}
	}

	public Pieza[][] getPiezas()
	{
		return piezas;
	}

	public void setPiezas(Pieza[][] piezas)
	{
		this.piezas=piezas;
	}

	public String getCodigoMovimiento()
	{
		return codigoMovimiento;
	}

	public void setCodigoMovimiento(String codigoMovimiento)
	{
		this.codigoMovimiento=codigoMovimiento;
	}

	public String getCodigoColocacion()
	{
		return codigoColocacion;
	}

	public void setCodigoColocacion(String codigoColocacion)
	{
		this.codigoColocacion=codigoColocacion;
	}
	
	
}
