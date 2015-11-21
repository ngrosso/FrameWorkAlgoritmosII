package Principal;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Main
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Motor motor = new Motor();
		try
		{
		//Parseamos XML
		File fXmlFile = new File("src/configFile/configXMLFile.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		
			dBuilder=dbFactory.newDocumentBuilder();
		

		Document doc = dBuilder.parse(fXmlFile);
		
		doc.getDocumentElement().normalize();
		
		Element raizElemento = doc.getDocumentElement();
		NodeList listaNodos = raizElemento.getChildNodes();
		
		if li
		
		
		
		}
		catch(ParserConfigurationException ex)
		{
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		catch(SAXException ex)
		{
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		catch(IOException ex)
		{
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}

	}

}
