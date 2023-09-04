import java.util.*;
 class User_acc {
    private float balance;
    User_acc(){
        this.balance=0;
    }
    public void operation (){
        System.out.println("Enter the operation:\n1.Check Balance\n2.Deposit\n3.Withdrawal\n4.CLOSE");
        Scanner scan=new Scanner(System.in);
        int inp=scan.nextInt();
        if(inp==1){
            this.balance();
        }
        else if(inp==2){
            System.out.println("Enter the amount to be deposited");
            float addi=scan.nextFloat();
            this.deposit(addi);
        }
        else if(inp==3){
            System.out.println("Enter the amount to withdraw");
            float withd=scan.nextFloat();
            if(withd<=this.balance)
             this.withdraw(withd);
            else{
                System.out.println("Insufficient balance to withdraw");
                operation();
            }
        }else if(inp==4){
            return;
        }else{
            System.out.println("Invalid input!");
            operation();
        }
    }
    private void balance(){
        System.out.println("Current balance:"+this.balance);
        operation();
    }
    private void deposit(float num){
        this.balance+=num;
        this.balance();
        operation();
     }
    private void withdraw(float num){
        this.balance-=num;
        this.balance();
        operation();
    }

}
