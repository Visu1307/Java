import java.awt.*;
import java.applet.*;
/*<applet code="TestOval" height=200 width=200></applet>*/
public class TestOval extends Applet
{
	public void paint(Graphics g)
	{
		setBackground(Color.yellow);
		g.setColor(Color.blue);
		//drawOval(int x,int y,int width,int height)
		g.drawOval(50,50,100,100);
		g.drawOval(75,75,50,50);
	}
}