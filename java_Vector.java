import java.util.*;

public class java_Vector
{
	public static void main(String[] args)
	{
		Vector v1 = new Vector();
		Integer integer1 = new Integer(1);
		v1.addElement("one");
		v1.addElement(integer1);
		v1.addElement(integer1);
		v1.addElement(new Integer(2));
		v1.addElement("two");
		System.out.println("向量："+v1);
		//在制定位置2插入元素three
		v1.insertElementAt("three", 2);
		//修改位置3的元素为setElement
		v1.setElementAt("setElement", 3);
		System.out.println("向量："+v1);
		v1.removeElementAt(0);
		Enumeration enum1 = v1.elements();
		while(enum1.hasMoreElements())
		{
			System.out.println(enum1.nextElement()+ " ");
		}
		System.out.println("向量："+v1);
		System.out.println("向底部方向查找元素two ："+v1.indexOf("two"));
		System.out.println("向顶部方向查找元素2 ："+v1.lastIndexOf(2));
	}
}