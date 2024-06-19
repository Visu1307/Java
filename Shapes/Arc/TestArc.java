import java.awt.*;
import java.applet.*;
/*<applet code="TestArc" height=200 width=200></applet>*/
public class TestArc extends Applet
{
	public void paint(Graphics g)
	{
		setBackground(Color.gray);
		g.setColor(Color.white);
		//drawArc(int x,int y,int width,int height,int arc_width,int arc_height);
		g.drawArc(80,50,80,80,200,200);
		g.drawArc(30,50,80,80,200,200);
	}
}