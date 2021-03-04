 package ex;

class MyPoint{
	int x;
	int y;
}
//포함
//class Circle{
//	MyPoint p = new MyPoint();
//	int r;
//}

//상속
class Circle extends MyPoint{
	int r;
}


public class InheritanceTest {

	public static void main(String[] args) {
		Circle c = new Circle();
//		c.p.x = 1;
//		c.p.y = 2;
//		c.r = 3;
//		System.out.println(c.p.x);
//		System.out.println(c.p.y);
		c.x=1;
		c.y=2;
		c.r=3;
		System.out.println(c.x);
		System.out.println(c.y);
		System.out.println(c.r);
	}

}
