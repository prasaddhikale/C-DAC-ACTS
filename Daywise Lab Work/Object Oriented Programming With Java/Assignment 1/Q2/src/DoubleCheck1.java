
import java.util.Scanner;

class DoubleCheck1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int cnt=1;
	double sum=0;
	System.out.println("Enter two double type numbers");
        while(cnt<=2){
        
	   
            if(sc.hasNextDouble()){
                sum=sum+sc.nextDouble();
            }
            else{
                System.out.println("Enter a double. ");
		System.exit(0);
            }
            
        
		cnt++;
        }
	System.out.println("AVerage = " + (sum/2));
        
        sc.close();
    }

}
