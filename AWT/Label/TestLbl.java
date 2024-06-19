import java.applet.*;
import java.awt.*;
/*<applet code="TestLbl" width=150 height=150></applet>*/
public class TestLbl extends Applet
{
	public void init()
	{
		String li="LOGIC INFOTECH";
		Label lbl1=new Label(li,Label.LEFT);
		Label lbl2=new Label(li,Label.CENTER);
		Label lbl3=new Label(li,Label.RIGHT);
		add(lbl1);
		add(lbl2);
		add(lbl3);

	}
}