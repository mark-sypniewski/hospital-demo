package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NurseTest {

    Nurse underTest = new Nurse("2", "name", 6);
    Patient sickPatient = new Patient();

    @Test
    public void shouldIncreseHealthLevelOfPatientFrom10To15whenProvidingCare() {
        underTest.careForPatient(sickPatient);
        int patientHealthLevel = sickPatient.getHealthLevel();
        assertEquals(15, patientHealthLevel);
    }

    @Test
    public void shouldDecreaseBloodLevelFrom20To15WhenDrawingBlood() {
        underTest.drawBlood(sickPatient);
        int patientBloodLevel = sickPatient.getBloodLevel();
        assertEquals(15, patientBloodLevel);
    }

    @Test
    public void shouldExpectASalaryOf50k() {
        int salary = underTest.calculatePay();
        assertEquals(50000, salary);
    }

}
