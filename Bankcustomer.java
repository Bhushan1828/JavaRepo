class BankCustomer {
    int acno;
    String atype;
    int amt;

    // Two-argument constructor
    BankCustomer(int account, String name) {
        this.acno = account;
        this.atype = name;
        this.amt = 0;  // Default amount if not provided
    }

    // Three-argument constructor
    BankCustomer(int account, String name, int amount) {
        this.acno = account;
        this.atype = name;
        this.amt = amount;
    }

    void display() {
        System.out.println("Account Number: " + acno + ", Account Type: " + atype + ", Amount: " + amt);
    }

    public static void main(String args[]) {
        BankCustomer b1 = new BankCustomer(11222, "Saving");
        b1.display();

        BankCustomer b2 = new BankCustomer(112223, "Saving", 123439383);
        b2.display();
    }
}
