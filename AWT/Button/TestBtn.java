import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="TestBtn" width=180 height=100></applet>*/
public class TestBtn extends Applet implements ActionListener
{
	Label lbl1;
	public void init()
	{
		Button b1=new Button("B.C.A");
		add(b1);
		b1.addActionListener(this);
		Button b2=new Button("B.B.A");
		add(b2);
		b2.addActionListener(this);
		Button b3=new Button("B. Com.");
		add(b3);
		b3.addActionListener(this);
		lbl1=new Label("				");
		add(lbl1);	
	}
	public void actionPerformed(ActionEvent ae)
	{
		lbl1.setText(ae.getActionCommand());
	}
}