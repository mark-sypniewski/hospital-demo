package hospital;

public class Surgeon extends Doctor {

    private boolean isOperating;


    public Surgeon(String employeeNumber, String name, String specialty, boolean isOperating) {
        super(employeeNumber, name, specialty);
    }

    @Override
    public int calculatePay() {
        return 120000;
    }
}
