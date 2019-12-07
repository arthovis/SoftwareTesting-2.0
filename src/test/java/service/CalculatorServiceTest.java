package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorServiceTest {
    // partea de before este pt STEP 1
    CalculatorService calculatorService;

    @BeforeEach
    public void setUp(){
        calculatorService = new CalculatorService();
    }

    @Test
    public void testSum() {

//         STEP 1: creating testing context

        // STEP 2: defining input data + expected output data
        int i1 = 1;
        int i2 = 2;
        int expectedResult = 3;

        // STEP 3: invoking testing method
        int actualResult = calculatorService.sum(i1, i2);

        // STEP 4: verifying input vs output
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumException() {

        // STEP 1: creating testing context

        // STEP 2: defining input data + expected output data
        int i1 = -1;
        int i2 = 2;

        // STEP 3: invoking testing method combined with STEP 4 for exceptions
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> calculatorService.sum(i1, i2));
        Assertions.assertEquals("Fuck off, cap de vita furajata!", exception.getMessage());

    }

    @ParameterizedTest
    @CsvSource({"0,0,-1","1,1,-1","2,2,-2"})
    public void testSumParticularValues(int i1, int i2, int expectedResult) {

        // STEP 1: creating testing context


        // STEP 2: defining input data + expected output data

        // STEP 3: invoking testing method
        int actualResult = calculatorService.sum(i1, i2);

        // STEP 4: verifying input vs output
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
