package Lab2c;

public class MobileComputer extends Computer implements Chargeable{
    private int battey;
    public MobileComputer() {
        secret = "Mobile computer secrete";
        battey = 5;
    }
    @Override
    public void work() {
        if (battey > 0) {
            System.out.println("It is working on my lap.");
            battey--;
        } else
            System.out.println("Running out of battery");
    }
    public void charge(){
        if (battey<10) battey++;
    }
}
