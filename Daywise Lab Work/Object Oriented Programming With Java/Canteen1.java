
import java.util.Scanner;
class Canteen1{
    public static void main(String args[]){
   
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int totalamt=0;
        int qty =0;
        while (!exit)
        {
            
            System.out.println("\nEnter you choice 1. Dosa 20rs 2. Samosa 10rs 3. Idli 20rs 4.Sweet 20rs 5.PaniPuri 30rs\n 10.GenerateBill ");
            
            switch(sc.nextInt()){
                case 1: {
                    System.out.println("Enter Quantity : ");
                    qty = sc.nextInt();
                    System.out.println("Item Dosa added");

                    totalamt=totalamt+(20*qty);
                    // System.out.println("Total Bill is "+ totalamt);
                    break;
                }
                case 2: {
                    System.out.println("Enter Quantity : ");
                    qty = sc.nextInt();
                    System.out.println("Item Samosa Added ");
                    totalamt=totalamt+10*qty;
                    // System.out.println("Total Bill is "+ totalamt);
                    break;
                    
                }
                case 3: {
                    System.out.println("Enter Quantity : ");
                    qty = sc.nextInt();
                    System.out.println("Item Idli Added ");
                    totalamt=totalamt+20*qty;
                    // System.out.println("Total Bill is "+ totalamt);
                    break;
                }
                case 4: {
                    System.out.println("Enter Quantity : ");
                    qty = sc.nextInt();
                    System.out.println("Item Sweet Added ");
                    totalamt=totalamt+20*qty;
                    // System.out.println("Total Bill is "+ totalamt);
                    break;
                }
                case 5: {
                    System.out.println("Enter Quantity : ");
                    qty = sc.nextInt();
                    System.out.println("Item PaniPuri Added ");
                    totalamt=totalamt+30*qty;
                    // System.out.println("Total Bill is "+ totalamt);
                    break;
                }
              
                case 10: {
                    System.out.println("Total Bill is "+ totalamt);
                    exit=true;
                    break;
                }
                
                default:
                    System.out.println("Enter valid Input");
                    exit=true;
                    break;
            }
        }
        
        
        sc.close();
    }
} 
    