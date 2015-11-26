package Principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import ElementosJuego.Juego;

public class Motor{
public Juego juego;
	
public void inicializarJuego () throws JAXBException{
	JAXBContext jc = JAXBContext.newInstance(Juego.class);
	Unmarshaller unmarshaller = jc.createUnmarshaller();
	File xml = new File("src/Common/configFile.xml");
	this.juego=(Juego)unmarshaller.unmarshal(xml);
}
public void correrJuego(){
	System.out.println("ingresa 'h' para obtener ayuda");
	int turno =1;
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
			switch (s){
				case "h":	System.out.println("los comandos no son case sensitive y son los siguientes");
							System.out.println("'h' para ver comandos");
							System.out.println("'salir' para salir");
							System.out.println("'poner' para poner una pieza, luego pide el ingreso de las coordenadas");
							System.out.println("'mover' para mover una pieza, pide dos pares de coordenadas");
							break;
				
			}
		}
		catch(IOException ex)
		{
			
			System.out.println("fallo al leer comando");
			ex.printStackTrace();
		}
	    
	}
	
}
}
