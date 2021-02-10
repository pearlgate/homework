package ex;

public class Point {
	int x , y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	String getLocation() {
		return "X : "+ ", "+x+"y :"+y; 
	}
	
}

class Point3D extends Point{
	int z;
	Point3D(int x, int y, int z){
		//조상의 생성자를 호출해서 초기화. 
		super(x, y);
		this.z = z;
	}
	String getLocation() {
		return "X : "+ ", "+x+"y :"+y + "z :"+z;
	}
}
