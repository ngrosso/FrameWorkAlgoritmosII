package Common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.NONE)
public class Coordenadas
{
public int x;
public int y;



public Coordenadas()
{
}
public Coordenadas(int i,int j)
{
	x=i;
	y=j;
}
@XmlAttribute
public int getX()
{
	return x;
}
public void setX(int x)
{
	this.x=x;
}
@XmlAttribute
public int getY()
{
	return y;
}
public void setY(int y)
{
	this.y=y;
}


}
