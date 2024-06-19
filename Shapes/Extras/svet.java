import java.applet.*;
import java.awt.*;
/*<applet code="svet" height=200 width=250></applet>*/
public class svet extends Applet
{
	public void paint(Graphics g)
	{
		setBackground(Color.green);
		// x1, y1, x2, y2                                                                                                                                                                                                                                                                                                                                                                                                                             
		g.drawLine(20,50,60,50);
		g.drawLine(20,50,20,100);
		g.drawLine(20,100,60,100);
		g.drawLine(60,100,60,150);
		g.drawLine(60,150,20,150);
		g.drawLine(80,50,100,150);
		g.drawLine(100,150,120,50);
		g.drawLine(140,50,140,150);
		g.drawLine(140,50,180,50);
		g.drawLine(140,100,180,100);
		g.drawLine(140,150,180,150);
		g.drawLine(200,50,240,50);
		g.drawLine(220,50,220,150);
		//g.drawLine(20,160,240,160);
	}
}