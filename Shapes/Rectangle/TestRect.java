import java.awt.*;
import java.applet.*;
/*<applet code="TestRect" height=200 width=200></applet>*/
public class TestRect extends Applet
{
	public void paint(Graphics g)
	{
		setBackground(Color.green);
		g.setColor(Color.red);
		//drawRect(int x,int y, int height, int width);
		g.drawRect(50,50,100,100);	//Outer Rectangle
		g.drawRect(75,75,50,50);	//Inner Rectangle
	}
}