import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="TestCheck" width=150 height=150></applet>*/
public class TestCheck extends Applet implements ItemListener
{
	Label lbl1,lbl2;
	public void init()
	{
		lbl1=new Label("Select Your Hobbies:-");
		add(lbl1);
		Checkbox cb1=new Checkbox("Reading");
		cb1.addItemListener(this);
		add(cb1);
		Checkbox cb2=new Checkbox("Writing");
		cb2.addItemListener(this);
		add(cb2);
		Checkbox cb3=new Checkbox("Sleeping");
		cb3.addItemListener(this);
		add(cb3);
		Checkbox cb4=new Checkbox("Gaming");
		cb4.addItemListener(this);
		add(cb4);
		lbl2=new Label("				");
		add(lbl2);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		Checkbox cb=(Checkbox)ie.getItemSelectable();
		lbl2.setText(cb.getLabel());
	}
}