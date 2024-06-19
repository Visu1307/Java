import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="TestChoice" height=150 width=150></applet>*/
public class TestChoice extends Applet implements ItemListener
{
	Label lbl1,lbl2;
	public void init()
	{
		lbl1=new Label("Select Your Stream:-");
		add(lbl1);
		Choice c=new Choice();
		c.addItem("B.C.A");
		c.addItem("B.B.A");
		c.addItem("B. Com.");
		c.addItem("B.A");
		c.addItemListener(this);
		add(c);
		lbl2=new Label("			");
		add(lbl2);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		Choice c1=(Choice)ie.getItemSelectable();
		lbl2.setText(c1.getSelectedItem());
	}
}
