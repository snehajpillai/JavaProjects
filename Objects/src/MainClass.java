class Point { 
	public int x;
	public int y;
}


public class MainClass {
public static void main(String[] args) {
	Point points[]=new Point[3];
	points[0]=new Point();
	points[0].x=2;
	points[0].y=3;
	points[2]=new Point();
	points[2].x=5;
	points[2].y=6;
	for(Point point: points) {
		if(point!=null) {
			System.out.println(point.x+","+point.y);
		}
	}
}
}
