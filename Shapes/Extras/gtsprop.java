import java.applet.*;
import java.awt.*;
/*<applet code="gtsprop" height=400 width=1000></applet>*/
public class gtsprop extends Applet
{
	public void paint(Graphics g)
	{
		setBackground(Color.black);
		g.setColor(Color.white);
		g.setFont(new Font("Arial",Font.BOLD,20));
		g.drawString("GT's House",150,35);
		g.setFont(new Font("Arial",Font.BOLD,20));
		g.drawString("GT's Car",600,100);
		g.drawRect(100,150,200,200);
		//x1, y1, x2, y2
		g.drawLine(50,150,350,150);
		g.drawLine(50,150,200,50);
		g.drawLine(200,50,350,150);
		g.drawLine(170,350,170,250);
		g.drawLine(230,350,230,250);
		g.drawLine(170,250,230,250);
		g.drawRect(120,180,30,30);
		g.drawRect(240,180,30,30);
		g.drawLine(260,90,260,50);
		g.drawLine(280,105,280,50);	
		g.drawLine(260,50,280,50);
		g.drawLine(450,250,850,250);	
		//g.drawLine(450,325,850,325);
		g.drawLine(450,250,450,325);
		g.drawLine(850,250,830,325);
		g.drawOval(500,300,65,65);
		g.drawOval(505,305,55,55);
		g.drawOval(725,300,65,65);
		g.drawOval(730,305,55,55);
		g.drawLine(450,325,500,325);
		g.drawLine(565,325,725,325);
		g.drawLine(790,325,830,325);
		g.drawLine(525,250,570,180);
		g.drawLine(570,180,720,180);
		g.drawLine(720,180,760,250);
		g.drawLine(565,190,725,190);
		g.drawLine(645,190,645,250);
		g.drawLine(450,270,460,270);
		g.drawLine(460,270,460,290);
		g.drawLine(460,290,450,290);
	}
}