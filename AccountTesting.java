class Account{
    int id;
    int balance;
    public Account(int id,int balance){
        this.id=id;
        this.balance=balance;
    }
    public int getid(){
        return id;
    }
    public int getbalance(){
        return balance;
    }
    public void setid(int id){
        this.id=id;
    }
    public void setbalance(int balance){
        this.balance=balance;
    }
    public void deposit(int amount){
        this.balance+=amount;
    }
    public void withdraw(int amount){
        if(amount>this.balance)
        System.out.println("Withdraw amount is greater than the balance amount");
        else
        this.balance-=amount;
    }
}
public class bm{
    public static void main(String[] args){
        Account a=new Account(101,500);
        Account b=new Account(102,1000);
        System.out.println("Before Transaction ");
        System.out.println("--------------------");
        System.out.println("ID  | Balance");
        System.out.println(a.getid()+" | "+a.getbalance());
        System.out.println(b.getid()+" | "+b.getbalance());
        System.out.println("====================");
        System.out.println("");
        a.deposit(1000);
        b.deposit(500);
        System.out.println("After deposit       ");
        System.out.println("--------------------");
        System.out.println("ID  | Balance");
        System.out.println(a.getid()+" | "+a.getbalance());
        System.out.println(b.getid()+" | "+b.getbalance());
        System.out.println("====================");
        System.out.println("");
        a.withdraw(200);
        b.withdraw(300);
        System.out.println("After withdraw       ");
        System.out.println("--------------------");
        System.out.println("ID  | Balance");
        System.out.println(a.getid()+" | "+a.getbalance());
        System.out.println(b.getid()+" | "+b.getbalance());
        System.out.println("====================");
    }
}