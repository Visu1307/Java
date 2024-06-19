import java.applet.*;
import java.awt.*;
/*<applet code="TestLine" height=300 width=300></applet>*/
public class TestLine extends Applet
{
	public void paint(Graphics g)
	{
		setBackground(Color.black);
		g.setColor(Color.white);
		//drawLine(int x1, y1, x2, y2)
		g.drawLine(100,50,100,150);	//Vertical Line
		g.drawLine(100,150,200,150);	//Horizantal Line

	}
}