import java.applet.*;
import java.awt.*;
/*<applet code="TestShapes" height=300 width=300></applet>*/
public class TestShapes extends Applet
{
	public void paint(Graphics g)
	{
		setBackground(Color.black);
		g.setColor(Color.white);
		//Inner Triangle With Lines
		g.drawLine(50,200,250,200);
		g.drawLine(50,200,150,50);
		g.drawLine(150,50,250,200);
		//Inner Rectangle
		g.drawRect(110,115,80,80);
		//Outer Circle
		g.drawOval(35,45,230,230);
	}
}