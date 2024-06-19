import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="TestBorder" height=250 width=250></applet>*/
public class TestBorder extends Applet
{
	TextArea ta;
	Label lbl1;
	Button b1,b2,b3;
	public void init()
	{
		setLayout(new BorderLayout(5,5));
		b1=new Button("Top");
		lbl1=new Label("Footer");
		b2=new Button("Left");
		b3=new Button("Right");
		ta=new TextArea();
		add(b1,BorderLayout.NORTH);
		add(b2,BorderLayout.WEST);
		add(b3,BorderLayout.EAST);
		add(ta,BorderLayout.CENTER);
		add(lbl1,BorderLayout.SOUTH);
	}
	public Insets getInsets()
	{
		return new Insets(50,50,50,50);
	}
}	