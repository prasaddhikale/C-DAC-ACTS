import java.util.Scanner;

class TestPoint{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		//First Point
		System.out.println("ENter two points X and Y ");
		Point2d p1 = new Point2d(sc.nextInt(),sc.nextInt());
		System.out.println(p1.show());
		//Second Point
		System.out.println("ENter two points X and Y ");
		Point2d p2 = new Point2d(sc.nextInt(),sc.nextInt());
		System.out.println(p2.show());
		//CHeck if two points are equal
		if(p1.isEqual(p2)){
			System.out.println("Two points are equal ");
		}
		//if points are not equal then show the distance between them
		else{
			System.out.println("Two Points are not equal ");	
			System.out.println("Distance between them is "+ p1.calcDistance(p2) );
		}

		sc.close();
	}
}