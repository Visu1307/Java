import java.applet.*;
import java.awt.*;
/*<applet code="first_app" width=200 height=200></applet>*/
public class first_app extends Applet
{
	public void paint(Graphics g)
	{
		setBackground(Color.red);
		g.drawString("Hello World",80,90);
	}
}