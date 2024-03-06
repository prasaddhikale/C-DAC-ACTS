/*Create a  class Point2D   for representing a point in x-y co-ordinate system.

4.1 Create a parameterized constructor to accept x & y co-ords.

4.2 Add  show() method  --to return point's x & y co-ords
eg : public String show() {.....}

4.3 (Optional work)
Add a non static  , isEqual method to Point2D class : boolean returning method : must return true if both points are having same x,y co-ords or false otherwise.

How will you invoke it from the tester 
A Hint : 

eg : p1.isEqual(p2); 
OR
p2.isEqual(p1)

4.4 (Optional work)
Add a non static method , calculateDistance , to calc distance between 2 points
Hint : use distance formula.

eg : In Tester :
double distance=p1.calculateDistance(p2);

4.5  Create a driver  class(for UI )  , "TestPoint" , with main(..)

4.6  Accept x,y co-ordinates for 2 points n store the co-ordinates
4.7  Display x,y co-ordinates of both of the points plotted  (using show() method)
4.8  (Optional work)
Find out if the points  are same or different (Hint : isEqual)
Print the message accordingly. (print SAME or DIFFERENT)
If points are not same , display distance between these 2 points
*/

class Point2d{
	int x,y;
	Point2d(int x,int y){
		this.x=x;
		this.y=y;
	}
	public String show(){
		return "X,Y = " + x +","+ y ;
		 
	}
	
	boolean isEqual(Point2d obj){
		if(obj.x == this.x && obj.y == this.y){
			return true;
			//System.out.println(" Points are equal " );
		}
		else{
			return false;
			//System.out.println(" Points are not equal ");
		}
		
	}

	double calcDistance(Point2d obj){
		//d=√((x2 – x1)² + (y2 – y1)²)
		
		return ( Math.sqrt(((obj.x - x)*(obj.x - x)) + ((obj.y - y)*(obj.y - y))) );
	}



}