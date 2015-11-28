package Principal;

import errores.ErrorValidacionPieza;
import errores.ErrorValidacionTablero;
import groovy.util.Eval;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import Common.Coordenadas;
import ElementosJuego.Juego;
import ElementosJuego.Pieza;

public class Motor{
public Juego juego;


public Motor()
{
	
}

public void inicializarJuego () throws JAXBException{
	JAXBContext jc = JAXBContext.newInstance(Juego.class);
	Unmarshaller unmarshaller = jc.createUnmarshaller();
	File xml = new File("src/Common/configFile.xml");
	this.juego=(Juego)unmarshaller.unmarshal(xml);
}

public Juego getJuego()
{
	return juego;
}

public void setJuego(Juego juego)
{
	this.juego=juego;
}

public void correrJuego(){
	System.out.println("ingresa 'h' para obtener ayuda");
	int turno,x,y,z,zz,i,j,k;
	turno=1;
	try
	{
		this.inicializarJuego();
	}
	catch(JAXBException ex)
	{
		System.out.println("Fallo al iniciar");
		ex.printStackTrace();
	}
	while (true){
		
		System.out.println("ingresa un comando");
	    try
		{
	    	BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			String s = bufferRead.readLine();
			s=s.toLowerCase();
			Pieza ficha= this.getJuego().getPiezasParaCopiar()[0].clonar();
			switch (s){
				case "h":	
						System.out.println("los comandos no son case sensitive y son los siguientes");
						System.out.println("'h' para ver comandos");
						System.out.println("'salir' para salir");
						System.out.println("'poner' para poner una pieza, luego pide el ingreso de las coordenadas");
						System.out.println("'mover' para mover una pieza, pide dos pares de coordenadas");
						continue;
				case "salir":
					Runtime.getRuntime().exit(0);
				case "poner":
					System.out.println("ingrese dos valores para las coordenadas");
					System.out.println("ingrese el primero");
					x = Integer.parseInt(bufferRead.readLine());
					System.out.println("ingrese el segundo");
					y = Integer.parseInt(bufferRead.readLine());
					Coordenadas coordenada=new Coordenadas(x,y);
					if ((boolean)Eval.xyz(coordenada,turno,getJuego(),getJuego().getTablero().getCodigoColocacion())){
						break;
					}else{
						throw new ErrorValidacionTablero("colocacion invalida");
						
					}
					
				case "mover":
					System.out.println("ingrese 4 valores para las coordenadas de la pieza y su destino");
					System.out.println("ingrese el primero");
					x = Integer.parseInt(bufferRead.readLine());
					System.out.println("ingrese el segundo");
					y = Integer.parseInt(bufferRead.readLine());
					System.out.println("ingrese el tercero");
					z = Integer.parseInt(bufferRead.readLine());
					System.out.println("ingrese el cuarto");
					zz = Integer.parseInt(bufferRead.readLine());
					juego.getTablero().moverFicha(x,y,z,zz,turno,getJuego());
					break;
				
			}
			for(i=0;i<getJuego().getTablero().getCasilleros().length;i++){
				for(j=0;j<getJuego().getTablero().getCasilleros()[i].length;j++){
					if (getJuego().getTablero().getCasilleros()[i][j].getPiezas()[turno]!=null){
						for (k=0;k<2;k++){
							Pieza pieza=getJuego().getTablero().getCasilleros()[i][j].getPiezas()[k];
							if(pieza.getNombre()!=null){
							System.out.print(Character.toString(getJuego().getTablero().getCasilleros()[i][j].getPiezas()[k].caracterPieza()));
							}
						}
					}else{
						System.out.print(" |");
					}
				}
				System.out.println("");
				for(i=0;i<getJuego().getTablero().getCasilleros().length;i++){
					System.out.print("---");
				}
				System.out.println("");
			}
			Eval.xy(getJuego(),turno,getJuego().getChequearVictoria());
			if (turno==1){
				turno =2;
			}else{
				turno=1;
			}
		}
		catch(IOException ex)
		{
			
			System.out.println("fallo al leer comando");
			ex.printStackTrace();
		}
		catch(ErrorValidacionTablero ex)
		{
			ex.printStackTrace();
			continue;
		}
		catch(ErrorValidacionPieza ex)
		{
			ex.printStackTrace();
			continue;
		}
	    
	}
	
}
}
