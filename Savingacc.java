import java.util.*;
abstract class Bankaccount
{
    int bal;
    public Bankaccount()
    {
        this.bal=1000;
    }
    abstract void deposit();
    abstract void  withdrawl();


}

class Savingacc extends Bankaccount
{
    int mo;
    
    Savingacc(int m)
    {
        
        this.mo=m;
    }
    void deposit()
    {   
        super.bal+=mo;
        System.out.println(bal);

    }
    void withdrawl()
    {
        if (mo<super.bal)
        {   super.bal-=mo;
             System.out.println("done");
        }
        else
        {
            System.out.println("no balance");
        }
    }

    public static void main(String arg[])
    {
        Savingacc s=new Savingacc(1000);
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
     do {
            
            System.out.println("\nSelect an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            
            val = sc.nextInt();
            
            switch (val) {
                case 1:
                    s.deposit();
                    break;
                case 2:
                    s.withdrawl(); 
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (val != 3); 
        
        sc.close(); 
    }
    
    }
    
