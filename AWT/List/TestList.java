import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="TestList" height=150 width=220></applet>*/
public class TestList extends Applet implements ItemListener
{
	Label lbl1,lbl2;
	public void init()
	{
		lbl1=new Label("Programming Languages in B.C.A:-");
		add(lbl1);
		List l1=new List();
		l1.add("C Language");
		l1.add("HTML, CSS, JS");
		l1.add("Advance C");
		l1.add("PHP");
		l1.add("C++");
		l1.add("Oracle");
		l1.add("WordPress");
		l1.add("Java");
		l1.add("C#.NET");
		l1.add("ASP.NET");
		l1.add("Android");
		l1.add("Phython");
		l1.addItemListener(this);
		add(l1);
		lbl2=new Label("					");
		add(lbl2);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		List ls=(List)ie.getItemSelectable();
		lbl2.setText(ls.getSelectedItem());
	}
}
		