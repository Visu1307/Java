import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="TestFlow" height=400 width=400></applet>*/
public class TestFlow extends Applet implements ActionListener
{
	Button b1,b2,b3;
	List l1;
	public void init()
	{
		FlowLayout fl=new FlowLayout(FlowLayout.LEFT);
		setLayout(fl);
		b1=new Button("Studies");
		b1.addActionListener(this);
		add(b1);
		b2=new Button("Games");
		b2.addActionListener(this);
		add(b2);
		b3=new Button("Movies");
		b3.addActionListener(this);
		add(b3);
		l1=new List();
		add(l1);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String s=ae.getActionCommand();
		if(s.equals("Studies"))
		{
			l1.removeAll();
			l1.add("Java");
			l1.add("C#.NET");
			l1.add("Networking");
			l1.add("Linux");
			add(l1);
		}
		else if(s.equals("Games"))
		{
			l1.removeAll();
			l1.add("Fortnite");
			l1.add("Free Fire");
			l1.add("Clash Of Clans");
			l1.add("Subway Surfers");
			add(l1);
		}
		else if(s.equals("Movies"))
		{
			l1.removeAll();
			l1.add("Kantara");
			l1.add("RRR");
			l1.add("K.G.F Chapter-2");
			l1.add("Bahubali-2");
			add(l1);
		}
	}
}
		