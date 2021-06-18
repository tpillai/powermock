package com.demo.powermock;

import com.demo.powermock.CalcStatic;
import com.demo.powermock.MyCalc;
import com.demo.powermock.Result;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.powermock.api.mockito.PowerMockito.mockStatic;
import static org.powermock.api.mockito.PowerMockito.when;

@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames="com.demo.powermock.*")
public class CalcTest {

    @Test
    public void mockFinals() {
        mockStatic(CalcStatic.class);
        when(CalcStatic.sum(Integer.valueOf(1),Integer.valueOf(1))).thenReturn(5);

        Result result = MyCalc.sum(1,1);
        assertEquals(new Result(1,1,5), result);
    }

}