package Day3;

public class account {

    String name;
    double balance;

    account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account Holder Name is " + this.name);
        System.out.println("Account Balance is " + this.balance);
    }

    public static void main(String[] args) {
        new account("Hari", 5000).display();
    }
}

