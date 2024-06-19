import java.applet.*;
import java.awt.*;
/*<applet code="Hi" width=200 height=200></applet>*/
public class Hi extends Applet
{
	public void paint(Graphics g)
	{
		setBackground(Color.blue);
		g.setColor(Color.yellow);
		//H
		g.drawLine(50,50,50,150);
		g.drawLine(50,100,90,100);
		g.drawLine(90,50,90,150);
		//i
		g.drawLine(120,50,160,50);
		g.drawLine(140,50,140,150);
		g.drawLine(120,150,160,150);
	}
}