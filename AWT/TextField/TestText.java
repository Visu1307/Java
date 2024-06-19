import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="TestText" height=400 width=200></applet>*/
public class TestText extends Applet implements ActionListener
{
	TextField nm,ps;
	TextArea ad;
	Button b1;
	public void init()
	{
		Label lbl1=new Label("Name:-");
		add(lbl1);
		nm=new TextField(15);
		add(nm);
		Label lbl2=new Label("Address:-");
		add(lbl2);
		ad=new TextArea("",10,20);
		add(ad);
		Label lbl3=new Label("Pass:-");
		add(lbl3);
		ps=new TextField(10);
		ps.setEchoChar('*');
		add(ps);
		b1=new Button("Sign In");
		add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("Name Is:-"+nm.getText(),20,320);
		g.drawString("Address Is:-"+ad.getText(),20,340);
		g.drawString("Password Is:-"+ps.getText(),20,370);
	}
}
		