package hospital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SurgeonTest {

    Surgeon underTest = new Surgeon("3", "name", "specialty", true);
    Patient sickPatient = new Patient();

    @Test
    public void shouldIncreasehealthLevelFrom10To20WhenCaringForPatient() {
        underTest.careForPatient(sickPatient);
        int healthLevel = sickPatient.getHealthLevel();
        assertEquals(20, healthLevel);
    }

    @Test
    public void shouldDecreaseBloodLevelFrom20To15WhenDrawingBlood(){
        underTest.drawBlood(sickPatient);
        int patientBloodLevel = sickPatient.getBloodLevel();
        assertEquals(15,patientBloodLevel);
    }

    @Test
    public void shouldExpectASalaryOf120k(){
        int salary = underTest.calculatePay();
        assertEquals(120000, salary);
    }

}
