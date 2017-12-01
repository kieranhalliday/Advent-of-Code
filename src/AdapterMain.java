public class AdapterMain {

    public static void main(String[] args) {
        AdapterMain adapterMain = new AdapterMain();
        adapterMain.start();
    }


    // Client
    private void start() {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter();

        adaptee.setAccountNumber(1234);
        System.out.println("The credit card number is " + target.getCreditCardNumber());

    }
}

// Target Class
interface Target {
    String getCreditCardNumber();
}

// Adapter Class
class Adapter extends Adaptee implements Target {

    @Override
    public String getCreditCardNumber() {
        return String.valueOf(getAccountNumber());
    }
}

// Adaptee Class
class Adaptee {
    private long accountNumber;

    long getAccountNumber() {
        return accountNumber;
    }

    void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
}


