package com.demo.powermock;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames="com.demo.powermock.*") 
public class PowerMockMockitoTests {

    @Test
    public void mockStaticAndFinalClassAndStaticFinalMethod() {
        mockStatic(CalcStatic.class);
        when(CalcStatic.sum(Integer.valueOf(1),Integer.valueOf(1))).thenReturn(5);

        int result = CalcStatic.sum(Integer.valueOf(1),Integer.valueOf(1));
        assertEquals(5, result);
    }

}
