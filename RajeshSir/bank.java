public class bank {

    String name;
    int AccountNumber;
    int age;
    int Withdraw;

    bank(String N,int ANumber,int Sage,int WWithdraw) {
        name=N;
    AccountNumber=ANumber;
     age=Sage;
     Withdraw=WWithdraw;

    }

    public void name(String name) {
        System.out.println("Name: " + name);

    }

    public void AccountNumber(int acc) {
        System.out.println("Account Number: " + acc);
    }

    public void age(int age) {
        System.out.println("Age: " + age);
    }

    public void Withdraw(int With) {

        System.out.println("Enter Your Withdrawal: " + With);

    }

}
