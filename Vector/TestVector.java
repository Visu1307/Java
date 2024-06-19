import java.util.*;
class TestVector
{
	public static void main(String args[])
	{
		Vector v=new Vector();
		v.addElement(new Integer(13));
		v.addElement(new Float(13.7));
		v.addElement(new String("Visu"));
		v.addElement(new Long(130704));
		v.insertElementAt(new String("Bhatt"),1);
		v.removeElementAt(3);
		v.insertElementAt(new String("Vishwas"),1);
		System.out.println(v);		
	}
}