package service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BusinessServiceTest {

    @InjectMocks
    BusinessService businessService = new BusinessService();

    @Mock
    Service1 service1;

    @Mock
    Service2 service2;

    @Test
    public void testComplexBusiness() {

        //STEP 1-1 creating testing context
        //STEP 1-2 - "creating" mock + "injecting" mock
        //STEP 1-3 - define mock behaviour
        Mockito.when(service2.business2(3)).thenReturn(9);

        //STEP 2: defining input data + expected output data
        int a = 3;
        int expectedOutput = 10;

        //STEP 3: invoking testing method
        int actualResult = businessService.complexBusiness(a);

        //STEP 4: verifying input vs output
        Assertions.assertEquals(expectedOutput, actualResult);
    }
}
