package hospital;

public class Nurse {

    private String employeeNumber;
    private String name;
    private int numberOfPatients;

    public Nurse(String employeeNumber, String name, int numberOfPatients) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.numberOfPatients = numberOfPatients;
    }

    public void careForPatient(Patient sickPatient) {
        sickPatient.increaseHealthLevel(5);
    }

    public void drawBlood(Patient sickPatient) {
        sickPatient.decreaseBloodLevel(5);
    }

    public int calculatePay() {
        return 50000;
    }
}
